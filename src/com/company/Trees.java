package com.company;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Trees {
    public static void main(String[] args) {
//        Node2 root=null;
        InsertNode ref=new InsertNode();
        ref.nodeInsert(40);
        ref.nodeInsert(30);
        ref.nodeInsert(80);
        ref.nodeInsert(20);
        ref.nodeInsert(35);
        ref.nodeInsert(70);
        ref.nodeInsert(90);
  //      ref.show();
       // ref.preOrder();
      //  System.out.println();
        //System.out.println();
       // ref.inOrder();
      //  ref.lvlOrderTraversal();
       /* int p=ref.findLeafNode(ref.proot);
        System.out.println(p);
        int q=ref.findInternalNode(ref.proot);
        System.out.println(q);
        int r=ref.findTotalNode(ref.proot);
        System.out.println(r);
        int s=ref.findHeight(ref.proot);
        System.out.println(s-1);*/
      //  System.out.println(ref.findGreatest(ref.proot));
      //  System.out.println(ref.findSmallest(ref.proot));
      //  ref.findWanted(90,ref.proot);
        ref.deleteNode(40,ref.proot);
        ref.inOrder();
    }
}
class Node2
{
    int info;
    Node2 left;
    Node2 right;
    Node2(int data)
    {
        info=data;
        left=right=null;
    }
}
class InsertNode{
    Node2 proot=null;
    void nodeInsert(int data){
        //here..proot acts like head in linked list
        Node2 ptr;
        Node2 prev;
        Node2 node=new Node2(data);
        if(proot==null)
        {
            proot=node;
            return;
        }
        else{
            ptr=proot;
            prev=null;
            while(ptr!=null)
            {
                prev=ptr;
                if(data<ptr.info)
                    ptr=ptr.left;
                else
                    ptr=ptr.right;
            }
            if(data<prev.info)
                prev.left=node;
            else
                prev.right=node;
        }
    }
    void show()
    {
        Node2 ptr=proot;
        while(ptr!=null)
        {
            System.out.println(ptr.info);
            ptr=ptr.left;
        }
    }
    void preOrder()
    {
        Stack<Node2> stk=new Stack<>();
        Node2 ptr=proot;
        stk.push(ptr);
        while(!stk.empty()) {
            System.out.println(stk.peek().info);
            stk.pop();
            if (ptr.right != null) {
                stk.push(ptr.right);
            }
            if (ptr.left != null) {
                stk.push(ptr.left);
            }
            try {
                ptr=stk.peek();
            }
            catch(Exception exp)
            {
                exp.getMessage();
            }

        }
    }
    void inOrder()
    {
        Stack<Node2> stak=new Stack<>();
        Node2 ptr=proot;
        while(!stak.empty()||ptr!=null)
        {
            while(ptr!=null)
            {
                stak.push(ptr);
                ptr=ptr.left;
            }
            ptr=stak.peek();
            System.out.println(stak.peek().info);
            stak.pop();
            ptr=ptr.right;
        }
    }

    void lvlOrderTraversal() {
        Queue<Node2> que=new LinkedList<>();
        Node2 ptr=proot;
        que.add(ptr);
        while(!que.isEmpty()) {
            if (ptr.left != null) {
                que.add(ptr.left);
            }
            if (ptr.right != null) {
                que.add(ptr.right);
            }
            System.out.println(que.peek().info);
            que.remove();
            ptr = que.peek();
        }
    }
    int findLeafNode(Node2 ptr){
        if(ptr==null)
            return 1;
        if(ptr.left==null&&ptr.right==null)
            return 1;
        int x=findLeafNode(ptr.left);
        int y=findLeafNode(ptr.right);
        return (x+y);
    }

     int findInternalNode(Node2 ptr) {
         if(ptr==null)
             return 0;
         if(ptr.left==null&&ptr.right==null)
             return 0;
         int x=findInternalNode(ptr.left);
         int y=findInternalNode(ptr.right);
         return(x+y+1);
    }

    int findTotalNode(Node2 ptr) {
        if(ptr==null)
            return 1;
        if(ptr.left==null&&ptr.right==null)
            return 1;
        int x=findTotalNode(ptr.left);
        int y=findTotalNode(ptr.right);
        return(x+y+1);
    }

    int findHeight(Node2 ptr) {
        if(ptr==null)
            return 1;
        if(ptr.left==null&&ptr.right==null)
            return 1;
       int x=findHeight(ptr.left);
       int y=findHeight(ptr.right);
        if(x>y)
            return(x+1);
        else
            return(y+1);
    }

    int findGreatest(Node2 ptr) {
        if(ptr.right==null)
            return(ptr.info);
        int x=findGreatest(ptr.right);
        return x;
    }
    int findSmallest(Node2 ptr) {
        if(ptr.left==null)
            return(ptr.info);
        int x=findSmallest(ptr.left);
        return x;
    }

    void findWanted(int want, Node2 ptr) {
        if(want<ptr.info)
            findWanted(want,ptr.left);
        else if(want>ptr.info)
            findWanted(want,ptr.right);
        else
        {
            System.out.println("found the number "+ptr.info+" at the accurate position");
            return;
        }
    }

    Node2 deleteNode(int want, Node2 pr) {
        Node2 ptr=pr;
        Node2 prev=pr;
        if(want<pr.info) {
            pr.left = deleteNode(want, pr.left);
        }
        else if(want>pr.info)
            pr.right=deleteNode(want,pr.right);
        else if(want==pr.info) {//case 1..when it has no child node
            if (pr.left == null && pr.right == null) {
                return null;
            }
            //case 2 ..when it has 1 child node
            if (pr.left == null && pr.right != null) {
                return (pr.right);
            }
            if (pr.left != null && pr.right == null) {
                return (pr.left);
            }
            //case 3 ..when it has 2 child nodes
            if (pr.left != null && pr.right != null)
                if (pr == ptr) {
                    {
                        pr = pr.right;
                        while (pr.left != null) {
                            prev=pr;
                            pr = pr.left;
                        }
                        prev.left=null;
                        proot.info=pr.info;
                    }
                }
            else{
                    pr = pr.right;
                    while (pr.left != null) {
                        prev=pr;
                        pr = pr.left;
                    }
                    prev.left=null;
                    return pr;
                }

        }
        return pr;

    }
}

