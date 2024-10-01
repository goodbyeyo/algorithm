package com.study.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 정렬 후 배열 비교
 * [입력] 첫번째 줄에 자연수 N이 주어지고 두번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다
 * [출력] 첫번째 줄에 철수의 반 번호와 짜궁의 반 번호를 차례로 출력한다
 * [예제] 9 // 120 125 152 130 135 135 143 127 160
 * [출력] 3 8
 */
public class Sorting06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

}
