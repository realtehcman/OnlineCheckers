package com.practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        int[] arr = {1,4,32,7,2};
        System.out.println(Arrays.toString(solution.twoSum(arr, 33)));
        System.out.println(Arrays.toString(solution.twoSum(arr, 3)));
        System.out.println(Arrays.toString(solution.twoSum(arr, 8)));
        System.out.println(Arrays.toString(solution.twoSum(arr, 5)));
        System.out.println(Arrays.toString(solution.twoSum(arr, 11)));
    }
    
}
