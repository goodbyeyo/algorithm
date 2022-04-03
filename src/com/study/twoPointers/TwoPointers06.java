package com.study.twoPointers;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * [설명] 0과 1로 구성된 길이가 N인 부분수열이 주어진다
 * [설명] 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속 부분수열을 찾는 프로그램을 작성
 * [설명] 만약 길이가 14인 다음과 같은 수열이 주어지고 k=2 라면 1 1 0 0 1 1 0 1 1 1 0 1
 * [설명] 만들 수 있는 1이 연속된 연속 부분수열은 1 1 0 0 1 1 1 1 1 1 1 1 0 1 이며 그 길이는 8이다
 * [예제]
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
