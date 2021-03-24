package GraphTheory;

import java.util.*;

public class DArray {
    public int edges[] = new int[1];
    public int vertices;
    public int graphX[]= new int[1];
    public int graphY[]= new int[1];
    public int array2D[][];
    Scanner input = new Scanner(System.in);

    public void arrayStore(int edge, int vertices) {
        int array[][];
    }

    public void createArray() {
        int vertices;
        int edges;
        System.out.println("Enter number of vertices : ");
        this.vertices = input.nextInt();
        for (int i = 0; i < this.vertices; i++) {
            System.out.println("Enter number of edges for vertice : " + i);
            this.edges = Arrays.copyOf(this.edges, this.edges.length + 1);
            this.edges[i] = input.nextInt();
        }
    }

    public void getVertices(int vertices) {
        this.vertices = vertices;
    }

    public void expandMatrix(int vertices) {
        int array[][]=new int[vertices][vertices];
        this.array2D=array;
    }

    public void makeMatrix(int vertices) {
        this.vertices = vertices;
        expandMatrix(this.vertices);
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                this.array2D[j][i] = 1;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(array2D[j][i] + " ");
            }
            System.out.println();
        }
    }

}
