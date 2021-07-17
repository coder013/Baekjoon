package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2839 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int input = Integer.parseInt(reader.readLine());

            int t, f;

            for (t = 0; (input - t * 3) > 0 && (input - t * 3) % 5 != 0; t++) {}

            f = (input - t * 3);

            if (f < 0) {
                System.out.println(-1);
            } else {
                System.out.println((input - t * 3) / 5 + t);
            }
        } catch(Exception e) {
        }
    }
}