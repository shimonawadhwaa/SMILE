package com.company;
//we use runnable in threading if class is already inheriting some other class, since multiple inheritance is not allowed but multiple implements are allowed

public class implementValaThread {
    public static void main(String[] args) {
        one obj1=new one();
        two obj2=new two();
        Thread trd1=new Thread(obj1);
        Thread trd2=new Thread(obj2);
        trd1.start();
        trd2.start();
    }
}

class one implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
           try {
               Thread.sleep(1000);
           }
           catch(Exception exp)
           {
               exp.printStackTrace();
           }
            System.out.println(i);
        }
    }
}
class two implements Runnable
{
    public void run()
    {
        try {
            Thread.sleep(1000);
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
        for(int i=6;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
//if we do not want to create thread everytime for all classes in main and we dont wanna start everytime, then there is another method which is effective than this
//anotheer methood i am doing in Another class
