package com.chat.chat.service;

public interface UserService {
    //判断用户名是否存在
    boolean isUsernameExist(String username);

    //查看用户是否存在
    Users queryUserForLogin(String username,String pwd);

    //插入新用户
    Users saveUser(Users user);

    //修改用户记录
    Users updateUserInfo(Users user);
}
