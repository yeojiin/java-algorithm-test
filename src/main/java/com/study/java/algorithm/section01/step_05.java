package com.study.java.algorithm.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class step_05 {

    // 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
    // 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        List<Character> reversedEngList = new ArrayList<>();
        for (char rc : new StringBuilder(in).reverse().toString().toCharArray()) {
            if (Character.isAlphabetic(rc)) {
                reversedEngList.add(rc);
            }
        }

        int idx = 0;
        StringBuilder result = new StringBuilder();
        for (char c : in.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                result.append(reversedEngList.get(idx));
                idx++;
            } else {
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
