package com.practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a = Kata.flattenAndSort(new int[][]{
                {3, 2, 1},
                {7, 9, 8},
                {6, 4, 5}});
        
        Arrays.stream(a).forEach(System.out::println);
    
    }
}
