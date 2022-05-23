package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.util.ArrayList;

public class SampleTest {
    
    @Test
    public void basicTests(){
        doTest(2, 2, "57");
        doTest(10, 3, "192");
        doTest(20, 9, "414347535");
        doTest(30, 12, "616771737983");
        doTest(40, 8, "83899710");
        doTest(50, 6, "031071");
        doTest(10000, 5, "02192");
        doTest(20000, 5, "09334");
    }
    
    private void doTest(int a, int b, String expected){
        assertEquals(expected, SimplePrimeStreaming.solve(a, b));
    }
    
    private ArrayList<Integer> arr = new ArrayList<>();
    
    //works
    @Test
    public void testingParser(){
        int i = 1243;
        recursive(i);
        arr.add(i % 10); //last digit
        arr.forEach(System.out::println);
    }
    
    private void recursive(int x){
        if(x < 10){
            return;
        }
        recursive(x /= 10);
        arr.add(x % 10);
    }
    
    
    
    @Test
    public void testingReverser(){
        
        int digit = 10;
        ArrayList<Integer> temp = new ArrayList<>();
        while(digit > 0){
            temp.add(digit % 10);
            digit /= 10; //taking off the last digit
        }
        
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for(int i2 = temp.size() - 1; i2 >= 0; i2--){
            primeNumbers.add(temp.get(i2)); //adding the !first! digit
        }
        primeNumbers.forEach(System.out::println);
    }
    
}
