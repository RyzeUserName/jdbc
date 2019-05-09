package ${packageName};

import com.ccbuluo.dao.BaseDao;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * ${classRemark} dao
 * @author ${author}
 * @date ${date}
 * @version ${version}
 */
@Repository
public class ${className}Dao extends BaseDao<${className}> {
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
    return namedParameterJdbcTemplate;
    }

    @Autowired
    private UserHolder userHolder;

    /**
     * 分页查询 ${classRemark}
     * @param keyword 关键字
     * @param offset 偏移量
     * @param limit 每页条数
     * @author ${author}
     * @date ${date}
     */
    public Page<${className}> query${className}Page(String keyword, int offset, int limit) {
        StringBuilder sql = new StringBuilder();
    <#list pageSql as page>
        <#if page_index = 0>
            sql.append("${page}")<#if page_has_next!=true>;</#if>
        <#elseif page_has_next!=true>
            .append("${page}");
        <#else >
            .append("${page}")
        </#if>
    </#list>
        if (StringUtils.isNotBlank(keyword)) {
        sql.append(" AND bo.xx LIKE CONCAT('%', :keyword, '%') ");
        }
        Map<String, Object> params = Maps.newHashMap();
        params.put("keyword", keyword);
        params.put("deleteFlag", Constants.DELETE_FLAG_NORMAL);
        return super.queryPageForBean(${className}.class, sql.toString(), params, offset, limit);
    }

    /**
     * 保存 ${classRemark}实体
     * @param entity ${classRemark}实体
     * @return int 影响条数
     * @author ${author}
     * @date ${date}
     */
    public int save${className}(${className} entity) {
        StringBuilder sql = new StringBuilder();
<#list addSql as add>
    <#if add_index = 0>
        sql.append("${add}")<#if add_has_next!=true>;</#if>
        <#elseif add_has_next!=true>
            .append("${add}");
        <#else >
            .append("${add}")
    </#if>
</#list>
        return super.save(sql.toString(), entity);
    }

    /**
     * 编辑 ${classRemark}实体
     * @param entity ${classRemark}实体
     * @return 影响条数
     * @author ${author}
     * @date ${date}
     */
    public int update${className}(${className} entity) {
        StringBuilder sql = new StringBuilder();
<#list updateSql as update>
    <#if update_index = 0>
        sql.append("${update}")<#if update_has_next!=true>;</#if>
    <#elseif update_has_next!=true>
            .append("${update}");
    <#else >
            .append("${update}")
    </#if>
</#list>
        return super.updateForBean(sql.toString(), entity);
    }

    /**
     * 获取${classRemark}详情
     * @param id  id
     * @author ${author}
     * @date ${date}
     */
    public ${className} get${className}ById(Long id) {
        StringBuilder sql = new StringBuilder();
<#list detailSql as detail>
    <#if detail_index = 0>
        sql.append("${detail}")<#if detail_has_next!=true>;</#if>
    <#elseif detail_has_next!=true>
            .append("${detail}");
    <#else >
            .append("${detail}")
    </#if>
</#list>
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.findForBean(${className}.class, sql.toString(), params);
    }

    /**
     * 删除${classRemark}
     * @param id  id
     * @return 影响条数
     * @author ${author}
     * @date ${date}
     */
    public int delete${className}ById(Long id) {
        StringBuilder sql = new StringBuilder();
<#list deleteSql as delete>
    <#if delete_index = 0>
        sql.append("${delete}")<#if delete_has_next!=true>;</#if>
    <#elseif delete_has_next!=true>
            .append("${delete}");
    <#else >
            .append("${delete}")
    </#if>
</#list>
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return super.updateForMap(sql.toString(), params);
    }

    /**
    * 假删${classRemark}
    * @param id  id
    * @return 影响条数
    * @author ${author}
    * @date ${date}
    */
    public int deleteFalse${className}ById(Long id) {
    StringBuilder sql = new StringBuilder();
<#list deleteFalseSql as delete1>
    <#if delete1_index = 0>
        sql.append("${delete1}")<#if delete1_has_next!=true>;</#if>
    <#elseif delete1_has_next!=true>
        .append("${delete1}");
    <#else >
        .append("${delete1}")
    </#if>
</#list>
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        params.put("deleteFlag", Constants.DELETE_FLAG_DELETE);
        params.put("operator", userHolder.getLoggedUserId());
        params.put("operateTime", new Date());
        return super.updateForMap(sql.toString(), params);
    }
}
