package com.company;

public class Searchings {
    public static void main(String[] args) {
        int[] ary={-22,1,7,15,20,35,55};
        SearchIt ref=new SearchIt();
       // ref.linearSearch(ary,55);
        ref.binarySearch(ary,55,0, ary.length);
    }
}
class SearchIt
{
    void linearSearch(int[] ary, int search) {
        int j=0;
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]==search) {
                j = i;
                break;
            }
        }
        System.out.println("found at "+j+" position");
    }

    void binarySearch(int[] ary, int search,int start,int end) {
        int mid=(start+end)/2;
        if(search==ary[mid]) {
            System.out.println(mid);
            return;
        }
        else if(search<ary[mid])
        {
            binarySearch(ary,search,start,mid);
        }
        else if(search>ary[mid])
        {
            binarySearch(ary,search,mid,end);
        }
    }
}
