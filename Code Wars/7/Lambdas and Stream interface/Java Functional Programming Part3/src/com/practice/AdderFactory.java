package com.practice;

import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class AdderFactory {
    Thread
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static IntBinaryOperator create(int addTo) {
        new IntBinaryOperator(){
            @Override
            public int applyAsInt(int left, int right){
                return 0;
            }
        }.applyAsInt();

    }
}