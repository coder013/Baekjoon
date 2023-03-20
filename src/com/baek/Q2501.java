package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(isDivisor(n, k));
    }

    public static int isDivisor(int n, int k) {
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && count++ == k) {
                return i;
            }
        }

        return 0;
    }
}
