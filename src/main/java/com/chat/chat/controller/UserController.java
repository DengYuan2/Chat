package com.chat.chat.controller;

import com.alibaba.fastjson.JSONObject;
import com.chat.chat.pojo.Users;
import com.chat.chat.pojo.vo.UsersVO;
import com.chat.chat.service.UserService;
import com.chat.chat.utils.IMoocJSONResult;
import com.chat.chat.utils.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import java.util.Map;


@RestController
@RequestMapping("u")
public class UserController {
    @Autowired
    private UserService userService;


//    public IMoocJSONResult registOrLogin(@RequestBody Users user) throws Exception {
    @CrossOrigin(origins = "http://10.13.65.181:8088",maxAge = 36000)
    @RequestMapping(value = "/registOrLogin", method = RequestMethod.POST)
    @ResponseBody
    public IMoocJSONResult registOrLogin(@RequestBody Map<String,String> reqMap) throws Exception {
//        JSONObject jsonObject = JSONObject.parseObject(msg);
        String username = reqMap.get("username");
        String password = reqMap.get("password");
        Users user;
        UsersVO usersVO = new UsersVO();
        //1. 判断用户名和密码不能为空
        if (StringUtils.isBlank(username)||StringUtils.isBlank(password)){
            return IMoocJSONResult.errorMsg("用户或密码不能为空哦~~~");
        }
        //判断用户名是否存在，存在就登录，不存在就注册
        boolean exist = userService.isUsernameExist(username);
        System.out.println(exist);
        Users userResult;
        if (exist){
            //1.1 登录
            userResult = userService.queryUserForLogin(username,MD5Utils.getMD5Str(password));
            if (userResult==null){
                return IMoocJSONResult.errorMsg("用户名或密码不正确~~~");
            }
        }else{
            //1.2 注册
            user = new Users();
            user.setUsername(username);
            user.setNickname(username);
            user.setFaceImage("");
            user.setFaceImageBig("");
            user.setPassword(MD5Utils.getMD5Str(password));
            userResult =userService.saveUser(user);
        }
        BeanUtils.copyProperties(userResult,usersVO);

        return IMoocJSONResult.ok(usersVO);//返回给前端的用户对象
    }
}
