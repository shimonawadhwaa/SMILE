package com.company;

public class stringbuff {
    public static void main(String[] args) {
        StringBuffer ref=new StringBuffer("bce");
        ref.append(" bangalore comp").append("uter classes");
        System.out.println(ref);
        StringBuffer ref2=new StringBuffer("bce bangalore computer classes");
        System.out.println(ref==ref2);
        System.out.println(ref.equals(ref2));
        System.out.println(ref.toString()==ref2.toString());
        System.out.println(ref.toString().equals(ref2.toString()));
    }
}
