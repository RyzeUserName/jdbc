package com.example.jdbc.data.filter;


/**
 * 抽象过滤器
 * @author Ryze
 * @date 2018/6/21 17:18
 */
public abstract class AbstractFilter<T> implements Filter<T> {
    private Filter next;

    public AbstractFilter(Filter next) {
        this.next = next;
    }

    public AbstractFilter() {
    }

    /**
     * 执行
     */
    @Override
    public T execute(T t) {
        Filter nextNew = getNext();
        if (nextNew != null) {
            return (T) nextNew.execute(t);
        } else {
            return t;
        }
    }

    /**
     * 设置下个过滤
     * @param next
     */
    @Override
    public void setNext(Filter next) {
        this.next = next;
    }

    /**
     * 获取下个
     */
    @Override
    public Filter getNext() {
        return next;
    }

    /**
     * 获取最后一个
     */
    @Override
    public Filter getLast() {
        Filter last = this;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }
}
