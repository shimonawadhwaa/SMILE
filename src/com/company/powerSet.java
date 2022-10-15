package com.company;

import java.util.ArrayList;

public class powerSet {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(Solve.possibleAnswer(s));
    }
}
class Solve{
    static ArrayList<String> possibleAnswer(String s){
        ArrayList<String> ans=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<(1<<n);i++){
            String put="";
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    put+=s.charAt(j);
                }
            }
            ans.add(put);
        }
        return ans;
    }
}
