package com.study.twoPointers;

/**
 * 최대매출(SLIDING WINDOW)
 * N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하기
 * 만약 N=10 이고 10일 간의 매출기록이 아래와 같다면
 * 12 15 11 20 25 10 20 19 13 15
 * 이때 K=3이면 연속된 3일ㄹ간의 최대 매출액은 11 20 25 = 56만원
 * [입력] 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어진다
 * [입력] 두 번째 줄에 N개의 숫자열이 주어진다. 각 숫자는 500이하의 음이 아닌 정수
 * [출력] 첫 줄에 최대 매출액을 출ㄹ력
 * [예제]
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
 * [답안] 56
 */
import java.util.Scanner;

public class SlidingWindow01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
