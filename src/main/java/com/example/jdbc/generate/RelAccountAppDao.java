package com.example.jdbc.generate;

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 账户业务平台中间表 dao
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@Repository
public class RelAccountAppDao extends BaseDao<RelAccountApp> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    /**
     * 保存 账户业务平台中间表实体
     * @param entity 账户业务平台中间表实体
     * @return int 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int saveRelAccountApp(RelAccountApp entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO rel_account_app ( app_id,account_code,delete_flag,")
            .append("creator,create_time,operate_time ) VALUES (  :appId, :accountCode,")
            .append(" :deleteFlag, :creator, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 账户业务平台中间表实体
     * @param entity 账户业务平台中间表实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateRelAccountApp(RelAccountApp entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE rel_account_app SET app_id = :appId,")
            .append("account_code = :accountCode,delete_flag = :deleteFlag,")
            .append("creator = :creator,create_time = :createTime,")
            .append("operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取账户业务平台中间表详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public RelAccountApp getRelAccountAppById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT raa.id,raa.app_id,raa.account_code,raa.delete_flag,")
            .append("raa.creator,raa.create_time,raa.operate_time FROM rel_account_app")
            .append(" raa WHERE raa.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(RelAccountApp.class, sql.toString(), params);
    }

    /**
     * 删除账户业务平台中间表
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteRelAccountAppById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM rel_account_app WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
