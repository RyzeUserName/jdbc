package com.example.jdbc.data.filter;

/**
 * 过滤器链
 * @author Ryze
 * @date 2018/6/21 17:34
 */
public class FilterChain<T> {
    private Filter chain;

    /**
     * 添加
     */
    public void addFilter(Filter filter) {
        if (chain == null) {
            chain = filter;
        } else {
            chain.getLast().setNext(filter);
        }
    }

    /**
     * 执行过滤
     */
    public T execute(T t) {
        if (chain != null) {
            return (T) chain.execute(t);
        } else {
            return t;
        }
    }
}
