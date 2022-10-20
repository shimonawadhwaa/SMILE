package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.util.Arrays.*;


public class Cabcodechef {
    public static void main(String[] args) throws Exception {
        int T;


        Scanner cin = new Scanner(System.in);
        T = cin.nextInt();
        while (T-- > 0) {
            int length=cin.nextInt();
            String s1=cin.next();
            String s2=cin.next();
            String c="";
            String result = "";
            for (int i = 0; i < s1.length(); i++){

                char ch = s1.charAt(i);
                if (s2.indexOf(ch) != -1){
                    c = c + ch;
                    if (!result.contains("" + c.charAt(i)))
                        result += "" + c.charAt(i);

                }
            }
//            String result = "";
//            for (int i = 0; i < c.length(); i++)
//                if (!result.contains("" + c.charAt(i)))
//                    result += "" + c.charAt(i);
            int j=0;
            int count1=0;
            int count2=0;
            int max=0;
            for(j=0;j<result.length();j++) {
                for (int i = 0; i < s1.length(); i++) {
                    if (result.charAt(j) == s1.charAt(i)) {
                        count1++;
                    }
                    if (result.charAt(j) == s2.charAt(i)) {
                        count2++;
                    }

                }
                if (count1 < count2) {
                    if (count1 > max)
                        max = count1;
                } else {
                    if (count2 <= count1) {
                        if (count2 > max)
                            max = count2;
                    }
                }
                count1=0;
                count2=0;
            }
            System.out.println(max);



        }
   }


}


