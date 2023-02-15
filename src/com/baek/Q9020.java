package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9020 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        int[] numbers = new int[repeat];

        for (int i = 0; i < repeat; i++) {
            numbers[i] = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        }

        for (int number : numbers) {
            int middle = number / 2;
            int[] goldbach = findGoldbach(middle, middle);

            System.out.println(goldbach[0] + " " + goldbach[1]);
        }
    }

    public static int[] findGoldbach(int left, int right) {
        if (left < 2 || right < 2) {
            return new int[] { 0, 0 };
        }

        if (isPrimeNumber(left) && isPrimeNumber(right)) {
            return new int[] { left, right };
        }

        return findGoldbach(left - 1, right + 1);
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}