package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 渠道信息 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BizChannelDao extends BaseDao<BizChannel> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 渠道信息实体
     * @param entity 渠道信息实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBizChannel(BizChannel entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO biz_channel ( channel_code,channel_name,channel_type,")
            .append("reconciliation_form,reconciliation_time,bill_pattern,bill_url,")
            .append("file_format,refundable_period,handling_fee_flag,parent_id,")
            .append("channel_organization_name,company_name,business_number,payment_key,")
            .append("rate,path,billing_cycle,ent_time,delete_flag,creator,create_time,")
            .append("operate_time ) VALUES (  :channelCode, :channelName, :channelType,")
            .append(" :reconciliationForm, :reconciliationTime, :billPattern, :billUrl,")
            .append(" :fileFormat, :refundablePeriod, :handlingFeeFlag, :parentId,")
            .append(" :channelOrganizationName, :companyName, :businessNumber,")
            .append(" :paymentKey, :rate, :path, :billingCycle, :entTime, :deleteFlag,")
            .append(" :creator, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 渠道信息实体
     * @param entity 渠道信息实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBizChannel(BizChannel entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE biz_channel SET channel_code = :channelCode,")
            .append("channel_name = :channelName,channel_type = :channelType,")
            .append("reconciliation_form = :reconciliationForm,")
            .append("reconciliation_time = :reconciliationTime,")
            .append("bill_pattern = :billPattern,bill_url = :billUrl,")
            .append("file_format = :fileFormat,refundable_period = :refundablePeriod,")
            .append("handling_fee_flag = :handlingFeeFlag,parent_id = :parentId,")
            .append("channel_organization_name = :channelOrganizationName,")
            .append("company_name = :companyName,business_number = :businessNumber,")
            .append("payment_key = :paymentKey,rate = :rate,path = :path,")
            .append("billing_cycle = :billingCycle,ent_time = :entTime,")
            .append("delete_flag = :deleteFlag,creator = :creator,")
            .append("create_time = :createTime,operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取渠道信息详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BizChannel getBizChannelById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bc.id,bc.channel_code,bc.channel_name,bc.channel_type,")
            .append("bc.reconciliation_form,bc.reconciliation_time,bc.bill_pattern,")
            .append("bc.bill_url,bc.file_format,bc.refundable_period,bc.handling_fee_flag,")
            .append("bc.parent_id,bc.channel_organization_name,bc.company_name,")
            .append("bc.business_number,bc.payment_key,bc.rate,bc.path,bc.billing_cycle,")
            .append("bc.ent_time,bc.delete_flag,bc.creator,bc.create_time,bc.operate_time")
            .append(" FROM biz_channel bc WHERE bc.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BizChannel.class, sql.toString(), params);
    }

    /**
     * 删除渠道信息
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBizChannelById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM biz_channel WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
