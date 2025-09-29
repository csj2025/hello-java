package com.chen;

public class Hello {
    public static void main(String[] args) {
        // 打印 "Hello, World!"
        System.out.println("Hello, World!");

        // 打印 Java 版本
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // 打印操作系统名称
        System.out.println("OS Name: " + System.getProperty("os.name"));

        // 打印当前工作目录
        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
    }
}
