package com.study.recursive;

import java.util.Scanner;

/**
 * 이진수 출력(재귀)
 * 10진수 N 입력 -> 2진수로 변환하여 출력
 * [입력 예제] 11
 * [출력 예제] 1011
 */
public class Recursive02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);
    }

    private static void DFS(int n) {
        if (n == 0) {
            return;
        }else{
            DFS(n / 2);
            System.out.print(n % 2 + " ");  // 몫이 아닌 나머지 출력
        }
    }
}
