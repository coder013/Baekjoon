package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int m = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(numbers, 0, n - 1, Integer.parseInt(stringTokenizer.nextToken())));
        }
    }

    private static int binarySearch(int[] numbers, int start, int end, int targetNumber) {
        if (start > end) {
            return 0;
        }

        int middle = (start + end) / 2;

        if (numbers[middle] > targetNumber) {
            return binarySearch(numbers, start, middle - 1, targetNumber);
        } else if (numbers[middle] < targetNumber) {
            return binarySearch(numbers, middle + 1, end, targetNumber);
        } else {
            return 1;
        }
    }
}
