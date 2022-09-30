package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {
    public static void main(String[] args) {
        Genericss ref=new Genericss();
      //  GNode root=ref.createTree();//here, 6 is a root node
      //  ref.showDFS(root);
        ref.createBFSTree();
    }
}
class GNode{
    int info;
    ArrayList<GNode> child=new ArrayList();
    GNode(int inf){
        info=inf;
    }
}
class Genericss{
    Scanner cin=new Scanner(System.in);
    GNode createTree(){//DFS
        System.out.println("enter info: ");
        int info=cin.nextInt();
        GNode aref=new GNode(info);
       // System.out.println(aref.info);
        System.out.println("enter number of child nodes: ");
        int N=cin.nextInt();
        for(int c=0;c<N;c++){
            GNode children=createTree();
            aref.child.add(children);
        }
        return aref;
    }
    void showDFS(GNode root){
        for(int i=0;i<root.child.size();i++){
            System.out.println(root.child.get(i).info);
        }
        for(int i=0;i<root.child.size();i++)
        {
            showDFS(root.child.get(i));
        }
    }

    void createBFSTree() {
        Queue<GNode> q =new LinkedList<>();
        GNode ref=new GNode(25);
        q.add(ref);
        while(!q.isEmpty()){
            System.out.println("enter no. of children: ");
            int N=cin.nextInt();
            for(int i=0;i<N;i++){
                System.out.println("enter info");
                int inf=cin.nextInt();
                GNode children=new GNode(inf);
                q.add(children);
                q.peek().child.add(children);
            }
            q.remove();
        }

    }
}
