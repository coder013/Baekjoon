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

            System.out.println(getFactorial(number));
        } catch(Exception e) {
        }
    }

    private static int getFactorial(int number) {
        if (number < 2) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }
}