package com.jesse.exer_1;

public class TestString {

    public static void main(String[] args) {

        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1); // true

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2); // false  因为java是jdk内置到常量池中的字符串，而jdk7之后intern()方法只是给常量池中留下一个引用，所以两者地址不同。

    }
}
