package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.ApiAlertApps;
import com.jason.learning.datasource.service.IApiAlertAppsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("ApiAlertAppsController")
@RestController
@RequestMapping("/apiAlertApps/*")
public class ApiAlertAppsController {
    @Autowired
    private IApiAlertAppsService apiAlertAppsService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public ApiAlertApps getApiAlertApps(ApiAlertApps apiAlertApps) {
        return this.apiAlertAppsService.get(apiAlertApps);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public ApiAlertApps saveApiAlertApps(ApiAlertApps apiAlertApps) {
        this.apiAlertAppsService.save(apiAlertApps);
        return apiAlertApps;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteApiAlertApps(ApiAlertApps apiAlertApps) {
        return this.apiAlertAppsService.delete(apiAlertApps);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateApiAlertApps(ApiAlertApps apiAlertApps) {
        return this.apiAlertAppsService.update(apiAlertApps);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<ApiAlertApps> listApiAlertApps(ApiAlertApps apiAlertApps) {
        return this.apiAlertAppsService.list(apiAlertApps);
    }
}