package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25501 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
        String[] inputs = new String[size];

        for (int i = 0; i < size; i++) {
            inputs[i] = new StringTokenizer(bufferedReader.readLine()).nextToken();
        }

        for (String input : inputs) {
            int[] result = isPalindrome(input);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static int[] recursion(String s, int l, int r, int count) {
        count++;
        if (l >= r) return new int[]{1, count};
        else if (s.charAt(l) != s.charAt(r)) return new int[]{0, count};
        else return recursion(s, l+1, r-1, count);
    }

    public static int[] isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 0);
    }
}
