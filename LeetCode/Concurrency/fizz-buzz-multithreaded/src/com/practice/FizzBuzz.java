package com.practice;

import java.util.function.IntConsumer;

class FizzBuzz {
    private final int n;
    private int i = 1;
    
    public FizzBuzz(int n){
        if(n < 1 || n > 50){
            throw new IllegalArgumentException("1 <= n <= 50");
        }
        this.n = n;
    }
    
    // printFizz.run() outputs "fizz".
    synchronized public void fizz(Runnable printFizz) throws InterruptedException{
        while(i <= n){
            if((i % 3 == 0) && (i % 5 != 0)){
                printFizz.run();
                i++;
                notifyAll();
            }
            else wait();
        }
    }
    
    // printBuzz.run() outputs "buzz".
    synchronized public void buzz(Runnable printBuzz) throws InterruptedException{
        while(i <= n){
            if((i % 5 == 0) && (i % 3 != 0)){
                printBuzz.run();
                i++;
                notifyAll();
            }
            else wait();
        }
    }
    
    // printFizzBuzz.run() outputs "fizzbuzz".
    synchronized public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException{
        while(i <= n){
            if((i % 3 == 0) && (i % 5 == 0)){
                printFizzBuzz.run();
                i++;
                notifyAll();
            }
            else wait();
        }
    }
    
    // printNumber.accept(x) outputs "x", where x is an integer.
    synchronized public void number(IntConsumer printNumber) throws InterruptedException{
        while(i <= n){
            if(i % 3 == 0 || i % 5 == 0){
                wait();
            }
            else{
                printNumber.accept(i);
                i++;
                notifyAll();
            }
        }
    }
}
    
