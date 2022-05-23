package com.practice;

import java.util.Scanner;
/*
* Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign
*  it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are
* allowed. The length of A, B, C, or D can't be greater than 3.
*/

//https://www.regextutorial.org/regex-for-numbers-and-ranges.php
//https://www.debuggex.com/


//key point is to consider the following cases
/*
1. 0-255
2. 0-9
3. 0-99
solution     String pattern = "([0-1]\d{2}|2[0-4]\d|25[0-5]|2[0-4][0-5]|\d|\d\d)";

* */

class Solution {

    public static void main(String[] args){
        System.out.println(new MyRegex().pattern);
        System.out.println("255".matches("(^[0-1]\\d{2}|2[0-5][0-5]|\\d|\\d\\d)$"));
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    //String pattern2 = "^([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";

    //Don't even try to read this disgusting regex without online debugger
    String pattern = "^(([0-1]\\d{2}|2[0-4]\\d|25[0-5]|2[0-4][0-5]|\\d|\\d\\d)(\\.)){3}([0-1]\\d{2}|2[0-4]\\d|25[0-5]|2[0-4][0-5]|\\d|\\d\\d)$";


    //String pattern = "^([01]?[0-9][0-9]?|2[0-5][0-5])$";
}