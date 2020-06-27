package com.jeason.providerclient.client;

import com.jeason.providerclient.dto.CommonResult;
import com.jeason.providerclient.dto.User;
import com.jeason.providerclient.fallback.ProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "provider-service",path = "/user", fallback = ProviderFallback.class)
public interface ProviderClient {

    @GetMapping("/allUsers")
    CommonResult<List<User>> allUsers();

    @GetMapping("/{id}")
    CommonResult<User> getUser(@PathVariable("id") Integer id);

    @PostMapping("/")
    CommonResult<String> createUser(@RequestBody User user);

    @PutMapping("/")
    CommonResult<String> updateUser(@RequestBody User user);

    @DeleteMapping("/{id}")
    CommonResult<String> deleteUser(@PathVariable("id") Integer id);

    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    CommonResult<String> getAuthCode(@RequestParam String telephone);

    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    CommonResult<String> updatePassword(@RequestParam String telephone,
                                               @RequestParam String authCode);
}
