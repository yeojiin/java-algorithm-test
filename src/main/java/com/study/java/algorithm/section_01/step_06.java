package com.study.java.algorithm.section_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step_06 {

    // 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    // 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        StringBuilder result = new StringBuilder();
        List<Character> characterList = new ArrayList<>();
        for(char c : in.toCharArray()) {
            if(!characterList.contains(c)) {
               result.append(c);
               characterList.add(c);
            }
        }

        System.out.println(result);
    }
}
