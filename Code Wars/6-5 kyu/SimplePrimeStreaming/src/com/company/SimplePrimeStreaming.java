package com.company;
/* CODE WARS Simple prime streaming
* Consider a sequence made up of the consecutive prime numbers. This infinite sequence would start with:

"2357111317192329313741434753596167717379..."

You will be given two numbers: a and b, and your task will be to return b elements starting from index a in this sequence.

For example:
solve(10,5) == `19232` Because these are 5 elements from index 10 in the sequence.

Tests go up to about index 20000.

More examples in test cases. Good luck!
* */

import java.util.ArrayList;
import java.util.Objects;

public class SimplePrimeStreaming {
    private static ArrayList<Integer> primeNumbers = new ArrayList<>();
    
    public static String solve(int a, int b){
        for(int i = 2; primeNumbers.size() <= 20004; i++){
            if((i % 2 == 0) && (i != 2)) continue;
            int count = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            
            if(count == 1){
                int digit = i;
                ArrayList<Integer> temp = new ArrayList<>();
                while(digit > 0){
                    temp.add(digit % 10);
                    digit /= 10; //taking off the last digit
                }
                for(int i2 = temp.size() - 1; i2 >= 0; i2--){
                    primeNumbers.add(temp.get(i2)); //adding the !first! digit
                }
            }
        }
        
        ArrayList<Integer> retriever = new ArrayList<>();
        for(int i2 = 0; i2 < b; i2++){
            retriever.add(primeNumbers.get(a++));
        }
        return retriever.toString().replaceAll("\\W", "");
    }
    
    private static void recursiveParsing(int x){
        if(x < 10){
            return;
        }
        recursiveParsing(x /= 10);
        primeNumbers.add(x % 10);
    }
}
