package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.ApiAlert;
import com.jason.learning.datasource.service.IApiAlertService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("ApiAlertController")
@RestController
@RequestMapping("/apiAlert/*")
public class ApiAlertController {
    @Autowired
    private IApiAlertService apiAlertService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public ApiAlert getApiAlert(ApiAlert apiAlert) {
        return this.apiAlertService.get(apiAlert);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public ApiAlert saveApiAlert(ApiAlert apiAlert) {
        this.apiAlertService.save(apiAlert);
        return apiAlert;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteApiAlert(ApiAlert apiAlert) {
        return this.apiAlertService.delete(apiAlert);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateApiAlert(ApiAlert apiAlert) {
        return this.apiAlertService.update(apiAlert);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<ApiAlert> listApiAlert(ApiAlert apiAlert) {
        return this.apiAlertService.list(apiAlert);
    }
}