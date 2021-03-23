package GraphTheory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(vertices);
        Graph graph = new Graph(4);
        for (int i = 0; i < vertices; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        graph.addEdge(adj, 0, 1);
        graph.addEdge(adj, 0, 4);
        graph.addEdge(adj, 1, 2);
        graph.addEdge(adj, 1, 3);
        graph.addEdge(adj, 1, 4);
        graph.addEdge(adj, 2, 3);
        graph.addEdge(adj, 3, 4);
        graph.printGraph(adj);
        graph.breathFirstSearch(2);
    }
}
