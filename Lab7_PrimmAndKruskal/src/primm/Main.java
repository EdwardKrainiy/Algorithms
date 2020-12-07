package primm;

import static primm.PrimmAlg.PrimmAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 4, 7 },
                           { 6, 0, 6 },
                           { 7, 4, 0 } };
        int result = PrimmAlgorithm(matrix);
        System.out.println("Минимальное остовное дерево массой: " + result);
    }
}
