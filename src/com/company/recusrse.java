package com.company;

public class recusrse {
    public static void main(String[] args) {
        //int nums[]={1,2,3,4,5,6,9,14,18};
        //int i=0;
        //koisi.aryIterate(nums[i], i);
        //int b=koisi.factorial(5);
        //System.out.println(b);
    }
}
class koisi {
    public static void aryIterate(int nums, int i) {
        int ary[]={1,2,3,4,5,6,9,14,18};
        System.out.println(nums);
        if(i==8)
            return;
        i++;
        aryIterate(ary[i], i);
    }
    static int factorial(int n)
    {
        int fact;
        if(n==0)
        {
            return 1;
        }
            fact=factorial(n-1)*n;
        return fact;
    }
}

