package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10870 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int number = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(getFibonacci(number));
        } catch(Exception e) {
        }
    }

    private static int getFibonacci(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
}