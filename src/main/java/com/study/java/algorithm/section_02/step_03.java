package com.study.java.algorithm.section_02;


import java.util.Scanner;

public class step_03 {

    // A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    // 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        Integer[] arr1 = new Integer[cnt];
        Integer[] arr2 = new Integer[cnt];
        boolean flag = false;

        for(int i = 0; i < cnt * 2; i++) {
            int idx = i % cnt;
            int num = sc.nextInt();
            if(flag) {
                arr2[idx] = num;
            } else {
                arr1[idx] = num;
            }

            flag = flag || idx >= cnt - 1;
        }

        for(char c : solution(arr1, arr2)) {
            System.out.println(c);
        }
    }

    private static char[] solution(Integer[] arr1, Integer[] arr2) {
        char[] answer = new char[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            int b = arr2[i];

            char c = 'D';
            if(a == b) {
                answer[i] = c;
                continue;
            }

            c = 'A';
            if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
                c = 'B';
            }
            answer[i] = c;
        }
        return answer;
    }
}
