package com.study.java.algorithm.section01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class step_01 {

    // 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    // 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value = in.nextLine().toLowerCase();
        String target = in.nextLine().toLowerCase();

        int result = 0;
        for (char c : value.toCharArray()) {
            result += c == target.charAt(0) ? 1 : 0;
        }
        System.out.println(result);
    }


    // 프로그램 구성
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean run = true;
        while (run) {

            System.out.println("문자열을 입력하세요");
            String value = in.nextLine().toLowerCase();

            if (!Pattern.matches("^[a-zA-Z]*$", value)) {
                System.out.println("문자열은 영문자만 입력할 수 있습니다.");
                continue;
            }

            if (value.length() > 100) {
                System.out.println("문자열은 100을 넘길 수 없습니다.");
                continue;
            }

            System.out.println("문자를 입력하세요");
            String target = in.nextLine().toLowerCase();


            int result = 0;
            for (char c : value.toCharArray()) {
                result += c == target.charAt(0) ? 1 : 0;
            }
            System.out.println(result);
            run = false;
        }
    }
}
