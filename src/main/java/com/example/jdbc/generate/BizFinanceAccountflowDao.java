package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 账户流水 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinanceAccountflowDao extends BaseDao<BizFinanceAccountflow> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 账户流水实体
     * @param entity 账户流水实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinanceAccountflow(BizFinanceAccountflow entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_accountflow ( order_no,account_serial_number,")
            .append("account_serial_code,balance_change_amount,balance,transaction_type,")
            .append("transaction_name,business_source_document_number,business_code,")
            .append("business_name,payee_name,payee_account,payer_name,payer_account,")
            .append("account_flow_type,creator,create_time,operator,operate_time,")
            .append("delete_flag ) VALUES (  :orderNo, :accountSerialNumber,")
            .append(" :accountSerialCode, :balanceChangeAmount, :balance,")
            .append(" :transactionType, :transactionName, :businessSourceDocumentNumber,")
            .append(" :businessCode, :businessName, :payeeName, :payeeAccount, :payerName,")
            .append(" :payerAccount, :accountFlowType, :creator, :createTime, :operator,")
            .append(" :operateTime, :deleteFlag )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 账户流水实体
     * @param entity 账户流水实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinanceAccountflow(BizFinanceAccountflow entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_accountflow SET order_no = :orderNo,")
            .append("account_serial_number = :accountSerialNumber,")
            .append("account_serial_code = :accountSerialCode,")
            .append("balance_change_amount = :balanceChangeAmount,balance = :balance,")
            .append("transaction_type = :transactionType,")
            .append("transaction_name = :transactionName,")
            .append("business_source_document_number = :businessSourceDocumentNumber,")
            .append("business_code = :businessCode,business_name = :businessName,")
            .append("payee_name = :payeeName,payee_account = :payeeAccount,")
            .append("payer_name = :payerName,payer_account = :payerAccount,")
            .append("account_flow_type = :accountFlowType,creator = :creator,")
            .append("create_time = :createTime,operator = :operator,")
            .append("operate_time = :operateTime,delete_flag = :deleteFlag WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取账户流水详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinanceAccountflow getBizFinanceAccountflowById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfa.id,bfa.order_no,bfa.account_serial_number,")
            .append("bfa.account_serial_code,bfa.balance_change_amount,bfa.balance,")
            .append("bfa.transaction_type,bfa.transaction_name,")
            .append("bfa.business_source_document_number,bfa.business_code,")
            .append("bfa.business_name,bfa.payee_name,bfa.payee_account,bfa.payer_name,")
            .append("bfa.payer_account,bfa.account_flow_type,bfa.creator,bfa.create_time,")
            .append("bfa.operator,bfa.operate_time,bfa.delete_flag")
            .append(" FROM biz_finance_accountflow bfa WHERE bfa.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinanceAccountflow.class, sql.toString(), params);
    }

    /**
     * 删除账户流水
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinanceAccountflowById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_accountflow WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
