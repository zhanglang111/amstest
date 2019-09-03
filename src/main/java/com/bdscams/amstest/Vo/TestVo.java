package com.bdscams.amstest.Vo;

import lombok.Data;

import java.util.Date;

@Data
public class TestVo {
    private String name;
    private  Integer Score;
    private  Integer male;
    private Date birthday;

    public TestVo(String name, Integer score, Date birthday, Integer male) {
        this.name = name;
        Score = score;
        this.male = male;
        this.birthday = birthday;
    }
}
