package cn.ccbuluo.rest.business;

import cn.ccbuluo.common.BaseController;
import cn.ccbuluo.dto.StatusDto;
import cn.ccbuluo.dto.page.PageTable;
import cn.ccbuluo.dto.page.Pagination;
import cn.ccbuluo.entity.business.${className};
import cn.ccbuluo.service.business.${className}Service;
import cn.ccbuluo.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/api/${className?lower_case}")
public class ${className}Controller extends BaseController {

    @Autowired
    private ${className}Service service;


    @GetMapping
    public Object search(@RequestParam(required = false) String keyword,
                         @RequestParam(defaultValue = "0") int offset,
                         @RequestParam(defaultValue = "10") int limit) {
        Map<String, Object> params = new HashMap<>(3);
        MapUtils.putNotNull(params, "keyword", keyword);
        MapUtils.putNotNull(params, "system", system);
        PageTable<${className}> pageTable = this.service.searchScrollPage(params, new Pagination(offset, limit));
        return StatusDto.buildSuccess(pageTable);
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable Long id) {
        ${className} byId = this.service.getById(id);
        return StatusDto.buildSuccess(byId);
    }

    @GetMapping("/del/{id}")
    public Object del(@PathVariable Long id) {
        service.deleteById(id);
        return StatusDto.buildSuccess();
    }

    @PostMapping("/insert")
    public Object insert(@RequestBody ${className} entity) {
        entity.setCreate(WebUtils.getLoggedUserName());
        entity.setCreateDate(new Date());
        service.insert(entity);
        return StatusDto.buildSuccess();
    }

    @PostMapping("/update")
    public Object update(@RequestBody ${className} entity) {
        entity.setOperate(WebUtils.getLoggedUserName());
        entity.setOperateDate(new Date());
        service.update(entity);
        return StatusDto.buildSuccess();
    }


}
