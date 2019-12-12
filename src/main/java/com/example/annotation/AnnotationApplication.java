package com.example.annotation;

import com.example.annotation.bean.Student;
import com.example.annotation.bean.Student2;
import com.example.annotation.parseannotation.ParsePerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication {

    public static void main(String[] args) {
//        Student student = new Student();
//        ParsePerson.parse(Student.class);
//        ParsePerson.parse(Student2.class);
        ParsePerson.parse("com.example.annotation.bean");
        SpringApplication.run(AnnotationApplication.class, args);
    }

}
