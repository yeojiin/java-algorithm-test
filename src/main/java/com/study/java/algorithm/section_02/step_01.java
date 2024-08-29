package com.study.java.algorithm.section_02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step_01 {

    // N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    // (첫 번째 수는 무조건 출력한다)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        List<Integer> numList = new ArrayList<>();
        while (0 < cnt) {
            int val = sc.nextInt();
            numList.add(val);
            cnt--;
        }

        int beforeNum = 0;
        for(int i : numList) {
            if(i > beforeNum) {
                System.out.print(i + " ");
            }
            beforeNum = i;
        }
    }
}
