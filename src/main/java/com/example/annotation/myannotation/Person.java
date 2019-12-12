package com.example.annotation.myannotation;

import java.lang.annotation.*;

/**
 * @Author zp
 * @create 2019/7/26 9:57
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Person {
    public String name();

    public int age() default  0;

}
