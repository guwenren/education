package com.siyuanren.education.common.exception;

/**
 * Created by gwr
 * Description
 * Path com.siyuanren.common.exception.BaseException
 * Date 2016/8/21
 * Time 11:13
 */
public class BaseException extends RuntimeException {
    /**
     * 数据库操作,insert返回0
     */
    public static final BaseException DB_INSERT_RESULT_0 = new BaseException(90040001, "数据库操作,insert返回0");

    /**
     * 数据库操作,update返回0
     */
    public static final BaseException DB_UPDATE_RESULT_0 = new BaseException(90040002, "数据库操作,update返回0");

    /**
     * 数据库操作,selectOne返回null
     */
    public static final BaseException DB_SELECTONE_IS_NULL = new BaseException(90040003, "数据库操作,selectOne返回null");

    /**
     * 数据库操作,list返回null
     */
    public static final BaseException DB_LIST_IS_NULL = new BaseException(90040004, "数据库操作,list返回null");

    /**
     * Token 验证不通过
     */
    public static final BaseException TOKEN_IS_ILLICIT = new BaseException(90040005, "Token 验证非法");
    /**
     * 会话超时　获取session时，如果是空，throws 下面这个异常 拦截器会拦截爆会话超时页面
     */
    public static final BaseException SESSION_IS_OUT_TIME = new BaseException(90040006, "会话超时");

    /**
     * 获取序列出错
     */
    public static final BaseException DB_GET_SEQ_NEXT_VALUE_ERROR = new BaseException(90040007, "获取序列出错");

    protected String msg;
    protected int code;

    public BaseException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public BaseException newInstance(String msgFormat, Object... args) {
        return new BaseException(this.code, msgFormat, args);
    }
}
