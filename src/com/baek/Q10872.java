package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10872 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int number = Integer.parseInt(stringTokenizer.nextToken());
            int result = 1;

            for (int i = 2; i <= number; i++) {
                result = result * i;
            }

            System.out.println(result);
        } catch(Exception e) {
        }
    }
}