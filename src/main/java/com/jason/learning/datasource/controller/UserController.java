package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.User;
import com.jason.learning.datasource.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("UserController")
@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public User getUser(User user) {
        return this.userService.get(user);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public User saveUser(User user) {
        this.userService.save(user);
        return user;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteUser(User user) {
        return this.userService.delete(user);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateUser(User user) {
        return this.userService.update(user);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<User> listUser(User user) {
        return this.userService.list(user);
    }
}