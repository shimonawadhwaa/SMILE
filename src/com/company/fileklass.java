package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileklass {
    public static void main(String[] args) throws Exception {
        //File ref=new File("D://abcd//heyyy");
        //System.out.println(ref.getAbsoluteFile());
       // File ref2=new File("cmd.java");
        //System.out.println(ref2.getCanonicalPath());
       /* File ref3=new File("D://abcd//","hello");
        if(ref3.exists())
        {
            ref3.delete();
            System.out.println("hello file deleted");
        }

        else
        {
            System.out.println("fie not Found");
        }*/
        /*File dir=new File("D://abcd//");
        File path=new File(dir,"jAVA");
        if(path.exists())
        {
            System.out.println(path.renameTo(new File("D://abcd//javalearners")));
        }
        else
        {
            System.out.println("file not found/file with this name already exists");
        }*/
       /* File directory=new File("C://users");
        File arr[]=directory.listFiles();
        for (File ref:arr) {
            System.out.println(ref.getName());
        }*/
        System.out.println("enter path");
        Scanner cin=new Scanner(System.in);
        String s1=cin.nextLine();
        File ref5=new File(s1);
        File arr[]=ref5.listFiles();
        int i= arr.length;
        abc hel=new abc();
        hel.fil(arr[i-1],i);

    }


}
class abc
{
    void fil(File f1, int i) throws Exception
    {
        f1.getName();
        if(i==0)
        {
            System.out.println("done");
        }
        else
        {
            System.out.println(f1.getName());
            i--;
            fil(f1,i);
        }

    }
}

