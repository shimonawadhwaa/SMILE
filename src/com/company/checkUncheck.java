package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkUncheck
    {
    public static void main(String[] args) throws Exception //throws IOException //we should not throw exception here..because we make checked exception as unchecked by doig so, since exception remains unhandled in the program and is given to jvm to sort it
    {
        checkUncheck abc=new checkUncheck();
        abc.Input();
        try {
            abc.Input2();
        } catch (IOException exr) {
            exr.printStackTrace();
        }

    }
    void Input() throws Exception
    {
        InputStreamReader ref=new InputStreamReader(System.in);
        BufferedReader isr=new BufferedReader(ref);
        System.out.println("enter your name= ");
            String name=isr.readLine();
            System.out.println("name= "+name);


    }
    void Input2() throws IOException
    {
        InputStreamReader ref=new InputStreamReader(System.in);
        BufferedReader isr=new BufferedReader(ref);
        System.out.println("enter your name= ");
            String name=isr.readLine();
            System.out.println("name= "+name);


    }
}
