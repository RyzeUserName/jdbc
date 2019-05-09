package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 付款单据表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinanceReceiptDao extends BaseDao<BizFinanceReceipt> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 付款单据表实体
     * @param entity 付款单据表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinanceReceipt(BizFinanceReceipt entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_receipt ( bills_code,versions,creator,")
            .append("create_time,operator,operate_time,money,delete_flag,receipt_type,")
            .append("receipt_code ) VALUES (  :billsCode, :versions, :creator,")
            .append(" :createTime, :operator, :operateTime, :money, :deleteFlag,")
            .append(" :receiptType, :receiptCode )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 付款单据表实体
     * @param entity 付款单据表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinanceReceipt(BizFinanceReceipt entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_receipt SET bills_code = :billsCode,")
            .append("versions = :versions,creator = :creator,create_time = :createTime,")
            .append("operator = :operator,operate_time = :operateTime,money = :money,")
            .append("delete_flag = :deleteFlag,receipt_type = :receiptType,")
            .append("receipt_code = :receiptCode WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取付款单据表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinanceReceipt getBizFinanceReceiptById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfr.id,bfr.bills_code,bfr.versions,bfr.creator,")
            .append("bfr.create_time,bfr.operator,bfr.operate_time,bfr.money,")
            .append("bfr.delete_flag,bfr.receipt_type,bfr.receipt_code")
            .append(" FROM biz_finance_receipt bfr WHERE bfr.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinanceReceipt.class, sql.toString(), params);
    }

    /**
     * 删除付款单据表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinanceReceiptById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_receipt WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
