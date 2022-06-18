package com.study.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  결정알고리즘
 *  [설명] DVD의 최소 용량 크기 출력
 *  [입력]
 *  9 3
 *  1 2 3 4 5 6 7 8 9
 *  [출력]
 *  17
 */
public class Search02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 노래 곡
        int m = in.nextInt();   // dvd 장수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        return answer;
    }

    public int count(int[] arr, int capacity) {

    }
}
