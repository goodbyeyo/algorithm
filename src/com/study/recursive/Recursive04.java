package com.study.recursive;

import java.util.Scanner;

/**
 * Fibonacci numbers
 * 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
 * [입력 예시] 10
 * [출력 예시] 1 1 2 3 5 8 13 21 34 55
 */
public class Recursive04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(DFS(i) + " ");
        }


    }

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }

}
