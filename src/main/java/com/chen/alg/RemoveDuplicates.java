package com.chen.alg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // 第一组数据
        int[] arr1 = {1, 2, 3, 3, 4, 5, 5};
        System.out.println("去重后的数组: " + Arrays.toString(removeDuplicates(arr1)));

        // 第二组数据
        int[] arr2 = {10, 20, 30, 20, 30};
        System.out.println("去重后的数组: " + Arrays.toString(removeDuplicates(arr2)));

        // 第三组数据
        int[] arr3 = {1, 1, 1, 1, 1};
        System.out.println("去重后的数组: " + Arrays.toString(removeDuplicates(arr3)));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }
}
