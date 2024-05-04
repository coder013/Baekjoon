package com.baek.q11725.wrong;

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

        tree.addNode(root);

        for (int i = 0; i < size - 1; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int firstValue = Integer.parseInt(tokenizer.nextToken());
            int secondValue = Integer.parseInt(tokenizer.nextToken());

            if (null == tree.findNode(firstValue)) {
                tree.addNode(tree.findNode(secondValue), firstValue);
            } else {
                tree.addNode(tree.findNode(firstValue), secondValue);
            }
        }

        tree.printParent();
    }
}

class Tree {
    private final Node[] nodes;

    Tree(int size) {
        this.nodes = new Node[size];
    }

    void addNode(int value) {
        Node node = new Node(value);
        nodes[value - 1] = node;
    }

    void addNode(Node parent, int value) {
        Node node = new Node(parent, value);
        nodes[value - 1] = node;
    }

    Node findNode(int value) {
        return nodes[value - 1];
    }

    void printParent() {
        for (int i = 1; i < nodes.length; i++) {
            System.out.println(nodes[i].getParent().getValue());
        }
    }
}

class Node {
    private final Node parent;
    private final int value;
    private final List<Node> children = new ArrayList<>();

    Node(int value) {
        this.parent = null;
        this.value = value;
    }

    Node(Node parent, int value) {
        this.parent = parent;
        this.value = value;

        parent.addChild(this);
    }

    int getValue() {
        return value;
    }

    Node getParent() {
        return parent;
    }

    void addChild(Node child) {
        children.add(child);
    }
}