package com.company;

import java.util.Scanner;

import static com.company.abba.input;

public class PassArray {
    public static void main(String[] args) {
        int N;
        System.out.println("enter N:");
        Scanner cin=new Scanner(System.in);
        N=cin.nextInt();
        int[] ary=new int[N];
        abba ref=new abba();
        input(ary,cin);


    }
}
class abba
{
    static void input(int[] arr, Scanner cin)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("enter no.:");
            arr[i]=cin.nextInt();
        }
        for (int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
