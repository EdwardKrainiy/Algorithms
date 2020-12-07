package kruskal;

import java.util.ArrayList;

import static kruskal.KruskalAlg.KruskalAlgorithm;

public class Main {
    public static void main(String[] args) {
        int amountOfVertices = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        int result = KruskalAlgorithm(edges, amountOfVertices);
        System.out.println("Минимальное остовное дерево массой:" + result);
    }
}
