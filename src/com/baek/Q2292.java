package com.baek;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt();
        int value = 1;
        int count;

        for (count = 1; value < input; count++) {
            value = value + 6 * count;
        }

        System.out.println(count);

        scn.close();
    }
}