package com.chen;
import java.util.Scanner;
public class LeapYear {
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份: ");
        if (sc.hasNextInt()) {
            int y = sc.nextInt();
            System.out.println(isLeap(y) ? "闰年" : "平年");
        } else {
            System.out.println("输入不是整数。");
        }
        sc.close();
    }
}
