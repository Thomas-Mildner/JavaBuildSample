package de.ro.th.javabuildsample.businessLogic;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator
{
    @Test
    public void testAdd(){
       int result = Calculator.add(2,3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testMultiply(){
    int result = Calculator.multiply(1,4);
    Assert.assertEquals(4, result);
    }
}
