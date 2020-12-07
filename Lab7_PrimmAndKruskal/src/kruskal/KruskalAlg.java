package kruskal;

import java.util.*;
import java.util.stream.Collectors;


public class KruskalAlg {
    public static int KruskalAlgorithm(List<Edge> edges, int amountOfVertices) {
        DSF dsf = new DSF(amountOfVertices);
        edges = edges
                .stream()
                .sorted(Comparator.comparingInt(edge -> edge.weight))
                .collect(Collectors.toList());
        int result = 0;
        for (Edge e : edges)
            if (dsf.union(e.fromPoint, e.toPoint))
                result += e.weight;
        return result;
    }
}


