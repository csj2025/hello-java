package com.chen.exercises;
import java.util.Scanner;

/**
 * 简单计算器（switch）：输入 a op b，支持 + - * /，注意除零处理
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入表达式（例如：3 + 5）: ");
        double a;
        double b;
        String op;
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("第一个数输入错误");
            sc.close();
            return;
        }
        if (sc.hasNext()) {
            op = sc.next();
        } else {
            System.out.println("运算符缺失");
            sc.close();
            return;
        }
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println("第二个数输入错误");
            sc.close();
            return;
        }
        double result;
        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) {
                    System.out.println("除数不能为 0");
                    sc.close();
                    return;
                }
                result = a / b; break;
            default:
                System.out.println("不支持的运算符: " + op);
                sc.close();
                return;
        }
        System.out.println("结果: " + result);
        sc.close();
    }
}
