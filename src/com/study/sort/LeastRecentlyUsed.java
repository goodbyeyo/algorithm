package com.study.sort;

import java.util.Scanner;

/**
 * Least Recently Used
 * 캐시에서 작업을 제거할때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘
 * [설명] 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
 * [설명] 캐시메모리의 상태르 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성
 * [입력] 첫번째줄에 캐시의 크기인 S(3 <= S <= 10))와 작업의 개수 N(5 <= N <= 1,000)이 입력된다
 * [입력[ 두번째줄에 N개의 작업번호가 처리순으로 주어진다 작업번호는 1~100이다.
 * [출력] 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작어부터 차례로 추력
 * [예시] 5 9  // 1 2 3 2 6 2 3 5 7
 * [출력] 7 5 3 2 6
 */
public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();   // cache size
        int n = in.nextInt();   // work size
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        }

    }

    private static int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;   // index length
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;    // hit
                }
            }
            if (pos == -1) {    // miss 처리
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {            // hit 처리
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

}
