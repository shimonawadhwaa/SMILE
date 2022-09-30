package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.util.Arrays.*;


public class Cabcodechef {
    public static void main(String[] args) {
        int T;


        Scanner cin = new Scanner(System.in);
        T = cin.nextInt();
        while (T-- > 0) {
            int n=cin.nextInt();
            int arr[]=new int[n];
            int ary[]=new int[n];
           for(int i=0;i<arr.length;i++){
              arr[i]=cin.nextInt();
               }
           int count=0;
           int k=0;
           Arrays.sort(arr);
          for(int i=0;i<arr.length-1;i++) {
              if(arr[i]==arr[i+1]){
                  count++;
                  k=count+k;
                  continue;
              }
              if(arr[i]!=arr[i+1]){
                  count=0;
                  continue;
              }
          }
            System.out.println(k);
              }

        }
        }



