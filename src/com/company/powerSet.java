package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class powerSet {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<Character> index=new ArrayList<>();
       // System.out.println(Solve.possibleAnswer(s));
       Solve.possibleAnswerRecurssion(0,s,index);
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
        Collections.sort(ans);
        return ans;
    }
    static void possibleAnswerRecurssion(int ind, String s, ArrayList<Character> arr){
        if(ind>=s.length()){
            for(char a:arr){
                System.out.print(a);
            }
            System.out.println();
            return;
        }
        arr.add(s.charAt(ind));
       possibleAnswerRecurssion(ind+1,s,arr);
       Character b= s.charAt(ind);
        arr.remove(b);
        possibleAnswerRecurssion(ind+1,s,arr);
        return;
    }
}
