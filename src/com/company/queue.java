package com.company;

public class queue {
    public static void main(String[] args) {
        kyun ref=new kyun();
        ref.create();
        ref.insert(4);
        ref.insert(5);
        ref.insert(6);
        ref.insert(8);
        ref.insert(9);
        ref.insert(10);
        ref.show();
    }
}
class kyun{
    int[] ary;
    int rp=-1;
    int fp=-1;
    void create()
    {
        ary = new int[4];
    }
    boolean isFull()
    {
        if(((rp+1)%ary.length)==fp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(rp==-1&&fp==-1)
        {
            return true;
        }
        else
            return false;
    }
    void insert(int val)
    {
        if(isFull())
            return;
        else
        {   rp=(rp+1)%ary.length;
            ary[rp]=val;
        }
        if(isEmpty())
        {
            fp=rp;
        }

    }
   /* void remove()
    {
        if(isEmpty())
            return;
        else
        if(fp==rp)
        {
            fp=-1;
            rp=-1;
            return
        }
        else {
            fp = (fp + 1) % ary.length;
        }
    }*/
    void show()
    {
        for(int i=0;i<ary.length;i++)
        {
            System.out.println(ary[i]);
        }
    }
}
