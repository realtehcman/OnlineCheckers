package com.practice;

import java.util.function.ToDoubleFunction;

/*
* Write a function that sets the area of the given Triangle and returns the area as a double.
* Do not use the function type Function; there is a function type for converting an arbitrary class into a double, use that.

The formula for triangle area is: 1/2 * base * height

Assume valid input (base and height are both greater than 0).
* */
public class FunctionalProgramming {
    public static ToDoubleFunction<Triangle> f = f -> {
        f.setArea(0.5 * f.base * f.height);
        return f.getArea();
    };


    //Make me a function.
    //Don't use Function. Find the appropriate function to turn an
    //arbitrary class into a double. Remember the import.
}