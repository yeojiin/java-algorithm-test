package com.study.java.algorithm.section_02;


import java.util.Scanner;

public class step_10 {

    // ❌
    // 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
    //각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
    //격자의 가장자리는 0으로 초기화 되었다고 가정한다.
    //만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(num, arr));
    }

    private static int solution(int num, int[][] arr) {
        // 상 우 하 좌
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int cnt = 0;

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;
            }
        }
        return cnt;
    }
}
