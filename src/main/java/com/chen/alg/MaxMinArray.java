package com.chen.alg;

public class MaxMinArray {
    public static void main(String[] args) {
        // 第一组数据
        int[] arr1 = {12, 34, 56, 7, 89};
        System.out.println("最大值: " + findMax(arr1) + ", 最小值: " + findMin(arr1));

        // 第二组数据
        int[] arr2 = {-5, 0, 3, 15, -2};
        System.out.println("最大值: " + findMax(arr2) + ", 最小值: " + findMin(arr2));

        // 第三组数据
        int[] arr3 = {100, 50, 75};
        System.out.println("最大值: " + findMax(arr3) + ", 最小值: " + findMin(arr3));
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
