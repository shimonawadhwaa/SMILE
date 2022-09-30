package com.company;

import java.util.*;
import java.util.LinkedList;

import static java.lang.Math.max;

public class GraphStart {
    public static void main(String[] args) {
        TraverseGraph ref=new TraverseGraph();
        ref.N=5;
        ref.create();
        ref.createList(0,1);
        ref.createList(0,2);
        ref.createList(0,3);
        ref.createList(1,2);
        ref.createList(1,3);
        ref.createList(2,3);
        ref.createList(2,4);
        ref.createList(3,4);
     //   ref.dfsTraverse(0);
     //   ref.dfsRecursion(0);
     //   ref.traverseBFS(0);
     //   ref.pathContains(0,4);
     //   boolean answer=ref.chkPath(0,3);
       // ref.tellPath(0,3);
        //ref.show();
        //ref.chkCyclic(0);
        ref.islandProb();

    }
}
class TraverseGraph {
    List<List<Integer>> adj;
    int N;

    void create() {
        adj = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void createList(int sc, int des) {
        adj.get(sc).add(des);
    }

    void dfsTraverse(int v) {
        boolean[] visited = new boolean[N];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Stack<Integer> stk = new Stack<>();
        stk.push(v);
        while (!stk.empty()) {
            int a = stk.peek();
            stk.pop();
            System.out.println(a);
            visited[a] = true;
            // Iterator itr = adj.get(a).iterator();
            // while (itr.hasNext()) {
            for (int i = v; i < adj.get(a).size(); i++) {
                if (visited[adj.get(a).get(i)] == true)
                    continue;
                else {
                    stk.push(adj.get(a).get(i));
                }
            }
            //   }

        }
    }

    void dfsRecursion(int v) {
        boolean[] visited = new boolean[N];
        recur(v, visited);
    }

    void recur(int v, boolean[] visited) {
        System.out.println(v);
        visited[v] = true;
        for (int i = 0; i < adj.get(v).size(); i++) {
            if (visited[adj.get(v).get(i)] == false) {
                recur(adj.get(v).get(i), visited);
            }
        }
    }

    void traverseBFS(int v) {
        boolean[] visited = new boolean[N];
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        while (!que.isEmpty()) {
            int a = que.peek();
            System.out.println(a);
            que.remove();
            visited[a] = true;
            for (int i = 0; i < adj.get(a).size(); i++) {
                if (visited[adj.get(a).get(i)] == false) {
                    que.add(adj.get(a).get(i));
                    visited[adj.get(a).get(i)] = true;
                }
            }
        }
    }

    void pathContains(int sc, int des) {
        boolean[] visited = new boolean[N];
        Stack<Integer> stk = new Stack<>();
        stk.push(sc);
        while (!stk.empty()) {
            int a = stk.peek();
            visited[a] = true;
            stk.pop();
            for (int i = 0; i < adj.get(a).size(); i++) {
                stk.push(adj.get(a).get(i));
            }

        }
        if (visited[des] == false) {
            System.out.println("there is no such path");
        } else {
            System.out.println("there exists such path");
        }
    }

    boolean chkPath(int sc, int des) {
        boolean resp=false;
        boolean visited[] = new boolean[N];
        for (int i = 0; i < adj.get(sc).size(); i++) {
            if (visited[adj.get(sc).get(i)] == false) {
                if (des == adj.get(sc).get(i)) {
                    return true;
                } else {
                    resp =chkPath(adj.get(sc).get(i),des);
                    return resp;
                }
            }
        }
        return resp;
    }
    ArrayList<Integer> ary=new ArrayList<>();

    boolean tellPath(int sc,int des){
        boolean visite[]=new boolean[N];
        boolean resp=false;
        visite[sc]=true;
        ary.add(sc);
        for(int i=0;i<adj.get(sc).size();i++){
            if(visite[adj.get(sc).get(i)]==false){
                if(adj.get(sc).get(i)==des){
                    ary.add(des);
                   // tellPath(adj.get(sc).get(i),des);
                    //ary.add(adj.get(sc).get(i));
                    return true;
                }
                else {
                    resp=tellPath(adj.get(sc).get(i),des);
                    if(resp==true){
                        return true;
                    }
                }
            }
        }
        ary.remove(ary.size()-1);
        return false;
    }
    void show(){
        Iterator itr= ary.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    boolean chkCyclic(int v){
        boolean resp=false;
        boolean[] visited=new boolean[N];
        boolean[] hist=new boolean[N];
        for(int i=0;i<adj.get(v).size();i++){
            if(visited[adj.get(v).get(i)]==false){
                resp=chkCyclic(adj.get(v).get(i));
            }
            else if(hist[adj.get(v).get(i)]==true){
                return true;
            }
        }
        hist[v]=false;
        if(resp==true)
            return true;
        else
            return false;
    }
    void DFS(int sub, int v, boolean[] visited){
        sub++;
        for(int i=0;i<adj.get(v).size();i++){
            if(visited[adj.get(v).get(i)]==false){
                DFS(sub,adj.get(v).get(i),visited);
            }
        }
    }

    void islandProb(){
        boolean[] visited=new boolean[N];
        int max=Integer.MIN_VALUE;
        int sub=0;
        int count=0;
        for(int i=0;i<N;i++){
            if(visited[i]==false){
                DFS(sub,i,visited);
                count++;
                max=max(max,sub);
            }
        }
        System.out.println(count+" "+ max);
    }

}
