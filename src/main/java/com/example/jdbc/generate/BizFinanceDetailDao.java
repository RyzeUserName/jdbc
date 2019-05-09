package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 付款明细表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinanceDetailDao extends BaseDao<BizFinanceDetail> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 付款明细表实体
     * @param entity 付款明细表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinanceDetail(BizFinanceDetail entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_detail ( bills_code,versions,creator,")
            .append("create_time,operator,operate_time,money,delete_flag,payment_mode,")
            .append("payment_account,account_number_code ) VALUES (  :billsCode,")
            .append(" :versions, :creator, :createTime, :operator, :operateTime, :money,")
            .append(" :deleteFlag, :paymentMode, :paymentAccount, :accountNumberCode )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 付款明细表实体
     * @param entity 付款明细表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinanceDetail(BizFinanceDetail entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_detail SET bills_code = :billsCode,")
            .append("versions = :versions,creator = :creator,create_time = :createTime,")
            .append("operator = :operator,operate_time = :operateTime,money = :money,")
            .append("delete_flag = :deleteFlag,payment_mode = :paymentMode,")
            .append("payment_account = :paymentAccount,")
            .append("account_number_code = :accountNumberCode WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取付款明细表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinanceDetail getBizFinanceDetailById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfd.id,bfd.bills_code,bfd.versions,bfd.creator,")
            .append("bfd.create_time,bfd.operator,bfd.operate_time,bfd.money,")
            .append("bfd.delete_flag,bfd.payment_mode,bfd.payment_account,")
            .append("bfd.account_number_code FROM biz_finance_detail bfd WHERE bfd.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinanceDetail.class, sql.toString(), params);
    }

    /**
     * 删除付款明细表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinanceDetailById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_detail WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
