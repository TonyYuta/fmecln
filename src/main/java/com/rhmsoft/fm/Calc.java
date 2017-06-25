package com.rhmsoft.fm;

/**
 * Created by Yutaka on 6/3/17.
 */
public class Calc {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
        	throw new ArithmeticException();} return x / y;
    }

}
