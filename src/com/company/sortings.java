package com.company;

import java.util.Scanner;

public class sortings {
    public static void main(String[] args) {
       /* int N;
        Scanner cin = new Scanner(System.in);
        System.out.println("enter n: ");
        N = cin.nextInt();
        int[] ary = new int[N];
        for (int i = 0; i < ary.length; i++) {
            System.out.println("enter value:");
            ary[i] = cin.nextInt();
        }*/
        sorts ref = new sorts();
       // int[] ery=new int[10];
       // ref.countingSorts(ary,ery);
        //ref.bubbleSort(ary);
        //ref.selectionSort(ary);
        //ref.insertionSort(ary);
        // ref.ultaBubbleSort(ary);
        //ref.shellSort(ary);
         int arr[]={20,35,-15,7,55,1,-22};

        //ref.mergeSort(arr,0,arr.length);
        //ref.quickSorts(arr,0,arr.length);
       // ref.inverseMergeSort(arr,0,arr.length);
       // ref.insertionRecur(arr,1,arr.length);
       for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    }


    class sorts {
        int t;

        void bubbleSort(int[] ary) {
            for (int j = 0; j < ary.length - 1; j++) {
                for (int i = 0; i < ary.length - 1 - j; i++) {
                    if (ary[i] > ary[i + 1]) {
                        t = ary[i];
                        ary[i] = ary[i + 1];
                        ary[i + 1] = t;
                    }
                }
            }
            for (int j : ary) {
                System.out.println(j);
            }
        }

        void selectionSort(int[] ary) {
            int max, l = 0;
            for (int j = 0; j < ary.length - 1; j++) {
                max = ary[0];
                for (int i = 0; i < ary.length - j; i++) {
                    if (max < ary[i]) {
                        max = ary[i];
                        l = i;
                    }
                }
                t = ary[ary.length - j - 1];
                ary[ary.length - j - 1] = max;
                ary[l] = t;
            }

            for (int j : ary) {
                System.out.println(j);
            }
        }

        void insertionSort(int[] ary) {
            int pw, temp;
            for (int i = 1; i < ary.length; i++) {
                pw = i - 1;
                temp = ary[i];
                while (pw >= 0 && temp < ary[pw]) {
                    ary[pw + 1] = ary[pw];
                    pw--;
                }
                ary[pw + 1] = temp;                       //[3,4,2,1,0]
            }
        }

        void ultaBubbleSort(int[] ary) {
            for (int i = 0; i < ary.length; i++) {
                for (int j = ary.length - 1; j > i; j--) {
                    if (ary[j] < ary[j - 1]) {
                        t = ary[j];
                        ary[j] = ary[j - 1];
                        ary[j - 1] = t;
                    }
                }
            }
            for (int j : ary) {
                System.out.println(j);
            }
        }

        void shellSort(int[] ary) {//[20 35 -15 7 55 1 -22]
            for (int gap = ary.length / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < ary.length; i++) {
                    int pw = i;
                    int temp = ary[i];
                    while (pw >= gap && ary[pw - gap] > temp) {
                        ary[pw] = ary[pw - gap];
                        pw = pw - gap;
                    }
                    ary[pw] = temp;
                }
            }
            for (int j : ary) {
                System.out.println(j);
            }
        }

        void mergeSort(int[] arr, int start, int end) {
            if (end - start < 2)
                return;
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid, end);
            merge(arr, start, mid, end);
        }

        void merge(int[] arr, int start, int mid, int end) {
            if (arr[mid - 1] <= arr[mid])
                return;
            int i = start;
            int j = mid;
            int tempindex = 0;
            int[] temp = new int[end - start];
            while (i < mid && j < end) {
                temp[tempindex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
            }
            System.arraycopy(arr, i, arr, start + tempindex, mid - i);
            System.arraycopy(temp, 0, arr, start, tempindex);
        }

        void quickSorts(int[] arr, int start, int end)//{20,35,-15,7,55,1,-22}
        {
            if ((end - start) < 2)
                return;

            int i = start;
            int j = end;
            int pivot = arr[start];
            while (i < j) {
                while (i < j && pivot <= arr[--j]) ;
                if (i < j)
                    arr[i] = arr[j];

                while (i < j && pivot >= arr[++i]) ;
                if (i < j)
                    arr[j] = arr[i];

            }
            arr[j] = pivot;
            int pivotIndex = j;
            quickSorts(arr, start, pivotIndex);
            quickSorts(arr, pivotIndex + 1, end);
        }

         void countingSorts(int[] ary,int[] ery) {
             int index = 0;
             int count = 1;
             int j=0;
             int k=0;
             for (int i = 0; i < ary.length; i++) {
                 ery[ary[i] - 1] =ery[ary[i]-1]+count;
             }
             while(k<ary.length)
             {
                 while(ery[j]!=0)
                 {
                     ary[k]=j+1;
                     ery[j]--;
                     k++;
                 }
                 j++;
             }
             for(int i=0;i<ary.length;i++)
             {
                 System.out.println(ary[i]);
             }
        }

         void inverseMergeSort(int[] arr, int start, int end) {
            if(end-start<2)
                return;
            int mid=(start+end)/2;
            inverseMergeSort(arr,start,mid);
            inverseMergeSort(arr,mid,end);
            inverseMerge(arr,start,end,mid);
        }

         void inverseMerge(int[] arr, int start, int end, int mid) {
           // if(arr[mid-1]>=arr[mid])
             //   return;

            int i=start;
            int j=mid;
            int tempIndex=0;
            int[] temp=new int[end-start];
            while(i<mid&&j<end)
            {
                temp[tempIndex++]=(arr[j]>=arr[i]?arr[j++]:arr[i++]);
            }
            System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
            System.arraycopy(temp,0,arr,start,tempIndex);
        }

         void insertionRecur(int[] arr, int start,int end) {//{20,35,-15,7,55,1,-22}
            if(end==(start))
                return;

            int pw=start-1;
            int temp=arr[start];
            while(pw>=0&&temp<arr[pw])
            {
                arr[pw+1]=arr[pw];
                pw--;
            }
            arr[pw+1]=temp;
            insertionRecur(arr,start+1,end);
        }
    }

