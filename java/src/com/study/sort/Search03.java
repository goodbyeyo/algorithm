package com.study.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 결정 Algorithm : 이분 검색을 통해서 더 좋은 유효한 값을 찾는 Algorithm
 * 가장 가까운 두 말의 거리가 최대가 되는 그 최대 값을 출력
 * [입력] 첫줄에 자연수 N 과 C 가 공백을 사이에 두고 주어짐
 * [입력] 둘째 줄에 마구 간의 좌표 xi가 차례로 주어짐
 * [출력] 첫 줄에 가장 가까운 두말의 최대 거리 출력
 * [입력 예시]
 * 5 3
 * 1 2 8 4 9
 * [출력 예시]
 * 9
 */
public class Search03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(solution(n, c, arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }
        return answer;
    }

    // 유효 값 판별 함수
    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
