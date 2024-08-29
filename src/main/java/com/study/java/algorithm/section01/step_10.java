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

        // 정방향으로 거리 구하기
        // c와 일치하면 0으로 초기화 후 거리를 늘려간다.
        for(int i = 0; i < str.length(); i++) {
            if(chars[i] == c) {
                len = 0;
            } else {
                len++;
            }
            answer[i] = len;
        }

        // 역순으로 거리 구하고 정방향과 비교해 적은 거리 담기
        // c와 일치하면 0으로 초기화 후 거린다.
        len = str.length();
        for(int r = str.length() - 1; r >= 0; r--) {
            if(chars[r] == c) {
                len = 0;
                answer[r] = len;
            } else {
                len++;
                answer[r] = Math.min(answer[r], len);
            }
        }
        return answer;
    }




}
