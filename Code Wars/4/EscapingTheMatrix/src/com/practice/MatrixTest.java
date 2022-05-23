package com.practice;

import org.junit.Test;

public class MatrixTest {
    
    @Test(expected = Neo.class)
    public void test() {
        Matrix.enter();
    }
    
    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }
}
