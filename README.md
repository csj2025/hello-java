# hello-java-starter

## 介绍
这是一个 **Java 17 + Maven** 的最小起步项目，已包含：
这是一个简单的 学生管理系统，提供了对学生数据的增、删、改、查等基本操作。系统使用了 Java 编写，并采用了 List 和数据结构来存储学生信息，具有简单易用的功能
## 功能概述
- 添加学生：可以新增学生信息。
- 删除学生：根据学生 ID 删除学生。
- 更新学生信息：修改学生的姓名、年龄和成绩等信息。
- 查询学生信息：根据学生 ID 获取学生信息。
- 列出所有学生：查看系统中所有学生的信息。
## 項目结构
```
StudentManagementSystem/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── chen/
│   │               └── sm/
│   │                   └── service/
│   │                       └── StudentService.java   // 学生管理服务
│   │                       └── StudentServiceTest.java // 单元测试
│   │                   └── model/
│   │                       └── Student.java  // 学生模型
└── README.md                
```

## JDK 版本
- Java 17
## Maven命令
- `mvn clean` 清理项目
- `mvn compile` 编译项目
- `mvn test` 运行测试
- `mvn package` 打包项目
- `mvn install` 安装项目到本地仓库
- `mvn deploy` 发布项目到远程仓库
## 依赖管理
## 如何在 IntelliJ 打开
1. 打开 IntelliJ IDEA -> **Open** -> 选择该项目目录（或直接选择 `pom.xml`）
2. 等待 Maven 依赖下载完成（右下角/右侧 Maven 面板可查看进度）
3. 在 `src/main/java/com/chen` 下右键 `Hello.java` -> **Run 'Hello.main()'**

## 运行各示例
- 创建学生服务实例
  - `StudentService studentService = new StudentService()`
- 添加学生
  - `studentService.add(new Student(1, "张三", 20, 90))`
  - 注意：`Student` 类需要自己定义，并在 `StudentService` 中使用。
- 查询学生
  - `Student student = studentService.getById(1)`
  - `System.out.println(student)`
  - 输出：`Student{id=1, name='张三', age=20, score=90}`
- 更新学生
  - `boolean updateResult = studentService.update("1", "Jane", 21, 95.0);`
  - `System.out.println("更新学生: " + (updateResult ? "成功" : "失败"));`
  - 输出：`更新学生: 成功`
- 删除学生
  - `boolean removeResult = studentService.remove("1");`
  - `System.out.println("删除学生: " + (removeResult ? "成功" : "失败"));`
  - 输出：`删除学生: 成功`
- 列出所有学生
  - `List<Student> students = studentService.listAll();`
  - `students.forEach(System.out::println);`
  - 输出：`Student{id=1, name='Jane', age=21, score=95.0}`
## 运行测试
- 在 Maven 面板或终端执行：`mvn -q -Dtest=StudentServiceTest test`

## 总结
- 今日新知
  - 集合、迭代、equals/hashCode、菜单循环、异常处理

- 今天最大困难与解决思路
  - 如 Scanner 读取、NumberFormatException
 
- 明日计划
  - 面向对象与 Stream（用 Stream 重构部分查询/排序）