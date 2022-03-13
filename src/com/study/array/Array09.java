package com.study.array;
/**
 * [설명] N * N 의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
 * [입력] 첫 줄에 자연수 N이 주어진다( 2 <= N < = 50)
 * [입력] 두번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * [출력] 155
 */

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[][] arr = new int[cnt][cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(solution(cnt, arr));
    }

    private static int solution(int cnt, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1;   // 행의 합(세로)
        int sum2;   // 열의 합(가로)
        for (int i = 0; i < cnt; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < cnt; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for (int i = 0; i < cnt; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][cnt - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}
