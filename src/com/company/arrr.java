package com.company;

import java.util.ArrayList;

public class arrr {
    public static void main(String[] args) {
        ArrayList<koibhi> ary=new ArrayList<koibhi>();
        ary.add(new koibhi("gabbarsingh", 20000));
        ary.add(new koibhi("karan", 30000));
        System.out.println(ary);
        for(koibhi see:ary)
        {
            System.out.println(see);
        }
    }
}

class koibhi
{
    String name;
    int income;
    koibhi(String nm, int inc)
    {
        name=nm;
        income=inc;
        //System.out.println(name+ "    " +income);
    }
    public String toString()
    {
        return (name+" "+income);
    }
}
