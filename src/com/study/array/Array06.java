package com.study.array;

/**
 * 뒤집은 소수
 * [설명] N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램 작성
 * [설명] 32 -> 23 (소수이므로 출력), 910 -> 19 (첫자리부터의 연속된 0은 무시)
 * [예시] 9
 * [예시] 32 55 62 20 250 370 200 30 100
 * [정답] 23 2 73 2 3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(cnt, arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

