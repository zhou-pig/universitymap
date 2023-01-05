package com.train.universitymap.service.impel;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.train.universitymap.entity.User;
import com.train.universitymap.mapper.UserMapper;
import com.train.universitymap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpel extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int loginCheck(String account, String password) {
        User user = userMapper.loginCheck(account, password);
        if (user != null){
            return 1;
        }
        return 2;
    }

    @Override
    public int addUser(String account, String password) {

        if (userMapper.addUser(account, password)!=0){
            return 1;
        }
        return 2;
    }


}
