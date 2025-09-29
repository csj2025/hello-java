package com.chen.alg;

import java.text.DecimalFormat;

public class AverageScore {
    public static void main(String[] args) {
        // 第一组数据
        double[] scores1 = {88.5, 90.0, 78.3, 92.5};
        System.out.println("平均分: " + calculateAverage(scores1));

        // 第二组数据
        double[] scores2 = {60.0, 75.0, 80.0, 90.0};
        System.out.println("平均分: " + calculateAverage(scores2));

        // 第三组数据
        double[] scores3 = {99.5, 88.0, 85.0};
        System.out.println("平均分: " + calculateAverage(scores3));
    }
    public static String calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(average);
    }
}
