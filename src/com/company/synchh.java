package com.company;

public class synchh {
    public static void main(String[] args) {
        tdd1 trd1 = new tdd1();
        tdd2 trd2 = new tdd2();
        karo bb=new karo();
        trd1.kuchBhi(5,bb);
        trd2.kucBhi(10,bb);
        trd1.start();
        trd2.start();
    }
}
 class karo
{
    void print(int n)
    {
        int val;
        for(int i=0; i<=10;i++)
        {
            val=n*i;
            System.out.println(val+"= "+n+"*"+i);
        }
    }
}
class tdd1 extends Thread
{

    karo ptr;
    int n;
    void kuchBhi(int n1, karo l)
    {
        n=n1;
        ptr=l;

    }
    public void run()
    {
        ptr.print(n);
    }
}
class tdd2 extends Thread
{

    karo ptrs;
    int nn;
    void kucBhi(int n2, karo le)
    {
        nn=n2;
        ptrs=le;

    }
    public void run()
    {
        synchronized (ptrs)
        {
            ptrs.print(nn);
        }

    }
}