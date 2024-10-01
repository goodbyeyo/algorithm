package com.study.twoPointers;

/**
 * 연속된 자연수의 합(수학적인 방법)
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법으로 가짓수 출력
 * 만약 N=15이면 7+8=15, 4+5+6=15, 1+2+3+4+5=15 와 같이 총 3가지 경우가 존재한다.
 * [입력설명] 첫 번째 줄에 양의 정수 N(7<=N<=1000)이 주어진다
 * [출력설명] 첫 줄에 총 경우의 수를 출력한다
 * [예제입력] 15
 * [예제답안] 3
 * 연속된 부분 수열의 합으로 접근
 */

import java.util.Scanner;

public class TwoPointers05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

}
