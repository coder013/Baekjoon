package com.baek;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Q10757 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer token = new StringTokenizer(reader.readLine());

            String strLeft = token.nextToken();
            String strRight = token.nextToken();

            int size = strLeft.length() > strRight.length() ? strLeft.length() : strRight.length();

            int[] lefts = new int[size];
            int[] rights = new int[size];
            int[] results = new int[size + 1];

            int i = 0;
            for (int j = strLeft.length() - 1; j >= 0; j--) {
                lefts[i] = strLeft.charAt(j) - '0';
                i++;
            }

            i = 0;
            for (int j = strRight.length() - 1; j >= 0; j--) {
                rights[i] = strRight.charAt(j) - '0';
                i++;
            }

            for (i = 0; i < size; i++) {
                int sum = results[i] + lefts[i] + rights[i];
                results[i] = sum % 10;
                results[i + 1] = sum / 10;
            }

            if (results[size] != 0) {
                System.out.print(results[size]);
            }

            for (i = size - 1; i >= 0; i--) {
                System.out.print(results[i]);
            }
        } catch(Exception e) {
        }
    }
}
