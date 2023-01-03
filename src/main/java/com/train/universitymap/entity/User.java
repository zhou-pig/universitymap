package com.train.universitymap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    private String account;

    private String password;

}
