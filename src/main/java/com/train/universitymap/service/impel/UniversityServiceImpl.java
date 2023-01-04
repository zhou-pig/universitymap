/**
 * -*- codeing = utf-8 -*-
 *
 * @Time :2023/1/3 16:33
 * @Author :zhou_pig
 * @File :UniversityServiceImpl.java
 * @Software :IntelliJ IDEA
 */
package com.train.universitymap.service.impel;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.train.universitymap.entity.University;
import com.train.universitymap.mapper.UniversityMapper;
import com.train.universitymap.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl extends ServiceImpl<UniversityMapper,University> implements UniversityService {
    @Autowired
    UniversityMapper universityMapper;
    @Override
    public Page<University> queryUniversityByName(String name) {
        QueryWrapper<University> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",name);
        Page<University> page=new Page<>(1,5);
        universityMapper.selectPage(page,queryWrapper);
        return page;
    }
}
