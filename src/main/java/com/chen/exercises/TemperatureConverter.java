package com.chen.exercises;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TemperatureConverter {
    /**
     * 摄氏度转换为华氏度
     * @param celsius 摄氏度
     * @return 华氏度
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入摄氏度: ");
        if (sc.hasNextDouble()) {
            double c = sc.nextDouble();
            double f = cToF(c);
            //System.out.println("华氏度: " + (double)(Math.round(f*100)/100);
            System.out.println(c+"攝氏度 = " + formatTemperature(f,2)+"华氏度: ");
        } else {
            System.out.println("输入不是数字。");
        }
        sc.close();
    }
    /**
     * 格式化小数，保留指定位数
     * @param value 要格式化的值
     * @param decimalPlaces 保留的小数位数
     * @return 格式化后的值
     */
    public static String formatTemperature(double value, int decimalPlaces) {
        // 使用 BigDecimal 来控制小数位并四舍五入
        BigDecimal bigDecimal = new BigDecimal(value).setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bigDecimal.toString();
    }
}
