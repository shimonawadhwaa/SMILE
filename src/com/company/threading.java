package com.company;
//thread doesnt work on a concept of running programs paralelly..whereas it works on a concept of switching from functions
//if we create thread objects of two classes, in actual there become three threads..one of main class too
// working parallely is a work of cpu and switching is a work of thread
//internally different stacks are being created for different threads
public class threading {
    public static void main(String[] args) {
        first trd1=new first();//this is not normal object..this is object of a thread
        second trd2=new second();
        trd1.start();//thread ki start class first k run function ko chla ri hai
        trd2.start();//if we write start od trd 1 first doesnt mean it will work first, they are just making ready queue by doing so
        trd1.setName("java");
        trd2.setName("programmers");
    }
}
class first extends Thread
{
    public void run()
    {

         for(int i=0; i<=5; i++)
         {

             try {
                 sleep(1000);//sleep is a static method of thread class
             }
             catch(Exception exp)
             {
                 exp.printStackTrace();
             }

             System.out.println(getName()+i);
         }
    }
}
class second extends Thread
{
    public void run()
    {

        for(int i=6; i<=10; i++)
        {
            try {
                sleep(1000);
            }
            catch(Exception exp)
            {
                exp.printStackTrace();
            }

            System.out.println(getName()+i);
        }
    }
}

