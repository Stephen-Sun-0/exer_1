package com.jesse.exer_1.test;

public class TestString {
    public static void main(String[] args) {
        String str = "ab  cc   dd";
        String[] split = str.replace(" ",",").split(" ");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
