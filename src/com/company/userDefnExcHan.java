package com.company;

class floatDivisionException extends Exception{
    floatDivisionException(String msg)
    {
        super(msg);
    }
}
public class userDefnExcHan {
    public static void main(String[] args) {

        float y=0.0f;
        int x=5;
        System.out.println("start");
        try {
        if(y==0.0f){
            throw new floatDivisionException("division by float is not allowed");
        }
        else{

            System.out.println(x/y);
            }
        }
            catch(floatDivisionException exp)
            {
                exp.printStackTrace();
            }

        System.out.println("end");
    }
}

/*                        VERY VERY IMPORTANT THEORY
17. line mein jo hamne likha...vahi same kaam jvm krta hai jab ham try catch lgaate hai..yahan isliye krna pdaa because we want ispr exception handling..therefore it is user defined exception Hnadling
3. line mein hamne khud se class bnaai..and exception class inherit ki just like that in checked Exceptions
6. line mein hamne msg ko exception mein pohonchaya
Internally..yahi msg aage tthrowable mein ja raha hai and iski value DETAILED MSG ko milti hai..so jab ham getMessage() call kraate hai to vo DETAILED MSG ki value return krta hai
ham msg throwable ko super isliye kraate hai because sabhi function like getMessage() usi mein hi hai.
*/