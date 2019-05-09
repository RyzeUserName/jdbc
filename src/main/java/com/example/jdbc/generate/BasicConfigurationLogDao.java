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
public class BasicConfigurationLogDao extends BaseDao<BasicConfigurationLog> {
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
    public int saveBasicConfigurationLog(BasicConfigurationLog entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO basic_configuration_log ( config_id,creator,operator,")
            .append("operation,create_time,operate_time ) VALUES (  :configId, :creator,")
            .append(" :operator, :operation, :createTime, :operateTime )");
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 实体
     * @param entity 实体
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int updateBasicConfigurationLog(BasicConfigurationLog entity) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE basic_configuration_log SET config_id = :configId,")
            .append("creator = :creator,operator = :operator,operation = :operation,")
            .append("create_time = :createTime,operate_time = :operateTime WHERE id= :id");
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取详情
     * @param id  id
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public BasicConfigurationLog getBasicConfigurationLogById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT bcl.id,bcl.config_id,bcl.creator,bcl.operator,bcl.operation,")
            .append("bcl.create_time,bcl.operate_time FROM basic_configuration_log")
            .append(" bcl WHERE bcl.id= :id");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(BasicConfigurationLog.class, sql.toString(), params);
    }

    /**
     * 删除
     * @param id  id
     * @return 影响条数
     * @author Ryze
     * @date 2019-05-08 13:52:08
     */
    public int deleteBasicConfigurationLogById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE  FROM basic_configuration_log WHERE id= :id ");
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }
}
