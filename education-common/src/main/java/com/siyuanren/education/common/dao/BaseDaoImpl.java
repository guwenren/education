package com.siyuanren.education.common.dao;

import com.alibaba.druid.pool.DruidDataSource;

import com.siyuanren.education.common.entity.BaseEntity;
import com.siyuanren.education.common.exception.BaseException;
import com.siyuanren.education.common.mybatis.interceptor.ExecutorInterceptor;
import com.siyuanren.education.common.page.PageBean;
import com.siyuanren.education.common.page.PageParam;
import org.apache.ibatis.jdbc.SqlRunner;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.common.dao.BaseDaoImpl
 * Date         2017/3/8
 * Time         17:13
 * Description
 */
public abstract class BaseDaoImpl<T extends BaseEntity> extends SqlSessionDaoSupport implements BaseDao<T> {

	private static Logger logger = LoggerFactory.getLogger(BaseDaoImpl.class);

	public static final String SQL_INSERT = "insert";
	public static final String SQL_BATCH_INSERT = "batchInsert";
	public static final String SQL_UPDATE = "update";
	public static final String SQL_GET_BY_ID = "getById";
	public static final String SQL_DELETE_BY_ID = "deleteById";
	public static final String SQL_LIST_PAGE = "listPage";
	public static final String SQL_LIST_BY = "listBy";
	public static final String SQL_COUNT_BY_PAGE_PARAM = "countByPageParam"; // 根据当前分页参数进行统计

	/**
	 * 注入SqlSessionTemplate实例(要求Spring中进行SqlSessionTemplate的配置).<br/>
	 * 可以调用sessionTemplate完成数据库操作.
	 */
	private SqlSessionTemplate sessionTemplate;

	@Autowired(required = false)
	protected SqlSessionFactory sqlSessionFactory;

	@Autowired(required = false)
	private DruidDataSource druidDataSource;


	@Autowired(required = false)
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		sessionTemplate = sqlSessionTemplate;
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public SqlSessionTemplate getSessionTemplate() {
		return sessionTemplate;
	}

	public SqlSession getSqlSession() {
		return super.getSqlSession();
	}
    @Override
	public int insert(T t) {

		if (t == null)
			throw new RuntimeException("T is null");

		int result = sessionTemplate.insert(getStatement(SQL_INSERT), t);

		if (result <= 0)
			throw BaseException.DB_INSERT_RESULT_0;

		if (t != null && t.getId() != null && result > 0)
			return t.getId();

		return result;
	}
    @Override
	public int insert(List<T> list) {

		if (list == null || list.size() <= 0)
			return 0;

		int result = sessionTemplate.insert(getStatement(SQL_BATCH_INSERT), list);

		if (result <= 0)
			throw BaseException.DB_INSERT_RESULT_0;

		return result;
	}
    @Override
	public int update(T t) {
		if (t == null)
			throw new RuntimeException("T is null");

		int result = sessionTemplate.update(getStatement(SQL_UPDATE), t);

		if (result <= 0)
			throw BaseException.DB_UPDATE_RESULT_0;

		return result;
	}
    @Override
	public int update(List<T> list) {

		if (list == null || list.size() <= 0)
			return 0;

		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			this.update(list.get(i));
			result += 1;
		}

		if (result <= 0)
			throw BaseException.DB_UPDATE_RESULT_0;

		return result;
	}
    @Override
	public T getById(int id) {
		return sessionTemplate.selectOne(getStatement(SQL_GET_BY_ID), id);
	}
    @Override
	public int deleteById(int id) {
		return  sessionTemplate.delete(getStatement(SQL_DELETE_BY_ID), id);
	}
    @Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId) {

		if (paramMap == null)
			paramMap = new HashMap<>();

		// 获取分页数据集 , 注切勿换成 sessionTemplate 对象
		List<Object> list = getSqlSession().selectList(getStatement(sqlId), paramMap,
				new RowBounds((pageParam.getPageNum() - 1) * pageParam.getNumPerPage(), pageParam.getNumPerPage()));

		// 统计总记录数
		Object countObject = (Object) getSqlSession().selectOne(getStatement(sqlId), new ExecutorInterceptor.CountParameter(paramMap));
		Integer count = Integer.valueOf(countObject.toString());

		return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count, list);
	}
    @Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {

		if (paramMap == null)
			paramMap = new HashMap<>();

		// 获取分页数据集 , 注切勿换成 sessionTemplate 对象
		List<Object> list = getSqlSession().selectList(getStatement(SQL_LIST_PAGE), paramMap,
				new RowBounds((pageParam.getPageNum() - 1) * pageParam.getNumPerPage(), pageParam.getNumPerPage()));

		// 统计总记录数
		Object countObject = (Object) getSqlSession().selectOne(getStatement(SQL_LIST_PAGE),
				new ExecutorInterceptor.CountParameter(paramMap));
		Integer count = Integer.valueOf(countObject.toString());

		// 是否统计当前分页条件下的数据：1:是，其他为否
		Object isCount = paramMap.get("isCount");
		if (isCount != null && "1".equals(isCount.toString())) {
			Map<String, Object> countResultMap = sessionTemplate.selectOne(getStatement(SQL_COUNT_BY_PAGE_PARAM), paramMap);
			return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count, list, countResultMap);
		} else {
			return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count, list);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
	public List<T> listBy(Map<String, Object> paramMap) {
		return (List) this.listBy(paramMap, SQL_LIST_BY);
	}
    @Override
	public List<Object> listBy(Map<String, Object> paramMap, String sqlId) {
		if (paramMap == null)
			paramMap = new HashMap<>();

		return sessionTemplate.selectList(getStatement(sqlId), paramMap);
	}

	@SuppressWarnings("unchecked")
    @Override
	public T getBy(Map<String, Object> paramMap) {
		return (T) this.getBy(paramMap, SQL_LIST_BY);
	}
    @Override
	public Object getBy(Map<String, Object> paramMap, String sqlId) {
		if (paramMap == null || paramMap.isEmpty())
			return null;

		return this.getSqlSession().selectOne(getStatement(sqlId), paramMap);
	}
	public String getStatement(String sqlId) {

		String name = this.getClass().getName();

		StringBuffer sb = new StringBuffer().append(name).append(".").append(sqlId);

		return sb.toString();
	}

	/**
	 * 根据序列名称,获取序列值
	 */
	public String getSeqNextValue(String seqName) {
		boolean isClosedConn = false;
		// 获取当前线程的连接
		Connection connection = this.sessionTemplate.getConnection();
		// 获取Mybatis的SQLRunner类
		SqlRunner sqlRunner = null;
		try {
			// 要执行的SQL
			String sql = "";
			// 数据库驱动类
			String driverClass = druidDataSource.getDriver().getClass().getName();
			// 不同的数据库,拼接SQL语句
			if (driverClass.equals("com.ibm.db2.jcc.DB2Driver")) {
				sql = "  VALUES " + seqName.toUpperCase() + ".NEXTVAL";
			}
			if (driverClass.equals("oracle.jdbc.OracleDriver")) {
				sql = "SELECT " + seqName.toUpperCase() + ".NEXTVAL FROM DUAL";
			}
			if (driverClass.equals("com.mysql.jdbc.Driver")) {
				sql = "SELECT  FUN_SEQ('" + seqName.toUpperCase() + "')";
			}
			// 如果状态为关闭,则需要从新打开一个连接
			if (connection.isClosed()) {
				connection = sqlSessionFactory.openSession().getConnection();
				isClosedConn = true;
			}
			sqlRunner = new SqlRunner(connection);
			Object[] args = {};
			// 执行SQL语句
			Map<String, Object> params = sqlRunner.selectOne(sql, args);
			for (Object o : params.values()) {
				return o.toString();
			}
			return null;
		} catch (Exception e) {
			throw BaseException.DB_GET_SEQ_NEXT_VALUE_ERROR.newInstance("获取序列出现错误!序列名称:{%s}", seqName);
		} finally {
			if (isClosedConn) {
				sqlRunner.closeConnection();
			}
		}
	}
}
