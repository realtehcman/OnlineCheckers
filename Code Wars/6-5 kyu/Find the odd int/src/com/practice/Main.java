package com.practice;
/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.


[1,2,1,5,2] -> 5
[4,4,4,5,1,1,10,2,5,10,2] -> 4
[9,0,-1,0,9,8,8,9,10,9,10,10,10] -> -1
Basically, input array would always have ONLY ONE integer with ODD number of occurences and every other integer in array(if any) would
always occur EVEN number of times. You are asked to find the integer that occurs ODD number of times.
*/


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        int[] array = {1, 2, 1, 5, 2};

        System.out.println(FindOdd.findIt(array));
    }
}

class FindOdd {
    public static int findIt(int[] a){
        Set<Integer> integerSet = new HashSet<>();

        for(int i = 0; i < a.length; i++){
            if(integerSet.contains(a[i])){
                continue;
            }
            int temp = 1;
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    temp++;
                }
            }
            integerSet.add(a[i]);
            if(temp % 2 != 0){
                return a[i];
            }
        }
        return 0;
    }
}