package com.company;

import java.util.Locale;

public class stringklass {
    public static void main(String[] args) {
        String ref1=new String("      heiiii       ");
        ref1=ref1.toUpperCase();
        System.out.println(ref1);
        ref1=ref1.toLowerCase();
        System.out.println(ref1);
        ref1=ref1.trim();
        System.out.println(ref1);
        String ref2=new String("aman raman aman sham nayan aman");
        /*String name[]=ref2.split(" ");
        int i=0;
        for (String ary:name) {
            System.out.println(ary);

            if(ary=="aman")
            {
                System.out.println("found at "+i+" position");
            }
            else
            {
                for (int j=0;j<=ary.length();j++)
                {
                    i++;
                    System.out.println(i);
                }
            }
        }*/
        //mistake in this commented program
        String s1=new String("D:/manalipics/me.jpg");
        String ary[]=s1.split("/");
        for (int i=0; i<ary.length; i++ )
        {
            if(i==(ary.length-1))
            {
                System.out.println(ary[i]);
            }
        }




    }
}
