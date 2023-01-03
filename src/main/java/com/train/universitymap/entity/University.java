/**
 * -*- codeing = utf-8 -*-
 *
 * @Time :2023/1/3 16:30
 * @Author :zhou_pig
 * @File :University.java
 * @Software :IntelliJ IDEA
 */
package com.train.universitymap.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class University {
    @TableId
    private Integer id;
    private String name;
    private String level;
    private String department;
    private String address;
    private String introduction;
    private String imgUrl;
}
