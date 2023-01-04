/**
 * -*- codeing = utf-8 -*-
 *
 * @Time :2023/1/3 16:33
 * @Author :zhou_pig
 * @File :UniversityMapper.java
 * @Software :IntelliJ IDEA
 */
package com.train.universitymap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.train.universitymap.entity.University;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UniversityMapper extends BaseMapper<University> {
}
