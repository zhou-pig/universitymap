package com.train.universitymap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.train.universitymap.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User loginCheck(String account,String password);

    int addUser(String account, String password);
}
