package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
        DoProcess ref=new DoProcess();
        System.out.println("*******************************************************************************");
        System.out.println();
        System.out.println("********************WELCOME TO BLOOM BOUTIQUE********************");
        System.out.println("   We are working in this field since 1990 and have gained trust of more than 40,000 people");
        ref.start();
    }
}

class Nodeof{
    String Name;
    int height;
    int waist;
    String type;
    String color;
    String details;
    Nodeof prev;
    Nodeof next;
    Nodeof(String Name,int height,int waist,String type,String color,String details){

        this.Name=Name;
        this.height=height;
        this.waist=waist;
        this.type=type;
        this.color=color;
        this.details=details;
    }
}
class DoProcess{

    Nodeof head=null;
    Nodeof ptr=head;
    Nodeof newNode;
    String name,type,color,details;
    int height,waist;
    Scanner cin=new Scanner(System.in);
    void start(){
        String adminName="Admin";
        String adminPass="123";
        System.out.println("Press \n1-ADMIN \n2-USER");
        System.out.println();
        System.out.println();
        int opt;
        opt=cin.nextInt();
        if (opt == 1) {
            System.out.println("-----------------------------------------------------");
            System.out.println("----------------Welcome to Boutique Portal--------------");
            System.out.println("-----------------------------------------------------");
            int flag1 = 0;
            int flag2 = 0;
            System.out.println("Please Enter the log In details");
            do {
                System.out.println("Enter Boutique name:");
                String guess_admin;
                guess_admin=cin.next();
                if (guess_admin.equals(adminName)) {
                    System.out.println("Boutique name is correct");
                    flag1 = 1;

                } else {
                    System.out.println("Boutique name is incorrect");

                }
            } while (flag1 != 1);
            do {
                String guess_pass;
                System.out.println("Enter Boutique passcode:");
                guess_pass=cin.next();
                if (guess_pass.equals(adminPass)) {
                    System.out.println("-----------------------");
                    System.out.println("LogIn Successful!");
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println();
                    flag2 = 1;
                } else {
                    System.out.println("Incorrect Password. Kindly try again");
                }
            } while (flag2 != 1);

            int choice;
            do {
                System.out.println("press 0 to exit");
                System.out.println("press 1 to view record of customer");
                System.out.println("press 2 to delete record if it is done");

                choice=cin.nextInt();
                switch (choice) {
                    case 0: {
                        start();
                        break;
                    }
                    case 1:
                        System.out.println("Records are:");
                        show();
                        break;
                    case 2:
                        delete();
                        System.out.println("Record deleted successfully");
                        break;

                    default:
                        System.out.println("invalid input");
                        break;
                }
            } while (choice != 0);

        } else if (opt == 2) {
            System.out.println();
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("          Welcome to User Portal          ");
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println();
            int option;
            do {
                System.out.println("-----------------------------------------------");
                System.out.println("Press 0 to exit \nPress 1 to add your record \nPress 2 to update yor record");
                System.out.println("-----------------------------------------------");
                option=cin.nextInt();
                switch (option) {
                    case 0: {
                        System.out.println("Loop exited");
                        start();
                        break;
                    }
                    case 1: {
                        addNew();;
                        System.out.println("your record has been added successfully");
                        break;
                    }
                    case 2: {
                        update();
                        System.out.println("Record updated Successfully");
                        break;
                    }

                    default: {
                        System.out.println("wrong input");
                        break;
                    }
                }
            } while (opt != 0);
        } else {
            System.out.println("Kindly choose correct option");
        }
    }
    void addNew(){
        System.out.println("Enter name: ");
        name=cin.next();
        System.out.println("Enter height in cm: ");
        height=cin.nextInt();
        System.out.println("Enter waist in cm: ");
        waist=cin.nextInt();
        System.out.println("Enter type of costume: ");
        type=cin.next();
       // type=cin.nextLine();
        System.out.println("Enter color of your costume: ");
        color=cin.next();
        System.out.println("Enter more details: ");
        details=cin.next();
        appendNode();
    }
    void appendNode(){
        newNode=new Nodeof(name,height,waist,type,color,details);
        newNode.next=null;
        newNode.prev=null;
        if(head==null){
            head=newNode;
            //System.out.println("newNode added");
        }
        else{
            ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newNode;
            newNode.prev=ptr;
        }
    }
    void show(){
        ptr=head;
        while(ptr!=null){
            System.out.println("Name= "+ptr.Name);
            System.out.println("height in cm = "+ptr.height);
            System.out.println("Waist in cm= "+ptr.waist);
            System.out.println("Type of costume= "+ptr.type);
            System.out.println("Color of costume= "+ptr.color);
            System.out.println("More details= "+ptr.details);
            System.out.println("-----------------------------------------------------------------");
            ptr=ptr.next;
        }
    }
    void delete(){
        System.out.println("enter name of which you want to delete record:");
        String n=cin.next();
        ptr=head;
        while(ptr!=null){
            if(ptr.Name.equals(n)){
                break;
            }
            ptr=ptr.next;
        }
        if(ptr==head){
            if(ptr.next==null){
                head=null;
            }
            else{
                head=ptr.next;
            }
        }
        else
        if(ptr.next==null) {
            ptr.prev.next=null;
        }

        else{
                ptr.prev.next = ptr.next;
                ptr.next.prev = ptr.prev;
                ptr.prev = null;
                ptr.next = null;
            }
        }

    void update(){
        System.out.println("enter name of which you want to update record:");
        String n=cin.next();
        ptr=head;
        while(ptr!=null){
            //System.out.println(ptr.Name);
            if(ptr.Name.equals(n) ){
                break;
            }
            ptr=ptr.next;
        }

        System.out.println("Enter height in cm: ");
        height=cin.nextInt();
        ptr.height=height;
        System.out.println("Enter waist in cm: ");
        waist=cin.nextInt();
        ptr.waist=waist;
        System.out.println("Enter type of costume: ");
        type=cin.next();
        ptr.type=type;
        System.out.println("Enter color of your costume: ");
        color=cin.next();
        ptr.color=color;
        System.out.println("Enter more details: ");
        details=cin.next();
        ptr.details=details;
    }
}


