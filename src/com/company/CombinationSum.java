package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        ArrayList<Integer> ans=new ArrayList<>();
        Solution.findCollection(0,arr,7,ans);
    }
}

class Solution{
    static void findCollection(int index,int[] arr,int target,ArrayList<Integer> ans){
        if(index==arr.length){
            if(target==0){
                System.out.println(ans);
            }
            return;
        }
        if(arr[index]<=target) {
            ans.add(arr[index]);
            findCollection(index, arr, target - arr[index], ans);
            ans.remove(ans.size()-1);
        }
        findCollection(index+1,arr,target,ans);
    }
}
