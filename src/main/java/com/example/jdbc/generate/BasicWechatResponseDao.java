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
public class BasicWechatResponseDao extends BaseDao<BasicWechatResponse> {
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
    public int saveBasicWechatResponse(BasicWechatResponse entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_wechat_response ( transaction_id,code_url,")
            .append("trade_type,prepay_id,sign,nonce_str,mch_id,result_code,return_msg,")
            .append("return_code,appid,status,pay_serial_number ) VALUES ( ")
            .append(" :transactionId, :codeUrl, :tradeType, :prepayId, :sign, :nonceStr,")
            .append(" :mchId, :resultCode, :returnMsg, :returnCode, :appid, :status,")
            .append(" :paySerialNumber )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicWechatResponse(BasicWechatResponse entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_wechat_response SET transaction_id = :transactionId,")
            .append("code_url = :codeUrl,trade_type = :tradeType,prepay_id = :prepayId,")
            .append("sign = :sign,nonce_str = :nonceStr,mch_id = :mchId,")
            .append("result_code = :resultCode,return_msg = :returnMsg,")
            .append("return_code = :returnCode,appid = :appid,status = :status,")
            .append("pay_serial_number = :paySerialNumber WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicWechatResponse getBasicWechatResponseById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bwr.id,bwr.transaction_id,bwr.code_url,bwr.trade_type,")
            .append("bwr.prepay_id,bwr.sign,bwr.nonce_str,bwr.mch_id,bwr.result_code,")
            .append("bwr.return_msg,bwr.return_code,bwr.appid,bwr.status,")
            .append("bwr.pay_serial_number FROM basic_wechat_response")
            .append(" bwr WHERE bwr.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicWechatResponse.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicWechatResponseById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_wechat_response WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
