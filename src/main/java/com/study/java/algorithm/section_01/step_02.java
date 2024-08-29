package com.study.java.algorithm.section_01;

import java.util.Scanner;

public class step_02 {

    // 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for(char c : value.toCharArray()) {
            result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        System.out.println(result);
    }
}
