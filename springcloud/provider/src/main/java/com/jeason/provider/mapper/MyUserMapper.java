package com.jeason.provider.mapper;

import com.jeason.provider.mbg.model.User;
import com.jeason.provider.mbg.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyUserMapper {
    User getUserByName(String name);
}