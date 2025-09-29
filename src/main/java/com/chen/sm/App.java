package com.chen.sm;

import com.chen.sm.model.Student;
import com.chen.sm.service.StudentService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentService svc = new StudentService();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("学生管理系统");
            System.out.println("1.添加学生 2.删除学生 3.修改学生 4.查询学生 5.列表 0.退出 ");
            String cmd = sc.nextLine().trim();
            switch (cmd){
                case "1"->{
                    System.out.print("id name age score: ");
                    String[] a = sc.nextLine().trim().split("\\s+");
                    if (a.length==4) {
                        boolean ok = svc.add(new Student(a[0], a[1], Integer.parseInt(a[2]), Double.parseDouble(a[3])));
                        System.out.println(ok ? "OK" : "FAIL(可能重复ID)");
                    } else System.out.println("格式: id name age score");

                }
                case "2"->{
                    System.out.print("id: ");
                    System.out.println(svc.remove(sc.nextLine().trim()) ? "OK" : "NOT FOUND"); break;
                }
                case "3"->{
                    System.out.print("id name? age? score?: ");
                    String[] b = sc.nextLine().trim().split("\\s+");
                    if (b.length>=1) {
                        String id=b[0]; String name=b.length>1?b[1]:null;
                        Integer age=b.length>2?Integer.parseInt(b[2]):null;
                        Double score=b.length>3?Double.parseDouble(b[3]):null;
                        System.out.println(svc.update(id,name,age,score)?"OK":"NOT FOUND");
                    } else System.out.println("至少提供 id");
                }
                case "4"->{
                    System.out.print("id: ");
                    System.out.println(svc.getById(sc.nextLine().trim()));
                }
                case  "5"->{
                    svc.listAll().forEach(System.out::println);
                }
                case  "0"->{
                    System.out.println("Bye");
                    return;
                }
                default->{
                    System.out.println("未知命令");
                }
            }
        }
    }
}
