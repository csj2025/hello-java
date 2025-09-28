package com.chen.exercises;
import java.util.Scanner;

/**
 * 闰年判断：输入年份，判断是否闰年（被 4 整除且不被 100 整除，或被 400 整除）
 */
public class LeapYear {
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        // 在主方法中进行一些简单测试
        System.out.println("2000 是闰年吗？ " + isLeap(2000)); // 应该是 true
        System.out.println("1900 是闰年吗？ " + isLeap(1900)); // 应该是 false
        System.out.println("2024 是闰年吗？ " + isLeap(2024)); // 应该是 true
    }
}
