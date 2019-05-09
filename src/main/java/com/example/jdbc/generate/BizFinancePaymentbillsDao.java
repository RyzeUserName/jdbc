package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 付款单表（营销付款、售后预付款、售后退款） dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizFinancePaymentbillsDao extends BaseDao<BizFinancePaymentbills> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 付款单表（营销付款、售后预付款、售后退款）实体
     * @param entity 付款单表（营销付款、售后预付款、售后退款）实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizFinancePaymentbills(BizFinancePaymentbills entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_finance_paymentbills ( bills_code,bills_date,")
            .append("supplier_code,supplier_name,business_type,bills_type,bills_status,")
            .append("versions,creator,create_time,operator,operate_time,money,delete_flag")
            .append(" ) VALUES (  :billsCode, :billsDate, :supplierCode, :supplierName,")
            .append(" :businessType, :billsType, :billsStatus, :versions, :creator,")
            .append(" :createTime, :operator, :operateTime, :money, :deleteFlag )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 付款单表（营销付款、售后预付款、售后退款）实体
     * @param entity 付款单表（营销付款、售后预付款、售后退款）实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizFinancePaymentbills(BizFinancePaymentbills entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_finance_paymentbills SET bills_code = :billsCode,")
            .append("bills_date = :billsDate,supplier_code = :supplierCode,")
            .append("supplier_name = :supplierName,business_type = :businessType,")
            .append("bills_type = :billsType,bills_status = :billsStatus,")
            .append("versions = :versions,creator = :creator,create_time = :createTime,")
            .append("operator = :operator,operate_time = :operateTime,money = :money,")
            .append("delete_flag = :deleteFlag WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取付款单表（营销付款、售后预付款、售后退款）详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizFinancePaymentbills getBizFinancePaymentbillsById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bfp.id,bfp.bills_code,bfp.bills_date,bfp.supplier_code,")
            .append("bfp.supplier_name,bfp.business_type,bfp.bills_type,bfp.bills_status,")
            .append("bfp.versions,bfp.creator,bfp.create_time,bfp.operator,")
            .append("bfp.operate_time,bfp.money,bfp.delete_flag")
            .append(" FROM biz_finance_paymentbills bfp WHERE bfp.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizFinancePaymentbills.class, sql.toString(), params);
    }

    /**
     * 删除付款单表（营销付款、售后预付款、售后退款）
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizFinancePaymentbillsById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_finance_paymentbills WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
