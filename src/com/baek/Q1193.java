package com.baek;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt(); // 3
        int line;
        int value = 0;
        int left;
        int right;
        int gap;

        for (line = 1; value < input; line++) {
            value += line;
        }

        line -= 1;
        gap = value - input;

        if (line % 2 == 0) {
            left = line - gap;
            right = 1 + gap;
        } else {
            left = 1 + gap;
            right = line - gap;
        }

        System.out.println(left + "/" + right);

        scn.close();
    }
}