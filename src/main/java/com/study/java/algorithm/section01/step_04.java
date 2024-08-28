package com.study.java.algorithm.section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step_04 {

    // N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        List<String> revseredList = new ArrayList<>();
        for(int i = 0; i < cnt; i++) {
            StringBuilder sb = new StringBuilder(sc.next());
            revseredList.add(sb.reverse().toString());
        }

        revseredList.forEach(System.out::println);
    }
}
