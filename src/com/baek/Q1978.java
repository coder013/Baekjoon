package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int count = 0;
            int size = Integer.parseInt(br.readLine());
            int[] numbers = new int[size];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            for (int number : numbers) {
                if (number == 2) {
                    continue;
                } else if (number == 1 || number % 2 == 0) {
                    count++;
                    continue;
                }

                for (int i = 3; i * i <= number; i = i + 2) {
                    if (number % i == 0) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println(size - count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}