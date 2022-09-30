package com.company;

import java.util.*;
import java.util.LinkedList;

public class hashmapss {
    public static void main(String[] args) {
       /* Graph g = new Graph(7);
        g.AddEdge(0,1);
        g.AddEdge(0,2);
        g.AddEdge(1,3);
        g.AddEdge(1,4);
        g.AddEdge(2,3);
        g.AddEdge(3,5);
        g.AddEdge(4,6);
        g.AddEdge(5,6);

        System.out.print("Adjacency list implementation for graph");

        g.Iterate (0);
        g.Iterate (1);
        g.Iterate (4);*/
        List<List<Integer>> arr=new ArrayList<>(5);
        for(int i=0;i<5;i++){
            arr.add(new ArrayList<Integer>());
        }
        arr.get(0).add(5);
        arr.get(4).add(9);
        arr.get(0).add(7);
        arr.get(0).add(8);
        arr.get(0).add(9);
        arr.get(0).add(10);
        /*for(Integer arra:arr.get(0)){
            System.out.println(arra);
        }*/
       /* Iterator<Integer> itr=arr.get(0).iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }
}
/*class Graph {

    int nodes;
    List<List<Integer>> adjlist;

    Graph (int arg_nodes) {
        nodes = arg_nodes;
        adjlist = new ArrayList<>(nodes);
        for (int i=0; i<nodes; i++)
            adjlist.add(new ArrayList<>());
    }

    void AddEdge (int src, int dst) {
        adjlist.get(src).add(dst);
        adjlist.get(dst).add(src);
    }

    void Iterate (int src) {
        System.out.print("\n" + src + " : ");
        for(Integer adj_node : adjlist.get(src)) {
            System.out.print(adj_node + " ");
        }
    }
}*/

