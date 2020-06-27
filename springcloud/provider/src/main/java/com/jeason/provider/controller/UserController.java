package com.jeason.provider.controller;

import com.jeason.provider.mbg.model.User;
import com.jeason.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: jeason
 * @Description: userController
 * @Date: 2020/6/27 16:57
 */
@RestController
@RequestMapping("/user")
@Api(description = "user管理",tags = "userController")
public class UserController {
    @Autowired
    UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "allUsers", notes = "所有用户")
    @GetMapping("/allUsers")
    public List<User> allUsers(){
        return userService.allUsers();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "getUser", notes = "获取用户")
    public User getUser(@PathVariable("id") Integer id){
        LOGGER.info("id: "+id);
        return userService.getUser(id);
    }

    @PostMapping("/")
    @ApiOperation(value = "createUser", notes = "添加用户")
    public int createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/")
    @ApiOperation(value = "updateUser", notes = "更新用户")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteUser", notes = "删除用户")
    public int deleteUser(@PathVariable("id") Integer id){
        return userService.deleteUser(id);
    }

    @GetMapping("/test")
    @ApiOperation("test")
    public String test(@RequestParam("test") String test){
        return test;
    }
}
