package com.stu.helloserver.service;
import com.stu.helloserver.common.Result;
import com.stu.helloserver.common.ResultCode;
import com.stu.helloserver.dto.UserDTO;
import com.stu.helloserver.service.UserService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final Map<String,String> userMap = new HashMap<>();

    @Override
    public Result<String> register(UserDTO userDTO) {
        String username = userDTO.getUsername();
        if(userMap.containsKey(username)){
            return Result.failed(ResultCode.USER_HAS_EXISTED);
        }
        userMap.put(username,userDTO.getPassword());
        return Result.success("注册成功");
    }

    @Override
    public Result<String> login(UserDTO userDTO) {
        String username = userDTO.getUsername();
        if(!userMap.containsKey(username)){
            return Result.failed(ResultCode.USER_NOT_EXIST);
        }
        String password = userDTO.getPassword();
        if(!password.equals(userMap.get(username))){
            return Result.failed(ResultCode.PASSWORD_ERROR);
        }
        return Result.success("登录成功");
    }
}