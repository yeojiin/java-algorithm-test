package com.study.java.algorithm.section01;

import java.util.*;

public class step_03 {

    // 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    // 문장속의 각 단어는 공백으로 구분됩니다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] valueStr = value.split(" ");

        String result = "";
        for(String s : valueStr) {
            result = s.length() > result.length() ? s : result;
        }

        System.out.println(result);
    }
}
