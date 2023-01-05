package com.train.universitymap.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.train.universitymap.entity.User;

public interface UserService extends IService<User> {

    int loginCheck(String account,String password);
    int addUser(String account,String password);
}
