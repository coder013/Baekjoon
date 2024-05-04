package com.baek.q11725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());
        int root = 1;

        Tree tree = new Tree(size);

        for (int i = 0; i < size - 1; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            tree.addEdge(
                    Integer.parseInt(tokenizer.nextToken()),
                    Integer.parseInt(tokenizer.nextToken())
            );
        }

        int[] parents = tree.findParents(root);

        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }
}

class Tree {
    private final List<Integer>[] nodes;

    Tree(int size) {
        nodes = new ArrayList[size + 1];

        for (int i = 1; i <= size; i++) {
            nodes[i] = new ArrayList<>();
        }
    }

    public void addEdge(int first, int second) {
        nodes[first].add(second);
        nodes[second].add(first);
    }

    public int[] findParents(int root) {
        int[] parents = new int[nodes.length];
        boolean[] visited = new boolean[nodes.length];

        findParents(root, parents, visited);

        return parents;
    }

    private void findParents(int root, int[] parents, boolean[] visited) {
        visited[root] = true;

        for (int linkedNode : nodes[root]) {
            if (visited[linkedNode]) {
                continue;
            }

            parents[linkedNode] = root;

            findParents(linkedNode, parents, visited);
        }
    }
}
