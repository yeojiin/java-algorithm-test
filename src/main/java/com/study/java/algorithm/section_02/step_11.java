package com.study.java.algorithm.section_02;


import java.util.Scanner;

public class step_11 {

    // 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
    // 위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
    //2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
    //같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
    //이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 5;
        int num = sc.nextInt();
        int[][] arr = new int[grade][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < grade; j++) {
                arr[j][i] = sc.nextInt();
            }
        }
        System.out.print(solution(num, grade, arr));
    }

    private static int solution(int num, int grade, int[][] arr) {
        int[][] studentFlags = new int[num][num];
        int[] cnts = new int[num];

        for (int i = 0; i < grade; i++) {
            int[] classes = arr[i];

            for (int j = 0; j < num - 1; j++) {
                for(int k = j; k < num; k++) {
                    int temp = classes[j];
                    int temp2 = classes[k];

                    if(j != k && temp == temp2) {
                        studentFlags[j][k] = 1;
                        studentFlags[k][j] = 1;
                    }
                }
            }
        }

        int max = 0;
        int student = 0;
        for(int p = 0; p < num; p++) {
            int sum = 0;
            for(int q = 0; q < num; q++) {
                sum += studentFlags[p][q];
            }

            if(max < sum) {
                max = sum;
                student = p;
            }
        }

        return student + 1;
    }
}
