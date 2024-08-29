package com.study.java.algorithm.section_02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step_05 {

    // ❌
    // 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    // 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean[] check = new boolean[num + 1]; // true: 비소수, false:소수
        check[0] = check[1] = true;

        List<Integer> list = new ArrayList<>();

        // 0,1은 소수가 아니므로 스킵
        for(int i = 2; i <= Math.sqrt(num); i++) {
            // 소수가 아닐 경우 스킵
            if(check[i])
                continue;

            for(int j = i * i; j < check.length; j += i) {
                check[j] = true;
            }
        }

        for(int i = 0; i < check.length; i++) {
            if(!check[i]) list.add(i);
        }

        System.out.println(list.size());
    }

}
