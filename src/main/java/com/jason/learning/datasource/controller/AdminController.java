package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.Admin;
import com.jason.learning.datasource.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("AdminController")
@RestController
@RequestMapping("/admin/*")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public Admin getAdmin(Admin admin) {
        return this.adminService.get(admin);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public Admin saveAdmin(Admin admin) {
        this.adminService.save(admin);
        return admin;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteAdmin(Admin admin) {
        return this.adminService.delete(admin);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateAdmin(Admin admin) {
        return this.adminService.update(admin);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<Admin> listAdmin(Admin admin) {
        return this.adminService.list(admin);
    }
}