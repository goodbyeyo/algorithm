package com.study.recursive;

import java.util.Scanner;

/**
 * 자연수 N 이 입력 -> 재귀 함수를 이용 1부터 N까지 출력
 * [입력 예시] 3
 * [출력 예시] 1 2 3
 */

public class Recursive01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);    // Stack Frame : 매개 변수, 지역 변수, 복귀 주소
    }

    private static void DFS(int n) {
        if (n == 0) {
            return ;
        }else{
            // System.out.print(n + " "); // 3 2 1
            DFS(n - 1);
            // Back Tracking
            System.out.print(n + " ");    // 1 2 3
        }
    }

}
