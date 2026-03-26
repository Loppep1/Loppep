package com.stu.helloserver.mapper;

import com.stu.helloserver.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * MyBatis-Plus Mapper（无需手写SQL）
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}