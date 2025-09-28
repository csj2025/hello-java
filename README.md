# hello-java-starter

这是一个 **Java 17 + Maven** 的最小起步项目，已包含：
- `Hello.java`：Hello World
- `TemperatureConverter.java`：摄氏度 -> 华氏度转换（含简单方法）
- `LeapYear.java`：闰年判断
- `Calculator.java`：简易计算器（+ - * /）
- `TemperatureConverterTest.java`：JUnit 5 单元测试示例

## 如何在 IntelliJ 打开
1. 打开 IntelliJ IDEA -> **Open** -> 选择该项目目录（或直接选择 `pom.xml`）
2. 等待 Maven 依赖下载完成（右下角/右侧 Maven 面板可查看进度）
3. 在 `src/main/java/com/chen` 下右键 `Hello.java` -> **Run 'Hello.main()'**

## 运行各示例
- `Hello.java`：打印 "Hello, Java!"
- `TemperatureConverter.java`：控制台输入摄氏度后输出华氏度
- `LeapYear.java`：输入年份判断是否闰年
- `Calculator.java`：输入形如 `3 + 5` 的表达式得到结果

## 运行测试
- 在 Maven 面板或终端执行：`mvn -q -Dtest=TemperatureConverterTest test`

## 總結
- 今日新知
  - switch 对 String 也生效（Java 7+）”“强制类型转换的风险
  - switch 的 fall-through（及时 break）
  - 嵌套分支的可读性（早返回/卫语句/拆函数）
  - git init/clone/add/commit/push，.gitignore，分支模型简单认识
  - 流程控制（if-else、switch、for、while、do-while、break/continue）

- 今天最大困难与解决思路
  - 今天最大困难与解决思路→ 使用 nextLine()/next() 区分”
 
- 明日计划
  - 集合框架入门 + 3 道数组题