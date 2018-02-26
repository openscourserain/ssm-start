package com.seecen.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/1/19.
 */
public class Page<T> {
    //当前页
    private int currentPage = 1;

    //每页数量
    private int pageSize = 10;

    //总记录数
    private int total;

    //查询条件
    private T condition;

    //开始
    // 0-2 2-4 4-6
    public int getStart(){
        return (currentPage-1)*pageSize;
    }

    //结束
    public int getEnd(){
        return currentPage*pageSize;
    }

    //数据集合
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    //总页数
    public int getPageTotal() {
        return (int) Math.ceil(total * 1.0 / pageSize);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", condition=" + condition +
                ", list=" + list +
                '}';
    }
}
