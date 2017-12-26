package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.ApiInvoke;
import com.jason.learning.datasource.service.IApiInvokeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("ApiInvokeController")
@RestController
@RequestMapping("/apiInvoke/*")
public class ApiInvokeController {
    @Autowired
    private IApiInvokeService apiInvokeService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public ApiInvoke getApiInvoke(ApiInvoke apiInvoke) {
        return this.apiInvokeService.get(apiInvoke);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public ApiInvoke saveApiInvoke(ApiInvoke apiInvoke) {
        this.apiInvokeService.save(apiInvoke);
        return apiInvoke;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteApiInvoke(ApiInvoke apiInvoke) {
        return this.apiInvokeService.delete(apiInvoke);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateApiInvoke(ApiInvoke apiInvoke) {
        return this.apiInvokeService.update(apiInvoke);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<ApiInvoke> listApiInvoke(ApiInvoke apiInvoke) {
        return this.apiInvokeService.list(apiInvoke);
    }
}