package com.stu.helloserver.service;
import com.stu.helloserver.dto.UserDTO;
import com.stu.helloserver.common.Result;

public interface UserService {
    Result<String> register(UserDTO userDTO);
    Result<String> login(UserDTO userDTO);
}