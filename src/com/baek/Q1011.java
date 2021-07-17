package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        int[] intervals = new int[test];

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            intervals[i] = end - start;
        }

        for (int interval : intervals) {
            int value = 1;
            int count;

            for (count = 0; interval > 0; count++) {
                interval = interval - value;

                if (count % 2 == 1) {
                    value++;
                }
            }

            System.out.println(count);
        }
    }
}