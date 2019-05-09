package ${packageName};

import com.ccbuluo.business.entity.${className};
import com.ccbuluo.business.${serviceName}.service.OrganizationService;
import com.ccbuluo.core.annotation.validate.ValidateGroup;
import com.ccbuluo.core.controller.BaseController;
import com.ccbuluo.core.validate.Group;
import com.ccbuluo.http.StatusDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
  * ${classRemark} Controller
  * @author ${author}
  * @date ${date}
  * @version ${version}
  */
@RestController
@RequestMapping("//")
@Api(tags = "${classRemark}")
public class ${serviceName}Controller extends BaseController  {

    @Autowired
    private ${serviceName}Service baseService;
    /**
    * 分页查询 ${classRemark}
    * @param keyword 关键字
    * @param offset 偏移量
    * @param limit 每页条数
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    @ApiOperation(value = "分页查询 ${classRemark}", notes = "【${author}】")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "keyword", value = "关键字", paramType = "query"),
    @ApiImplicitParam(name = "offset", value = "偏移量", required = true, paramType = "query"),
    @ApiImplicitParam(name = "limit", value = "每页条数", required = true, paramType = "query")})
    @GetMapping("/list")
    public StatusDto list(@RequestParam(required = false) String orgName,
    @RequestParam(defaultValue = "0") int offset,
    @RequestParam(defaultValue = "10") int limit) {
    return StatusDto.buildDataSuccessStatusDto(baseService.queryOrganizationPage(orgName, offset, limit));
    }

    /**
     * ${classRemark}新增
     * @param entity ${classRemark}
     * @return com.ccbuluo.http.StatusDto
     * @author ${author}
     * @date ${date}
     */
    @ApiOperation(value = " ${classRemark}新增", notes = "【${author}】")
    @PostMapping("/save")
    public StatusDto save(@ValidateGroup(Group.Add.class) ${className} entity) {
    return baseService.save${serviceName}(entity);
    }


    /**
    * ${classRemark}编辑
    * @param entity ${classRemark}
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
    @ApiOperation(value = "${classRemark}编辑", notes = "【${author}】")
    @PostMapping("/edit")
    public StatusDto edit(@ValidateGroup(Group.Update.class) ${className} entity) {
    return baseService.update${serviceName}(entity);
    }

    /**
    * ${classRemark}详情
    * @param id  ${classRemark}id
    * @return ${className}
    * @author ${author}
    * @date ${date}
    */
    @ApiOperation(value = "${classRemark}详情", notes = "【${author}】")
    @ApiImplicitParam(name = "id", value = "${classRemark}id", required = true, paramType = "path")
    @GetMapping("/detail/{id}")
    public StatusDto<${className}> detail(@PathVariable("id") Long id) {
    return StatusDto.buildDataSuccessStatusDto(baseService.find${serviceName}Detail(id));
    }

    /**
    * ${classRemark}删除
    * @param id ${classRemark}id
    * @return com.ccbuluo.http.StatusDto
    * @author ${author}
    * @date ${date}
    */
     @ApiOperation(value = " ${classRemark}删除", notes = "【${author}】")
     @ApiImplicitParam(name = "id", value = "${classRemark}id", required = true, paramType = "path")
     @GetMapping("/delete/{id}")
     public StatusDto delete(@PathVariable("id") Long id) {
     return baseService.delete${serviceName}(id);
     }

}
