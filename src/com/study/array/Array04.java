package com.study.array;

/**
 * [설명] 피보나치 수열 출력 (앞의 2개의 수를 합하여 다음 숫자가 되는 수열)
 * [입력] 피보나치 수열의 총 항의 수를 입력.. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력
 * [예시] 10   ->  1 1 2 3 5 8 13 21 34 55
 */

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 1
        System.out.print(solution(n));
        // 2
        for (int x : solution2(n)) {
            System.out.print(x + " ");

        }
        // 3
        solution3(n);

    }

    private static String solution(int n) {
        String answer = "";
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        answer = arr[0] + " " + arr[1] + " ";
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            answer += arr[i] + " ";
        }
        return answer;
    }

    private static int[] solution2(int n) {
        int[] answer =  new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];

        }
        return answer;
    }

    private static void solution3(int n) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

