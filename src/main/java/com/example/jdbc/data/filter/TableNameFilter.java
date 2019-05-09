package com.example.jdbc.data.filter;

import com.example.jdbc.data.jdbc.data.Table;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 根据表名过滤
 * @author Ryze
 * @date 2018/6/22 17:03
 */
public class TableNameFilter extends AbstractFilter<List<Table>> {
    private List<String> list;
    private InOrOutEnum inOrOutEnum;

    /**
     * 执行
     */
    @Override
    public List<Table> execute(List<Table> lists) {
        List<Table> execute = super.execute(lists);
        //过滤
        switch (inOrOutEnum) {
            case IN:
                execute= execute.stream().filter(a->list.contains(a.getTableName())).collect(Collectors.toList());
                break;
            case OUT:
                execute= execute.stream().filter(a->!list.contains(a.getTableName())).collect(Collectors.toList());
                break;
        }
        return execute;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list, InOrOutEnum inOrOutEnum) {
        this.list = list;
        this.inOrOutEnum = inOrOutEnum;
    }

    public enum InOrOutEnum {
        IN("只要的"), OUT("去除的");
        private String label;

        InOrOutEnum(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
