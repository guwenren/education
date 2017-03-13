package com.siyuanren.education.common.web.vo;

import java.io.Serializable;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.vo.BaseVO
 * Date         2017/3/13
 * Time         18:10
 * Description
 */
public class BaseVO implements Serializable {

    private static final long serialVersionUID = 204924877109762101L;
    public final static String SORT_TYPE_ASC = "asc";
    public final static String SORT_TYPE_DESC = "desc";
    private Integer pageNum; //页码
    private Integer numPerPage;  //数量

    public Integer getPageNum() {
        if (pageNum == null || pageNum <= 1)
            pageNum = 1;
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getNumPerPage() {
        if (numPerPage == null || numPerPage <= 0)
            numPerPage = 10;
        return numPerPage;
    }

    public void setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
    }
}
