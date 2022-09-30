package com.company;

import java.util.Scanner;

public class myArray {
    public static void main(String[] args) {
        arr ref=new arr();
        ref.input();
        ref.getMax();
        System.out.println(ref.max);
    }
}
class arr
{
    int[] A;
    int N,max;
    void input()
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("enter N:");
        N=cin.nextInt();
        A=new int[N];
        for(int i=0;i<A.length;i++)
        {
            System.out.println("enter value:");
            A[i]=cin.nextInt();
        }
    }
    void getMax()
    {
        max=A[0];
        for (int i=0;i<N;i++)
        {
            if(max<A[i])
                max=A[i];
        }
    }
}