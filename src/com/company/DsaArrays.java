package com.company;

import java.util.Scanner;



public class DsaArrays {
    public static void main(String[] args) {
        PerformFunc ref=new PerformFunc();
        int N;
        System.out.println("enter length of array:");
        Scanner cin=new Scanner(System.in);
        N=cin.nextInt();
        int[] ary=new int[N];
        for(int i=0;i<ary.length;i++)
        {
            System.out.println("enter element:");
            ary[i]=cin.nextInt();
        }
        // ref.doDelete(ary,cin,N);
        // ref.doInsert(ary,cin,N);


    }
}
class PerformFunc
{
    void doDelete(int[] ary, Scanner cin, int N)
    {
        int elem,count=0;
        System.out.println("Enter the element you wanna delete:");
        elem=cin.nextInt();
        for (int i=0;i<ary.length;i++)
        {
            if(ary[i]==elem)
            {
                count++;
            }
        }
        int[] arr=new int[N-count];
        int cnt=0;
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]==elem) {
                cnt++;
                continue;
            }
            else
                arr[i-cnt]=ary[i];
        }
        for(int i=0;i<ary.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    void doInsert(int[] ary, Scanner cin, int N)
    {
        int[] arr=new int[N+1];
        System.out.println("enter index and number u wanna add");
        int i=cin.nextInt();
        int n=cin.nextInt();
        for(int j=0;j<ary.length;j++)
        {
            arr[j]=ary[j];
        }
        arr[arr.length-1]=0;
        for (int j=arr.length-1; j>i ;j--)
        {
            arr[j]=ary[j-1];
        }
         arr[i]=n;
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
