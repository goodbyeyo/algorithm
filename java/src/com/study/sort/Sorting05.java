package com.study.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 중복확인
 * [설명] 중복된 숫자가 존재하면 D를 출력, 모두 다른 숫자에 해당하면 U 출력
 * [입력] 첫번째 줄에 자연수 N, 두번째 줄에 학생들이 적어낸 N개의 자연수 입력
 * [출력] 첫번째 줄에 D 또는 U 를 출력
 * [예시] 8 // 20 25 52 30 39 33 43 33
 * [출력] D
 */

public class Sorting05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(solution(n, arr));

    }

    private static String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);   // 배열을 오름차순 정렬
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) { // 중복체크
                return "D";
            }
        }
        return answer;
    }
}
