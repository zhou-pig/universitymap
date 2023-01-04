/**
 * -*- codeing = utf-8 -*-
 *
 * @Time :2023/1/3 16:31
 * @Author :zhou_pig
 * @File :UniversityService.java
 * @Software :IntelliJ IDEA
 */
package com.train.universitymap.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.train.universitymap.entity.University;

public interface UniversityService extends IService<University> {
    Page<University> queryUniversityByName(String name);
}
