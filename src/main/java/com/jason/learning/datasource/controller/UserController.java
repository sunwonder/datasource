package com.jason.learning.datasource.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-14 下午11:53
 **/
@Api("用户信息管理")
@RestController
@RequestMapping("/user/*")
public class UserController {

//    @Autowired
//    IUserService userService;
//
//    @ApiOperation("获取列表")
//    @RequestMapping("list")
//    public List<User> list(User user) {
//        return userService.list(user);
//    }
//
//
//    @RequestMapping("get")
//    public User get(User user) {
//        return userService.get(user);
//    }
//
//    @RequestMapping("update")
//    public int update(User user) {
//        return userService.update(user);
//    }
//
//    @ApiOperation("新增用户")
//    @RequestMapping("save")
//    public int save(User user) {
//        return userService.save(user);
//    }
//
//    @RequestMapping("delete")
//    public int delete(User user) {
//        return userService.delete(user);
//    }

}