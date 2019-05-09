package com.example.jdbc.data.filter;


/**
 * 过滤器接口
 */
public interface Filter<T> {
    /**
     * 执行
     */
    T execute(T t);

    /**
     * 设置下个过滤
     */
    void setNext(Filter next);

    /**
     * 获取下个
     */
    Filter getNext();

    /**
     * 获取最后一个
     */
    Filter getLast();
}
