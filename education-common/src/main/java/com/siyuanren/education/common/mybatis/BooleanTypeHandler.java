package com.siyuanren.education.common.mybatis;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.common.mybatis.BooleanTypeHandler
 * Date         2017/3/8
 * Time         20:12
 * Description
 */
public class BooleanTypeHandler implements TypeHandler {

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
     */
    public Object getResult(ResultSet arg0, int arg1) throws SQLException {
        int num = arg0.getInt(arg1);
        Boolean rt = Boolean.FALSE;
        if (num == 1){
            rt = Boolean.TRUE;
        }
        return rt;
    }

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
     */
    public Object getResult(CallableStatement arg0, int arg1)
            throws SQLException {
        Boolean b = arg0.getBoolean(arg1);
        return b == true ? 1 : 0;
    }

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
     */
    public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
                             JdbcType arg3) throws SQLException {
        Boolean b = (Boolean) arg2;
        int value = (Boolean) b == true ? 1 : 0;
        arg0.setInt(arg1, value);
    }

    public Object getResult(ResultSet arg0, String arg1) throws SQLException {
        int num = arg0.getInt(arg1);
        Boolean rt = Boolean.FALSE;
        if (num == 1){
            rt = Boolean.TRUE;
        }
        return rt;
    }

}
