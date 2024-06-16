package com.algaworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(5, calculator.add(2,3));
        Assert.assertEquals(-1, calculator.add(2,-3));
        Assert.assertEquals(0, calculator.add(0,0));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(-10, calculator.subtract(-5,5));
        Assert.assertEquals(5, calculator.subtract(2,-3));
        Assert.assertEquals(0, calculator.subtract(0,0));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(6, calculator.multiply(2,3));
        Assert.assertEquals(-6, calculator.multiply(2,-3));
        Assert.assertEquals(0, calculator.multiply(0,5));
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(2, calculator.divide(10,5), 0.001);
        Assert.assertEquals(4.5, calculator.divide(9,2), 0.001);
        Assert.assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
    }

}
