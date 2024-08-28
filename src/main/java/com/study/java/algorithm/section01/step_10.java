package com.study.java.algorithm.section01;

import java.util.Scanner;

public class step_10 {

    // ❌
    // 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int i : solution(str, c)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        char[] chars = str.toCharArray();
        int len = str.length();

        for(int i = 0; i < answer.length; i++) {
            if(chars[i] == c) {
                len = 0;
            } else {
                len++;
            }
            answer[i] = len;
        }

        len = str.length();

        for(int i = str.length() - 1; i >= 0; i--) {
            if(chars[i] == c) {
                len = 0;
                answer[i] = len;
            } else {
                len++;
                answer[i] = Math.min(answer[i], len);
            }
        }

        return answer;
    }


}
