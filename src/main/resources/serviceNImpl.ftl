package ${packageName};

import com.ccbuluo.business.entity.${className};
import com.ccbuluo.business.${serviceName?uncap_first}.dao.${className}Dao;
import com.ccbuluo.core.common.UserHolder;
import com.ccbuluo.db.Page;
import com.ccbuluo.http.StatusDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ${classRemark} Service 实现
* @author ${author}
* @date ${date}
* @version ${version}
*/
@Service
public class ${serviceName}ServiceImpl implements ${serviceName}Service {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ${className}Dao baseDao;
    @Autowired
    private UserHolder userHolder;

    /**
    * 分页查询 ${classRemark}
    * @param keyword 关键字
    * @param offset 偏移量
    * @param limit 每页条数
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    @Override
    public Page<${className}> query${serviceName}Page(String keyword, int offset, int limit) {
        return baseDao.query${serviceName}Page(keyword, offset, limit);
    }

    /**
    * ${classRemark}新增
    * @param entity ${classRemark}
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public StatusDto save${serviceName}(${className} entity) {
    try {
    Date date = new Date();
    String loggedUserId = userHolder.getLoggedUserId();
    entity.setCreator(loggedUserId);
    entity.setOperator(loggedUserId);
    entity.setDeleteFlag(Constants.DELETE_FLAG_NORMA);
    entity.setCreateTime(date);
    entity.setOperateTime(date);
    baseDao.save${className}(entity);
    return StatusDto.buildSuccessStatusDto();
    } catch (Exception e) {
    logger.error("${classRemark}新增失败！", e);
    throw e;
    }
    }

    /**
    * ${classRemark}编辑
    * @param entity ${classRemark}
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public StatusDto update${serviceName}(${className} entity) {
    try {
    Date date = new Date();
    String loggedUserId = userHolder.getLoggedUserId();
    entity.setOperator(loggedUserId);
    entity.setOperateTime(date);
    baseDao.update${className}(entity);
    return StatusDto.buildSuccessStatusDto();
    } catch (Exception e) {
    logger.error("${classRemark}编辑失败！", e);
    throw e;
    }
    }

   /**
    * ${classRemark}详情
    * @param id  ${classRemark}id
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    @Override
    public ${className} find${serviceName}Detail(Long id) {
    return baseDao.get${className}ById(id);
    }

   /**
    * ${classRemark}删除
    * @param id ${classRemark}id
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public StatusDto delete${serviceName}(Long id) {
    try {
    baseDao.deleteFalse${className}ById(id);
    return StatusDto.buildSuccessStatusDto();
    } catch (Exception e) {
    logger.error("${classRemark}删除失败！", e);
    throw e;
    }
    }

}
