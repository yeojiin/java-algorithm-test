package com.study.java.algorithm.section01;

import java.util.Scanner;

public class step_08 {

    // 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
    // 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    // 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
    // 알파벳 이외의 문자들은 무시합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().toLowerCase();

        String origin = extractAlphabetic(in);
        String reverse = extractAlphabetic(new StringBuilder(in).reverse().toString());

        String result = origin.equals(reverse) ? "YES" : "NO";
        System.out.println(result);
    }

    private static String extractAlphabetic(String in) {
        StringBuilder sb = new StringBuilder();
        for(char c : in.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
