package com.siyuanren.education.user.api.exception;

import com.siyuanren.education.common.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.user.api.exception.UserException
 * Date         2017/3/14
 * Time         11:06
 * Description
 */
public class UserException extends BaseException {

    private static final long serialVersionUID = 3424589800181389417L;
    private static Logger logger = LoggerFactory.getLogger(UserException.class);

    public static final UserException USER_NOT_EXIST = new UserException(10001, "用户不存在");
    public static final UserException SHOU_JI_HAO_MA_BU_NENG_WEI_KONG = new UserException(10002, "手机号码不能为空");


    public UserException() {
        super();
    }

    public UserException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    public UserException(int code, String msg) {
        super(code, msg);
    }

    /**
     * 实例化异常
     *
     * @param msgFormat
     * @param args
     * @return
     */
    public UserException newInstance(String msgFormat, Object... args) {
        return new UserException(this.code, msgFormat, args);
    }

    public UserException print() {
        logger.info("==>BaseException, code:" + this.code + ", msg:" + this.msg);
        return new UserException(this.code, this.msg);
    }
}
