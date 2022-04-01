package com.study.twoPointers;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 부분수열이 주어진다
 * [입력예제]
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0  1 1 0 1
 *
 */
public class TwoPointers06 {
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
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                    lt++;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
