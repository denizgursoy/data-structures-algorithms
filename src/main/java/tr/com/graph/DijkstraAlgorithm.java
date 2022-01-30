package tr.com.graph;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DijkstraAlgorithm {

    public void calculateShortestPath(int[][] graph, int startNode) {
        int nodeCount = graph.length + 1;
        boolean[] visitedNodes = new boolean[nodeCount];
        Arrays.fill(visitedNodes, false);

        int[] distance = new int[nodeCount];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[startNode] = 0;


        for (int i = 0; i < nodeCount - 1; i++) {

            var currentNode = getSmallestIndex(distance, visitedNodes);
            visitedNodes[currentNode] = true;

            for (int j = 0; j < nodeCount; j++) {
                if (j != currentNode && !visitedNodes[j] && graph[currentNode][j] != 0) {
                    int totalDistance = graph[currentNode][j] + distance[currentNode];
                    if (distance[j] > totalDistance) {
                        distance[j] = totalDistance;
                    }

                }

            }

        }

        System.out.println(Arrays.toString(distance));
    }


    int getSmallestIndex(int[] distances, boolean[] visitedNodes) {
        int min = Integer.MAX_VALUE, smallestIndex = -1;
        for (int i = 0; i < distances.length - 1; i++) {
            if (!visitedNodes[i] && distances[i] <= min) {
                min = distances[i];
                smallestIndex = i;

            }
        }
        return smallestIndex;
    }


}
