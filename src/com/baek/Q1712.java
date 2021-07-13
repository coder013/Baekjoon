package com.baek;

import java.util.Scanner;

public class Q1712 {
    public static void main(String args[]) {
        int max = 2100000000;

        try {
            Scanner scn = new Scanner(System.in);

            String strInput = scn.nextLine();
            String[] strInputs = strInput.split(" ");

            if (strInputs.length != 3) {
                throw new Exception();
            }

            int[] inputs = new int[3];

            for (int i = 0; i < 3; i++) {
                inputs[i] = Integer.parseInt(strInputs[i]);
                if (inputs[i] > max) {
                    throw new Exception();
                }
            }

            if (inputs[1] >= inputs[2]) {
                System.out.println("-1");
            } else {
                int profit = inputs[2] - inputs[1];
                int sales = inputs[0] / profit + 1;

                System.out.println(sales);
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}