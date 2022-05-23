package com.practice;

import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        IntBinaryOperator f;

        f = AdderFactory.create(1); //Adds 1 to everything
        f.applyAsInt(4) == 5;
        f.applyAsInt(10) == 11;
        f.applyAsInt(-5) == -4;

    }
}
