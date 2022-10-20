package com.company;

public class Shauryam {
    public static void main(String[] args) {
        int[] ary={5,6,2,3,1,0};
        for(int i=1;i<ary.length;i++){
            int pw=i-1;
            int temp=ary[i];
            while(pw>=0&&temp<ary[pw]){
                ary[pw+1]=ary[pw];
                pw--;
            }
            ary[pw+1]=temp;
        }
        int j=0;
        for(j=0;j<7;j++){
            if(ary[j]!=j)
                break;
        }
        System.out.println(j);
    }
}
