package ${packageName};

import cn.ccbuluo.entity.IdEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

<#if importType??>
    <#list importType as i>
        ${i}
    </#list>
</#if>

public class ${className} extends IdEntity {
<#list attrs as attr>
    <#if attr.type?? && attr.type=='Date'>
     @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    </#if>
    private ${attr.type} ${attr.name};
</#list>

<#list attrs as attr>
    <#if attr.name !='id'>
    public void set${attr.name?cap_first}(${attr.type} ${attr.name}) {
        this.${attr.name} = ${attr.name};
    }

    public ${attr.type} get${attr.name?cap_first}() {
        return this.${attr.name};
    }
    </#if>
</#list>

}