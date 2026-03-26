package com.stu.helloserver.dto;
/**
 * DTO：仅接收前端用户名、密码（文档要求：隔离实体类）
 */
public class UserDTO {
    private String username;
    private String password;

    // getter & setter
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}