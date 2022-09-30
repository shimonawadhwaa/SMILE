package com.company;

import java.security.spec.RSAOtherPrimeInfo;

//another way of implementVala Thread
public class Another {
    public static void main(String[] args) {
        Process1 obj1=new Process1(0,5,"java");
        Process2 obj2=new Process2(6,10,"Programmers");

    }
}
class Process1 implements Runnable
{
    int sp, ep;
    String name;
    Thread trd1;
    Process1(int s, int e, String n)
    {
        sp=s;
        ep=e;
        name=n;
        Thread trd1=new Thread(this);//cyclic composition because iss class mein thread ka ref hai aur thread class mein iska reference
        trd1.start();
        trd1.setName(name);
        //trd1.setPriority(1);//10 is max priority and 0 is min
    }
    public void run()
    {
        for(int i=sp;i<=ep;i++)
        {

                System.out.println(trd1.getName()+" "+i);

        }
    }
}
class Process2 implements Runnable
{
    int sp, ep;
    String name;
    Thread trd2;
    Process2(int s, int e, String n)
    {
        sp=s;
        ep=e;
        name=n;
        Thread trd2=new Thread(this);//cyclic composition because iss class mein thread ka ref hai aur thread class mein iska reference
        trd2.start();
        //trd2.setName(name);//this isnt working ..idk why
        //trd2.setPriority(10);
    }
    public void run()
    {
        for(int i=sp;i<=ep;i++)
        {
            System.out.println(/*trd2.getName()+" "+*/i);


        }
    }
}
