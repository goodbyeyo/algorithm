package com.study.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [설명] N(1 <= N <= 100) 개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성(첫번째 수는 무조건 출력)
 * [입력] 첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * [출력] 자신의 바로 앞 수 보다 큰 수만 한 줄로 출력한다.
 * [예시] 6
 * [예시] 7 3 9 5 6 12
 * [출력] 7 9 6 12
 */
public class Array01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();  // nextInt() 메서드를 통해 배열에 하나씩 넣는다
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
