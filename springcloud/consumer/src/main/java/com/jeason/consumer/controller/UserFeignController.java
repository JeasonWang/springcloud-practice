package com.jeason.consumer.controller;

import com.jeason.providerclient.client.ProviderClient;
import com.jeason.providerclient.dto.CommonResult;
import com.jeason.providerclient.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jeason on 2019/8/29.
 */
@RestController
@RequestMapping("/user")
@Api("UserFeignController")
public class UserFeignController {
    @Autowired
    private ProviderClient providerClient;

    @ApiOperation(value = "allUsers", notes = "所有用户")
    @GetMapping("/allUsers")
    public CommonResult allUsers(){
        return providerClient.allUsers();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "getUser", notes = "获取用户")
    public CommonResult getUser(@PathVariable("id") Integer id){
        return providerClient.getUser(id);
    }

    @PostMapping("/")
    @ApiOperation(value = "createUser", notes = "添加用户")
    public CommonResult<String> createUser(@RequestBody User user){
        return providerClient.createUser(user);
    }

    @PutMapping("/")
    @ApiOperation(value = "updateUser", notes = "更新用户")
    public CommonResult<String> updateUser(@RequestBody User user){
        return providerClient.updateUser(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteUser", notes = "删除用户")
    public CommonResult<String> deleteUser(@PathVariable("id") Integer id){
        return providerClient.deleteUser(id);
    }

    @GetMapping("/test")
    @ApiOperation("test")
    public String test(@RequestParam("test") String test){
        return test;
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> getAuthCode(@RequestParam String telephone) {
        return providerClient.getAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> updatePassword(@RequestParam String telephone,
                                               @RequestParam String authCode) {
        return providerClient.updatePassword(telephone,authCode);
    }

}
