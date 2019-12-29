package com.chat.chat.service.impl;

import com.chat.chat.mapper.UsersMapper;
import com.chat.chat.org.n3r.idworker.Sid;
import com.chat.chat.pojo.Users;
import com.chat.chat.pojo.UsersExample;
import com.chat.chat.service.UserService;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean isUsernameExist(String username) {
        UsersExample usersExample= new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(username);
        List<Users> users = usersMapper.selectByExample(usersExample);
        return users.size()>0?true:false;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users queryUserForLogin(String username, String pwd) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(pwd);
        List<Users> users = usersMapper.selectByExample(usersExample);//如果有，应该只会返回一个
        if (users.size()>0)
            return users.get(0);
        else return null;
    }

    @Override
    public Users saveUser(Users user) {
        //TODO 为每一个用户生成一个唯一的二维码
        user.setQrcode("");
        //该方法生成一个唯一的随机的userId，而不是让数据库生成
        user.setId(sid.nextShort());
        usersMapper.insert(user);
        return user;//因为还要把该用户返回到前端
    }
}
