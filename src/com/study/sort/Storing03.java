package com.study.sort;

import java.util.Scanner;

/**
 * 삽입 정렬
 * [설명] N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성
 * [출력] 오름차순으로 정렬된 수열을 출력
 * [예시 입력] 6 // 11 7 5 6 10 9
 * [예시 출력] 5 6 7 9 10 11
 */
public class Storing03 {
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
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
}