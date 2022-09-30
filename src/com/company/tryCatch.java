package com.company;


public class tryCatch {
    public static void main(String[] args) {
      sambhal ref=new sambhal();
      try {
          ref.doit();
      }
      catch(ArrayIndexOutOfBoundsException exr)
      {
          System.out.println("error");
      }
    }
}
class sambhal
{
    void doit()
    {
        int l=0;
        try {
        int div=5/l;
        System.out.println("div="+div);
        }
        catch(ArithmeticException exp)
        {
            System.out.println("got an error;)");
        }
    }

}
