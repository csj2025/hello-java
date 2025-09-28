package com.chen.exercises;
import java.util.Scanner;
public class TemperatureConverter {
    public static double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入摄氏度: ");
        if (sc.hasNextDouble()) {
            double c = sc.nextDouble();
            double f = cToF(c);
            System.out.println("华氏度: " + f);
        } else {
            System.out.println("输入不是数字。");
        }
        sc.close();
    }
}
