package com.study.array;
/**
 * 소수(에라토스테네스 체)
 * [설명] 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램 작성
 * [예시] 20 -> 2, 3, 5, 7, 11, 13, 17. 19
 * [답안] 8
 */

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) {
//                System.out.println("arr["+i+"]===="+arr[i]);
                answer++;
                for (int j = i; j < n; j = j + i) { // j는 i의 배수만큼 증가하면서 배수 체크
                    arr[j] = 1;
                }
            }

        }
        return answer;
    }
}
