
	namespace java ${packageName}

    <#list tables as table>
	struct ${table.tableName} {
        <#list table.columns as attr>
            ${attr_index + 1}:${attr.thriftType} ${attr.name}<#if attr_has_next>,</#if>
        </#list>
	}
    </#list>


    <#list tables as table>
    /**
     * ${table.tableName} Service接口
     * @author  ${author}
     * @date ${date}
     * @version ${version}
     */
	service ${table.tableName}Service {
    /**
    * 保存 ${table.tableRemarks}
    * @param entity 对象
    * @return int 影响条数
    * @author ${author}
    * @date ${date}
    */
    i32 save${table.tableName}(1: ${table.tableName} entity) ;

    /**
    * 编辑 ${table.tableRemarks}
    * @param entity 实体
    * @return 影响条数
    * @author ${author}
    * @date ${date}
    */
    i32 update${table.tableName}(1: ${table.tableName} entity) ;

    /**
    * 获取${table.tableRemarks} 详情
    * @param id  id
    * @author ${author}
    * @date ${date}
    */
    ${table.tableName} get${table.tableName}ById(1: i64 id) ;

     /**
    * 删除${table.tableRemarks}
    * @param id  id
    * @return 影响条数
    * @author ${author}
    * @date ${date}
    */
    i32 delete${table.tableName}ById(1: i64 id) ;
    }
    </#list>
