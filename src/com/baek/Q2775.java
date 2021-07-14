package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2775 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int count = Integer.parseInt(reader.readLine());

            int[][] inputs = new int[count][2];

            for (int i = 0; i < count; i++) {
                inputs[i][0] = Integer.parseInt(reader.readLine()) + 1;
                inputs[i][1] = Integer.parseInt(reader.readLine());
            }

            for (int input[] : inputs) {
                int[][] array = new int[input[0]][input[1]];

                for (int i = 0; i < input[0]; i++) {
                    array[i][0] = 1;
                }

                for (int i = 1; i < input[1]; i++) {
                    array[0][i] = i + 1;
                }

                for (int i = 1; i < input[0]; i++) {
                    for (int j = 1; j < input[1]; j++) {
                        array[i][j] = array[i][j - 1] + array[i - 1][j];
                    }
                }

                System.out.println(array[input[0] - 1][input[1] - 1]);
            }
        } catch(Exception e) {
        }
    }
}
