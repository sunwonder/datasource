package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.Role;
import com.jason.learning.datasource.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("RoleController")
@RestController
@RequestMapping("/role/*")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public Role getRole(Role role) {
        return this.roleService.get(role);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public Role saveRole(Role role) {
        this.roleService.save(role);
        return role;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteRole(Role role) {
        return this.roleService.delete(role);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateRole(Role role) {
        return this.roleService.update(role);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<Role> listRole(Role role) {
        return this.roleService.list(role);
    }
}