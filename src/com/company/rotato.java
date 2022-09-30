package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

 class rotato {

     public static void main(String... args) {
         Scanner cin=new Scanner(System.in);
         int t=cin.nextInt();
         while(t-- >0)
         {
             int a=cin.nextInt();
             int b=cin.nextInt();
             int n=cin.nextInt();
             double k=0;
             ArrayList<Integer> arr=new ArrayList<>();
             for(int i=0;i<n;i++)
             {
                 k =k+(a+(Math.pow(2,i)*b));
                 System.out.println((int)k);
             }
         }
     }
 }
