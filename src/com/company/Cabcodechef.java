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
            String p1=cin.next();
            String p2=cin.next();
            int n=cin.nextInt();
            String name[]=new String[n];
            for(int i=0;i<n;i++){
                name[i]=cin.next();
            }
            String s1="";
            s1=s1.concat(p1);
            s1=s1.concat(p2);
            char a[]=s1.toCharArray();
            ArrayList<Character> chars = new ArrayList<Character>();
            for (char c : s1.toCharArray()) {
                Character t=c;
                chars.add(t);
           }
            String s2="";
            for(int i=0;i<n;i++){
                s2=s2.concat(name[i]);
            }
            ArrayList<Character> child = new ArrayList<Character>();
            for (char c : s2.toCharArray()) {
                Character v=c;
                child.add(v);
            }
            for(int i=0;i<chars.size();i++){
                if(child.contains(chars.get(i))){
                    Character d=chars.get(i);
                    child.remove(d);
//                    chars.remove(i);
                }
            }
            if(child.size()==0){
                System.out.println("yes");
            }
            else System.out.println("no");

        }
   }


}


