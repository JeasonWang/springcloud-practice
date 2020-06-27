package com.jeason.provider.service;

import com.jeason.provider.mbg.mapper.UserMapper;
import com.jeason.provider.mbg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jeason
 * @Description: UserService
 * @Date: 2020/6/27 16:59
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> allUsers(){
        return userMapper.selectByExample(null);
    }

    public User getUser(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public int createUser(User user){
        int result = userMapper.insert(user);
        if (result == 0){
            throw new RuntimeException("添加User失败");
        }
        return result;
    }

    public int deleteUser(Integer id){
        int result = userMapper.deleteByPrimaryKey(id);
        if (result == 0){
            throw new RuntimeException("删除User失败");
        }
        return result;
    }

    public int updateUser(User user){
        int result = userMapper.updateByPrimaryKey(user);
        if (result == 0){
            throw new RuntimeException("更新User失败");
        }
        return result;
    }
}
