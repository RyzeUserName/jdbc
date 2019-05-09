package ${packageName};

import com.ccbuluo.business.entity.${className};
import com.ccbuluo.db.Page;
import com.ccbuluo.http.StatusDto;

import java.util.Date;

/**
* ${classRemark} Service
* @author ${author}
* @date ${date}
* @version ${version}
*/
public interface ${serviceName}Service {
    /**
    * 分页查询 ${classRemark}
    * @param keyword 关键字
    * @param offset 偏移量
    * @param limit 每页条数
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    Page<${className}> query${serviceName}Page(String keyword, int offset, int limit);

    /**
    * ${classRemark}新增
    * @param entity ${classRemark}
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    StatusDto save${serviceName}(${className} entity);

    /**
    * ${classRemark}编辑
    * @param entity ${classRemark}
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    StatusDto update${serviceName}(${className} entity);

    /**
    * ${classRemark}详情
    * @param id  ${classRemark}id
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    ${className} find${serviceName}Detail(Long id);

    /**
    * ${classRemark}删除
    * @param id ${classRemark}id
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    StatusDto delete${serviceName}(Long id);
}
