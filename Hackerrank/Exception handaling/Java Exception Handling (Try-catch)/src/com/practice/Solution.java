package com.practice;

import java.util.*;

//All these exceptions are UNCHECKED

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x, y;
        try{
            System.out.print("Enter the x number: ");
            x = scanner.nextInt();

            System.out.print("Enter the y number: ");
            y = scanner.nextInt();
            System.out.println(x / y);
        }
        catch(InputMismatchException | ArithmeticException e){
            if(e instanceof InputMismatchException)
                System.out.println(e.getClass().getName()); //instead of System.out.println("java.util.InputMismatchException");
            else
                System.out.println(e.toString());
        }
    }
}
