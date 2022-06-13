package com.study.sort;

import java.util.Scanner;

/**
 * [설명] N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성
 * [설명] 정렬하는 방법은 선택 정렬
 * [입력] 첫번째 줄에 자연수 N(1<=N<=100)이 주어진다
 * [입력] 두번째 줄에 N개의 자연수가 공백을 사이에 두고 입력된다. 각 자연수는 정수형 범위 안에 있다
 * [출력] 오름차순으로 정렬된 수열을 출력
 * [예시 입력]
 * 6
 * 13 5 11 7 23 15
 * [예시 출력]
 * 5 7 11 13 15 23
 */
public class Sorting01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
        return arr;
    }
}
