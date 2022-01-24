package com.tjwoods.test;

import com.tjwoods.demo.Student;

public class MyTest {

    public static void main(String[] args) {
        // 这里可以使用到 com.tjwoods.demo.Student 是来自于 java9demo
        final Student student = new Student().setId("fakeId").setName("fakeName");
        System.out.println(student);
    }
}
