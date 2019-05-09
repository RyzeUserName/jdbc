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
public class BasicPaymentchannelDetailDao extends BaseDao<BasicPaymentchannelDetail> {
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
    public int saveBasicPaymentchannelDetail(BasicPaymentchannelDetail entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_paymentchannel_detail ( apply,channel_code,app_id,")
            .append("rate,status,creator,create_time,operate_time,channeldetail_code,")
            .append("account_name ) VALUES (  :apply, :channelCode, :appId, :rate,")
            .append(" :status, :creator, :createTime, :operateTime, :channeldetailCode,")
            .append(" :accountName )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentchannelDetail(BasicPaymentchannelDetail entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_paymentchannel_detail SET apply = :apply,")
            .append("channel_code = :channelCode,app_id = :appId,rate = :rate,")
            .append("status = :status,creator = :creator,create_time = :createTime,")
            .append("operate_time = :operateTime,channeldetail_code = :channeldetailCode,")
            .append("account_name = :accountName WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentchannelDetail getBasicPaymentchannelDetailById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpd.id,bpd.apply,bpd.channel_code,bpd.app_id,bpd.rate,")
            .append("bpd.status,bpd.creator,bpd.create_time,bpd.operate_time,")
            .append("bpd.channeldetail_code,bpd.account_name")
            .append(" FROM basic_paymentchannel_detail bpd WHERE bpd.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentchannelDetail.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentchannelDetailById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_paymentchannel_detail WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
