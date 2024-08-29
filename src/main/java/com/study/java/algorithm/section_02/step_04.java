package com.study.java.algorithm.section_02;


import java.util.Scanner;

public class step_04 {

    // 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    // 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i : solution(cnt)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int cnt) {

        int[] answer = new int[cnt];
        answer[0] = answer[1] = 1;

        for(int i = 1; i < cnt -1; i++) {
            answer[i+1] = answer[i - 1] + answer[i];
        }
        return answer;
    }


}
