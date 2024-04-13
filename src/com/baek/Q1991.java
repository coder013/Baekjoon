package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1991 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        Tree tree = new Tree('A', count);

        for (int i = 0; i < count; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            char root = tokenizer.nextToken().charAt(0);
            char left = tokenizer.nextToken().charAt(0);
            char right = tokenizer.nextToken().charAt(0);

            Node rootNode = tree.addNode(root);
            rootNode.setLeftNode(tree.addNode(left));
            rootNode.setRightNode(tree.addNode(right));
        }

        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
    }
}

class Tree {
    private final char root;
    private final Node[] nodes;

    Tree(char root, int size) {
        this.root = root;
        this.nodes = new Node[size];
    }

    Node addNode(char value) {
        if (value == '.') {
            return null;
        }

        if (null == nodes[value - root]) {
            nodes[value - root] = new Node(value);
        }

        return nodes[value - root];
    }

    void preOrder() {
        nodes[0].preOrder();
    }

    void inOrder() {
        nodes[0].inOrder();
    }

    void postOrder() {
        nodes[0].postOrder();
    }
}

class Node {
    private final char value;
    private Node leftNode;
    private Node rightNode;

    Node(char value) {
        this.value = value;
    }

    void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    void preOrder() {
        System.out.print(value);

        if (leftNode != null) {
            leftNode.preOrder();
        }

        if (rightNode != null) {
            rightNode.preOrder();
        }
    }

    void inOrder() {
        if (leftNode != null) {
            leftNode.inOrder();
        }

        System.out.print(value);

        if (rightNode != null) {
            rightNode.inOrder();
        }
    }

    void postOrder() {
        if (leftNode != null) {
            leftNode.postOrder();
        }

        if (rightNode != null) {
            rightNode.postOrder();
        }

        System.out.print(value);
    }
}
