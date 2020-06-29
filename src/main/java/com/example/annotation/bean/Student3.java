package com.example.annotation.bean;

import com.example.annotation.myannotation.Person;

/**
 * 动态注解
 * @Author zp
 * @create 2020/6/29 9:56
 */
@Person(name = "${test.name}")
public class Student3 {
    private String ttt;
}
