package ${packageName};

import io.airlift.drift.annotations.ThriftField;
import io.airlift.drift.annotations.ThriftStruct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

<#if importType??>
    <#list importType as i>
${i}
    </#list>
</#if>

/**
 * ${classRemark}实体
 * @author ${author}
 * @date ${date}
 * @version ${version}
 */
@ThriftStruct("${className}")
@ApiModel(value = "${classRemark}实体", description = "${classRemark}")
public class ${className} {
<#list attrs as attr>
    /**
     * ${attr.remark}
     */
    @ApiModelProperty(name = "${attr.name}", value = "${attr.remark}")
    private ${attr.type} ${attr.name};
</#list>

<#list attrs as attr>

    @ThriftField
    public void set${attr.name?cap_first}(${attr.type} ${attr.name}) {
        this.${attr.name} = ${attr.name};
    }

    @ThriftField(${attr_index+1})
    public ${attr.type} get${attr.name?cap_first}() {
        return this.${attr.name};
    }

</#list>

}