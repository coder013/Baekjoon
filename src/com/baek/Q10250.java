package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer token = new StringTokenizer(reader.readLine());

            int testCount = Integer.parseInt(token.nextToken());

            int[][] inputs = new int[testCount][3];

            for (int i = 0; i < testCount; i++) {
                token = new StringTokenizer(reader.readLine(), " ");

                inputs[i][0] = Integer.parseInt(token.nextToken());
                inputs[i][1] = Integer.parseInt(token.nextToken());
                inputs[i][2] = Integer.parseInt(token.nextToken());
            }

            for (int input[] : inputs) {
                int floor = input[2] % input[0];
                int number = input[2] / input[0] + 1;

                if (floor == 0) {
                    floor = input[0];
                    number--;
                }

                System.out.println(floor + (number < 10 ? "0" : "") + number);
            }
        } catch(Exception e) {
        }
    }
}
