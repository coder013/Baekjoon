package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer strToken = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());
            int v = Integer.parseInt(strToken.nextToken());

            int day = (v - b) / (a - b);

            if ((v - b) % (a - b) > 0) {
                day++;
            }

            System.out.println(day);
        } catch(Exception e) {
        }
    }
}
