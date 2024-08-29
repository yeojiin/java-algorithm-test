package com.study.java.algorithm.section_02;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class step_06 {

    // N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    // 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    // 첫 자리부터의 연속된 0은 무시한다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        List<Integer> numList = new ArrayList<>();

        while (cnt > 0) {
            numList.add(sc.nextInt());
            cnt--;
        }

        List<Integer> reversedList = new ArrayList<>();
        numList.forEach(n -> {
            int reversedNum = reverseNumber(n);
            reversedList.add(reversedNum);
        });

        int max = reversedList.stream()
                .max(Comparator.comparing(Integer::intValue))
                .orElse(0);


        checkDeciaml(max, reversedList);
    }

    private static void checkDeciaml(int max, List<Integer> reversedList) {
        boolean[] check = new boolean[max + 1];
        check[0] = check[1] = true;


        for(int i = 2; i < Math.sqrt(max); i++) {
            if(check[i])
                continue;

            for(int j = i * i; j < check.length; j+=i) {
                check[j] = true;
            }
        }

        List<Integer> decimalList = new ArrayList<>();
        for(int i = 0; i < check.length; i++) {
            if(!check[i]) decimalList.add(i);
        }

        reversedList.forEach(r -> {
            if(decimalList.contains(r)) {
                System.out.print(r + " ");
            }
        });
    }


    // ‼️ 숫자 뒤집기 int로
    private static int reverseNumber(Integer n) {
        int reversedNum = 0;

        while(n > 0) {
            int digit = n % 10;     // 끝자리 구하기
            reversedNum = reversedNum * 10 + digit;     // 끝자리 추가
            n /= 10;    // 다음 자리수를 구하기 위해 끝자리 제거
        }
        return reversedNum;
    }

}
