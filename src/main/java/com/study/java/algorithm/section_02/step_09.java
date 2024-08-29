package com.study.java.algorithm.section_02;


import java.util.Arrays;
import java.util.Scanner;

public class step_09 {

    // 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
    // N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int[][] arr = new int[num][num];
        int[] rowSumArr = new int[num];
        int[] colSumArr = new int[num];
        for(int i = 0; i < num; i++) {
            int rowSum = 0;

            for(int j = 0; j < num; j++){
                arr[i][j] = sc.nextInt();

                rowSumArr[i] += arr[i][j];
                colSumArr[j] += arr[i][j];
            }
            rowSumArr[i] = rowSum;
        }

        int max = Arrays.stream(rowSumArr).max().orElse(0);
        System.out.print(max);
    }

//    						                                    134
//
//                                    10	13	10	12	15		60
//                                    12	39	30	23	11		115
//                                    11	25	50	53	15		154
//                                    19	27	29	37	27		139
//                                    19	13	30	13	19		94
//
//                                    71	117	149	138	87		155


}
