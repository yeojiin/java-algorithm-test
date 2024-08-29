package com.study.java.algorithm.section01;

import java.util.*;

public class step_11 {

    // 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
    // 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
    // 단 반복횟수가 1인 경우 생략합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<Map<Character, Integer>> resultList = solution(str);
        resultList.forEach(m -> {
            for (Map.Entry<Character, Integer> elem : m.entrySet()) {
                String cnt = elem.getValue() == 1 ? "" : elem.getValue().toString();
                System.out.print(elem.getKey() + cnt);
            }
        });
    }

    private static List<Map<Character, Integer>> solution(String str) {
        List<Map<Character, Integer>> selectList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            Map<Character, Integer> lastMap = !selectList.isEmpty() ? selectList.get(selectList.size() - 1) : new HashMap<>();

            if (!lastMap.containsKey(c)) {
                Map<Character, Integer> diffMap = new HashMap<>();
                diffMap.put(c, 0);
                selectList.add(diffMap);
            }

            Map<Character, Integer> afterLastMap = selectList.get(selectList.size() - 1);
            int cnt = afterLastMap.get(c);
            afterLastMap.replace(c, cnt + 1);
        }

        return selectList;
    }
}
