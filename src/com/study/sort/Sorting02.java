package com.study.sort;

import java.util.Scanner;

/**
 * 버블 정렬
 * [설명] N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성
 * [출력] 오름차순으로 정렬된 수열을 출력
 * [예시 입력]
 * 6
 * 13 5 11 7 23 15
 * [예시 출력]
 * 5 7 11 13 15 23
 */

public class Sorting02 {
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
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
