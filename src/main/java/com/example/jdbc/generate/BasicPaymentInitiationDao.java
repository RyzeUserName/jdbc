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
public class BasicPaymentInitiationDao extends BaseDao<BasicPaymentInitiation> {
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
    public int saveBasicPaymentInitiation(BasicPaymentInitiation entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_initiation ( app_id,private_key,public_key,")
            .append("status,delete_flag,operator,operate_time ) VALUES (  :appId,")
            .append(" :privateKey, :publicKey, :status, :deleteFlag, :operator,")
            .append(" :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentInitiation(BasicPaymentInitiation entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_initiation SET app_id = :appId,")
            .append("private_key = :privateKey,public_key = :publicKey,status = :status,")
            .append("delete_flag = :deleteFlag,operator = :operator,")
            .append("operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicPaymentInitiation getBasicPaymentInitiationById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpi.id,bpi.app_id,bpi.private_key,bpi.public_key,bpi.status,")
            .append("bpi.delete_flag,bpi.operator,bpi.operate_time")
            .append(" FROM basic_payment_initiation bpi WHERE bpi.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentInitiation.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentInitiationById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_initiation WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
