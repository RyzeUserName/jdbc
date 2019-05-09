package com.example.jdbc.data.filter;


/**
 * 过滤器
 * @author Ryze
 * @date 2018/6/21 17:33
 */
public class FilterManager<T> {
    private FilterChain filterChain;

    public FilterManager() {
        this.filterChain = new FilterChain();
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public T filter(T t) {
        return (T) filterChain.execute(t);
    }
}
