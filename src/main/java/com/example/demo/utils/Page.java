package com.example.demo.utils;

import java.util.List;

public class Page<T> {
    //结果
    private List<T> results;
    //总数
    private Integer total;
    //页码编号
    private Integer pageNo;
    //页面条数
    private Integer pageNum;

    public Page() {
    }

    public Page(List<T> results, Integer total) {
        this.results = results;
        this.total = total;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
