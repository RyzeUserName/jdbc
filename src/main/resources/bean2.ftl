package ${packageName};

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
@ApiModel(value = "${classRemark}实体", description = "${classRemark}")
public class ${className} {
<#list attrs as attr>
    /**
     * ${attr.remark}
     */
    @ApiModelProperty(name = "${attr.name}", value = "${attr.remark}")
    private ${attr.type} ${attr.name};
</#list>

<#if enums??>
    <#list enums as enum>
    /**
     * ${enum.enumRemark}
     */
    public enum ${enum.enumName?cap_first} {
        <#if enum.enumValues??>
            <#list enum.enumValues as value>
        ${value}("")<#if value_has_next=true>,<#else>;</#if>
            </#list>
        </#if>
        private String label;

        ${enum.enumName?cap_first}(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    </#list>
</#if>

<#list attrs as attr>
    public void set${attr.name?cap_first}(${attr.type} ${attr.name}) {
        this.${attr.name} = ${attr.name};
    }

    public ${attr.type} get${attr.name?cap_first}() {
        return this.${attr.name};
    }

</#list>

}