package com.study.java.algorithm.section_02;


import java.util.*;

public class step_09 {

    // 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
    // N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];
        int[] rowSumArr = new int[num];
        int[] colSumArr = new int[num];

        int rDigonalSum = 0;
        int lDigonalSum = 0;

        int ri = 0;
        int lj = 4;


        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();

                rowSumArr[i] += arr[i][j];
                colSumArr[j] += arr[i][j];

                // 오른쪽 대각선
                if (i - j == 0) {
                    rDigonalSum += arr[i][j];
                }

                // 왼쪽 대각선
                if (ri == i && lj == j) {
                    lDigonalSum += arr[i][j];
                    ri++;
                    lj--;
                }
            }
        }

        // 모든 합 담기
        int[] sumArr = new int[num * 2 + 2];
        for (int i = 0; i < num; i++) {
            sumArr[i] = rowSumArr[i];
            sumArr[i + num] = colSumArr[i];
        }
        sumArr[num * 2] = rDigonalSum;
        sumArr[num * 2 + 1] = lDigonalSum;


        int max = Arrays.stream(sumArr).max().orElse(0);
        System.out.print(max);
    }
}
