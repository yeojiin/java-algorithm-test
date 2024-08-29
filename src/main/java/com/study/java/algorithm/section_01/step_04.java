package com.study.java.algorithm.section_01;

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
            // nextLine은 개행문자를 기준으로 함
            // cnt에서 엔터를 읽어오기 때문에 공백을 읽고 시작함
            // next()를 써야함
            StringBuilder sb = new StringBuilder(sc.next());
            revseredList.add(sb.reverse().toString());
        }

        revseredList.forEach(System.out::println);
    }
}
