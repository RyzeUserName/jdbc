package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 账号 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinanceAccountnumberDao extends BaseDao<BizFinanceAccountnumber> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 账号实体
     * @param entity 账号实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinanceAccountnumber(BizFinanceAccountnumber entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_accountnumber ( account_number_code,")
            .append("account_number_name,remark,creator,create_time,operator,operate_time,")
            .append("delete_flag ) VALUES (  :accountNumberCode, :accountNumberName,")
            .append(" :remark, :creator, :createTime, :operator, :operateTime, :deleteFlag")
            .append(" )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 账号实体
     * @param entity 账号实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinanceAccountnumber(BizFinanceAccountnumber entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_accountnumber SET ")
            .append("account_number_code = :accountNumberCode,")
            .append("account_number_name = :accountNumberName,remark = :remark,")
            .append("creator = :creator,create_time = :createTime,operator = :operator,")
            .append("operate_time = :operateTime,delete_flag = :deleteFlag WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取账号详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinanceAccountnumber getBizFinanceAccountnumberById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfa.id,bfa.account_number_code,bfa.account_number_name,")
            .append("bfa.remark,bfa.creator,bfa.create_time,bfa.operator,bfa.operate_time,")
            .append("bfa.delete_flag FROM biz_finance_accountnumber bfa WHERE bfa.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinanceAccountnumber.class, sql.toString(), params);
    }

    /**
     * 删除账号
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinanceAccountnumberById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_accountnumber WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
