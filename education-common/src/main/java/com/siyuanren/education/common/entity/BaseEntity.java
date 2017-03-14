package com.siyuanren.education.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by   guwr
 * Project_name siyuanren
 * Path         com.siyuanren.common.entity.BaseEntity
 * Date         2017/3/8
 * Time         18:48
 * Description
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2572460597926123737L;
    /**
     * 创建时间
     */
    protected Date createTime;
    private Long id;
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
