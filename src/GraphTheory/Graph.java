package GraphTheory;

import java.util.*;

public class Graph {

    private static ArrayList<ArrayList<Integer>> adjLinkedList;
    private static int u;
    private static int v;
    private int V;
    private LinkedList<Integer> adjLinkList[]; //Adjacency Lists

    // Constructor
    Graph(int v) {
        V = v;
        adjLinkList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjLinkList[i] = new LinkedList();
    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        Graph.adjLinkedList = adj;
        Graph.u = u;
        Graph.v = v;
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex : " + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("--" + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    void addEdge(int v, int w) {
        adjLinkList[v].add(w);
    }

    void breathFirstSearch(int val) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[val] = true;
        queue.add(val);

        while (queue.size() != 0) {
            val = queue.poll();
            System.out.print(val + " ");
            Iterator<Integer> i = adjLinkedList.get(val).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


}
