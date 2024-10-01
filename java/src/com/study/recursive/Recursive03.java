package com.study.recursive;

import java.util.Scanner;

/**
 *  Factorial(팩토리얼)
 *  자연수 N이 입력 -> N!을 출력
 *  [입력 예시] 5
 *  [출력 예시] 120
 */
public class Recursive03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(DFS(n));
    }

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }
}
