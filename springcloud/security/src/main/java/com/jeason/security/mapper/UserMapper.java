package com.jeason.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeason.security.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
