package com.baek.q5639;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 분할 정복
 * 왼쪽 트리 -> 오른쪽 트리 -> 루트 순으로 탐색
 * 루트보다 큰 경우 오른쪽 트리의 루트 노드로 판단, 해당 노드 이전 노드들을 왼쪽 트리로 판단
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Tree tree = new Tree();

        while (true) {
            String input = reader.readLine();

            if (null == input || input.isBlank()) {
                break;
            }

            tree.addNode(Integer.parseInt(input));
        }

        tree.postOrder();
    }
}

class Tree {
    private final List<Integer> nodes;

    Tree() {
        nodes = new ArrayList<>();
    }

    void addNode(int node) {
        nodes.add(node);
    }

    void postOrder() {
        postOrder(0, nodes.size() - 1);
    }

    void postOrder(int root, int last) {
        if (root > last) {
            return;
        }

        int left = root + 1;
        int right = left;

        for (; right <= last; right++) {
            if (nodes.get(right) > nodes.get(root)) {
                break;
            }
        }

        postOrder(left, right - 1);
        postOrder(right, last);
        System.out.println(nodes.get(root));
    }
}
