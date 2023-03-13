package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

            int left = Integer.parseInt(stringTokenizer.nextToken());
            int right = Integer.parseInt(stringTokenizer.nextToken());

            if (left == 0 && right == 0) {
                break;
            }

            System.out.println(getResult(left, right));
        }
    }

    private static String getResult(int left, int right) {
        if (right % left == 0) {
           return "factor";
        }

        if (left % right == 0) {
            return "multiple";
        }

        return "neither";
    }
}
