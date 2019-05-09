package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 *  dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class BasicPaymentChannelDao extends BaseDao<BasicPaymentChannel> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 实体
     * @param entity 实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveBasicPaymentChannel(BasicPaymentChannel entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_channel ( apply,channel_code,channel_name,")
            .append("account_name,pay_type,ent_time,company_name,account_period,rate,")
            .append("reconciliation_form,bill_format,file_format,status,creator,")
            .append("create_time,operate_time ) VALUES (  :apply, :channelCode,")
            .append(" :channelName, :accountName, :payType, :entTime, :companyName,")
            .append(" :accountPeriod, :rate, :reconciliationForm, :billFormat,")
            .append(" :fileFormat, :status, :creator, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentChannel(BasicPaymentChannel entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_channel SET apply = :apply,")
            .append("channel_code = :channelCode,channel_name = :channelName,")
            .append("account_name = :accountName,pay_type = :payType,ent_time = :entTime,")
            .append("company_name = :companyName,account_period = :accountPeriod,")
            .append("rate = :rate,reconciliation_form = :reconciliationForm,")
            .append("bill_format = :billFormat,file_format = :fileFormat,status = :status,")
            .append("creator = :creator,create_time = :createTime,")
            .append("operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentChannel getBasicPaymentChannelById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpc.id,bpc.apply,bpc.channel_code,bpc.channel_name,")
            .append("bpc.account_name,bpc.pay_type,bpc.ent_time,bpc.company_name,")
            .append("bpc.account_period,bpc.rate,bpc.reconciliation_form,bpc.bill_format,")
            .append("bpc.file_format,bpc.status,bpc.creator,bpc.create_time,")
            .append("bpc.operate_time FROM basic_payment_channel bpc WHERE bpc.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentChannel.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentChannelById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_channel WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
