package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2581 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int m = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            int sum = 0;
            int min = 0;

            for (int i = m; i <= n; i++) {
                if (isPrimeNumber(i)) {
                    sum += i;

                    if (min == 0) {
                        min = i;
                    }
                }
            }

            if (sum == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(min);
            }
        } catch(Exception e) {
        }
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
