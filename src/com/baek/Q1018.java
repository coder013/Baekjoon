package com.baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1018 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] splitString = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(splitString[0]);
        int m = Integer.parseInt(splitString[1]);

        String[][] board = new String[n][m];
        int size = 8;
        // 전체 체스판의 반을 기본 값으로 설정
        int result = size * size / 2;

        for (int y = 0; y < n; y++) {
            board[y] = bufferedReader.readLine().split("");
        }

        for (int y = 0; y <= n - size; y++) {
            for (int x = 0; x <= m - size; x++) {
                result = Math.min(result, checkBoard(board, size, x, y));
            }
        }

        System.out.println(result);
    }

    private static int checkBoard(String[][] board, int size, int minX, int minY) {
        int black = 0;
        int white = 0;

        for (int y = minY; y < minY + size; y++) {
            for (int x = minX; x < minX + size; x++) {
                int type = (x + y) % 2;

                // 첫 칸이 검정인 경우
                if ((type == 0 && board[y][x].equals("W"))
                        || (type == 1 && board[y][x].equals("B"))) {
                    black++;
                }

                // 첫 칸이 하양인 경우
                if (type == 0 && board[y][x].equals("B")
                        || type == 1 && board[y][x].equals("W")) {
                    white++;
                }
            }
        }

        return Math.min(black, white);
    }
}
