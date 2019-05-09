package ${packageName};

import io.airlift.drift.annotations.ThriftMethod;
import io.airlift.drift.annotations.ThriftService;

/**
 * ${classRemark} Service
 * @author ${author}
 * @date ${date}
 * @version ${version}
 */
@ThriftService("${className}Service")
public interface ${className}Service {

    /**
     * 保存 ${classRemark}实体
     * @param entity ${classRemark}实体
     * @return int 影响条数
     * @author ${author}
     * @date ${date}
     */
    @ThriftMethod("${className}save")
    int saveEntity(${className} entity);
}
