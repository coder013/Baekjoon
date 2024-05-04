package com.baek.q4803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        PrintWriter out = new PrintWriter(System.out);
        int index = 1;

        while (true) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");

            int nodeCount = Integer.parseInt(tokenizer.nextToken());
            int edgeCount = Integer.parseInt(tokenizer.nextToken());

            if (nodeCount == 0 && edgeCount == 0) {
                break;
            }

            Graph graph = new Graph(nodeCount);

            for (int i = 0; i < edgeCount; i++) {
                tokenizer = new StringTokenizer(reader.readLine(), " ");

                graph.addEdge(
                        Integer.parseInt(tokenizer.nextToken()),
                        Integer.parseInt(tokenizer.nextToken())
                );
            }

            int result = graph.countTree();

            if (result == 0) {
                out.println("Case " + index + ": No trees.");
                out.flush();
            } else if (result == 1) {
                out.println("Case " + index + ": There is one tree.");
                out.flush();
            } else if (result > 1) {
                out.println("Case " + index + ": A forest of " + result + " trees.");
                out.flush();
            }

            index++;
        }
    }
}

class Graph {
    private final List<Integer>[] nodes;

    Graph(int size) {
        nodes = new ArrayList[size + 1];

        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new ArrayList<>();
        }
    }

    public void addEdge(int left, int right) {
        nodes[left].add(right);
        nodes[right].add(left);
    }

    public int countTree() {
        int count = 0;
        int[] parents = new int[nodes.length];
        boolean[] visited = new boolean[nodes.length];

        for (int i = 1; i < nodes.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (isTree(i, parents, visited)) {
                count++;
            }
        }

        return count;
    }

    public boolean isTree(int root, int[] parents, boolean[] visited) {
        visited[root] = true;

        for (int node : nodes[root]) {
            if (parents[root] == node) {
                continue;
            }

            // 이미 방문한 경우 싸이클이 존재한다는 뜻이므로 트리가 아님
            if (visited[node]) {
                return false;
            }

            parents[node] = root;

            if (!isTree(node, parents, visited)) {
                return false;
            }
        }

        return true;
    }
}