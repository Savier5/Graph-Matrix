import java.util.*;

public class main {
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2, 2, 1},
            {2, 1, 2, 1},
            {2, 1, 1, 2},
            {1, 1, 1, 0}
        };

        String[] v = {"A ", "B ", "C ", "D "};

        // Prints matrix
        System.out.println("Matrix:");
        System.out.println("  A B C D");
        for (int i = 0; i < graph.length; i++) {
            System.out.print(v[i]);
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        // Example paths
        int[][] examples = {
            {0, 1, 2},       //Walk
            {0, 3, 2},       //Trail
            {1, 0, 3},       //Path
            {2, 1, 2},       //Closed Walk
            {3, 0, 3},       //Circuit
            {0, 1, 3, 0}     //Cycle
        };

        // Prints each example
        String[] labels = {"Walk", "Trail", "Path", "Closed Walk", "Circuit", "Cycle"};
        System.out.println("\nExamples:");
        for (int i = 0; i < examples.length; i++) {
            int[] path = examples[i];

            System.out.print(labels[i] + ": ");
            for (int j = 0; j < path.length; j++) {
                System.out.print(v[path[j]]);
                if (j < path.length - 1) System.out.print("-> ");
            }
            System.out.println("");
        }
    }
}
