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
public class BasicPaymentAppDao extends BaseDao<BasicPaymentApp> {
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
    public int saveBasicPaymentApp(BasicPaymentApp entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_payment_app ( app_id,app_name,app_code,private_key,")
            .append("public_key,status,delete_flag,creator,create_time,operate_time")
            .append(" ) VALUES (  :appId, :appName, :appCode, :privateKey, :publicKey,")
            .append(" :status, :deleteFlag, :creator, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicPaymentApp(BasicPaymentApp entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_payment_app SET app_id = :appId,app_name = :appName,")
            .append("app_code = :appCode,private_key = :privateKey,")
            .append("public_key = :publicKey,status = :status,delete_flag = :deleteFlag,")
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
    public BasicPaymentApp getBasicPaymentAppById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bpa.id,bpa.app_id,bpa.app_name,bpa.app_code,bpa.private_key,")
            .append("bpa.public_key,bpa.status,bpa.delete_flag,bpa.creator,")
            .append("bpa.create_time,bpa.operate_time FROM basic_payment_app")
            .append(" bpa WHERE bpa.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicPaymentApp.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicPaymentAppById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_payment_app WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
