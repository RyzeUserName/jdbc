package ${packageName};

/**
 * 描述
 * @author ${author}
 * @date ${date}
 * @version ${version}
 */
public class ${className} {
<#list attrs as attr>
    /**
     * ${attr.remark}
     */
    private ${attr.type} ${attr.name};
</#list>

<#list attrs as attr>
    public void set${attr.name?cap_first}(${attr.type} ${attr.name}) {
        this.${attr.name} = ${attr.name};
    }

    public ${attr.type} get${attr.name?cap_first}() {
        return this.${attr.name};
    }

</#list>

}