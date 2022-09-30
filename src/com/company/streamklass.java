package com.company;

import javax.swing.*;
import java.io.*;

public class streamklass {
    public static void main(String[] args) throws IOException {
        File src=new File("C://root.png");
        FileInputStream read=new FileInputStream(src);
        FileOutputStream write=new FileOutputStream("c://heyo.png");
        int bt;
        int count=0;
        while((bt=read.read())!=-1)
        {
            write.write(bt);
            count++;
        }
        read.close();
        write.close();
    }
}
