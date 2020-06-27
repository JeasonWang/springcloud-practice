package com.jeason.providerclient.fallback;

import com.jeason.providerclient.client.ProviderClient;
import com.jeason.providerclient.dto.CommonResult;
import com.jeason.providerclient.dto.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProviderFallback implements ProviderClient {

    @Override
    public CommonResult<List<User>> allUsers() {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<User> getUser(Integer id) {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<String> createUser(User user) {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<String> updateUser(User user) {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<String> deleteUser(Integer id) {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<String> getAuthCode(String telephone) {
        return CommonResult.failed("连接失败");
    }

    @Override
    public CommonResult<String> updatePassword(String telephone, String authCode) {
        return CommonResult.failed("连接失败");
    }
}
