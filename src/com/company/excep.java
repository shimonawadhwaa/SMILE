package com.company;
//in exception handling, exception is a class
//so many types of exceptions are there like ArithmeticException, ArrayIndexOutOfBounds, NullPointer, etc.
//these all have function called as getMessage()..which is inherited from paren classes
//parent classes include runtime exception class..then, exception class, and the most parent one is throwable class

public class excep {
    public static void main(String[] args) {
        System.out.println("start");
        int l=0;
        try {
            int div=5/l;
            System.out.println("division= "+div);
        }
        catch (ArithmeticException exp)
        {
            System.out.println("div by zero is invalid");
            System.out.println(exp.getMessage());
            System.out.println(exp.toString());
            exp.printStackTrace();
        }
        System.out.println("end");
    }
}
