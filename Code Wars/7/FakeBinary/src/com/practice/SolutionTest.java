package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testSomethingFakeBinary(){
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }
    
    @Test
    public void testSomethingFakeBinary2(){
        assertEquals("01011110001100111", FakeBinary2.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary2.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary2.fakeBin("366058562030849490134388085"));
    }
}