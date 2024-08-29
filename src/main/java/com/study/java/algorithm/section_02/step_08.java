package com.study.java.algorithm.section_02;


import java.util.Arrays;
import java.util.Scanner;

public class step_08 {

    // N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
    //같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
    //즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        // Boolean은 null로 들어감
        int[] scores = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            scores[i] = sc.nextInt();
        }

        // 오름차순 정렬
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        for (int i : solution(scores, sortedScores)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] scores, int[] sortedScores) {
        int[] answer = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int score = scores.length + 1;

            for (int j : sortedScores) {
                if (scores[i] < j) continue;
                score--;
            }
            answer[i] = score;
        }
        return answer;
    }
}
