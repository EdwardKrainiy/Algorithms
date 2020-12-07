package primm;

import static java.lang.Integer.min;
import static java.util.Arrays.fill;

public class PrimmAlg {
    public static int PrimmAlgorithm(int[][] matr) {
        int INFINITY = Integer.MAX_VALUE / 2;
        int verticesAmount = matr[0].length;
        boolean[] used = new boolean [verticesAmount];
        int[] dist = new int [verticesAmount];
        
        fill(dist, INFINITY);

        dist[0] = 0;

        while(true){
            int v = -1;
            for (int verticeNumber = 0; verticeNumber < verticesAmount; verticeNumber++)
                if (!used[verticeNumber] && dist[verticeNumber] < INFINITY && (v == -1 || dist[v] > dist[verticeNumber]))
                    v = verticeNumber;
            if (v == -1)
                break;
            used[v] = true;
            for (int nv = 0; nv < verticesAmount; nv++)
                if (!used[nv] && matr[v][nv] < INFINITY)
                 dist[nv] = min(dist[nv], matr[v][nv]);
        }
        int result = 0;
        for (int verticeNumber = 0; verticeNumber < verticesAmount; verticeNumber++)
            result += dist[verticeNumber];
        return result;
    }
}