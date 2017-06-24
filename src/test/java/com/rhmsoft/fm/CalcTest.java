package com.rhmsoft.fm;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit test for Calc.
 */
public class CalcTest {

    @Test(enabled = true, groups = {"add","all"}, priority=0)
    public void test_add() {
        Assert.assertEquals(Calc.add(2, 2), 4);
    }

    @Test(enabled = true, groups = {"subtract","all"}, priority=1)
    public void test_subtract() {
        Assert.assertEquals(Calc.subtract(4, 2), 2);
    }
    @Test(enabled = true, groups = {"multiply","all"}, priority=2)
    public void test_multiply() {
        Assert.assertEquals(Calc.multiply(3, 3), 9);
    }
    @Test(enabled = true, groups = {"divide","all"}, priority=3)
    public void test_divide() {
        Assert.assertEquals(Calc.divide(6, 3), 2);
    }
    @Test(enabled = true, expectedExceptions = ArithmeticException.class, groups = {"division","all"}, priority=4)
    public void test_divide_by_0() {
        Assert.assertEquals(Calc.divide(2, 0), 0);
    }
    @Test(enabled = true, groups = {"all"}, priority=4)
    public void test_object() {
        Calc o = new Calc();
    }

}
