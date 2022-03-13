package com.study.array;
/**
 * 등수구하기
 * [설명] N명의 ㅣ학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성
 * [설명] 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * [설명] 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고, 그다음 학생은 4등이 된다
 * [입력] 첫줄에 N(3 <= N <= 100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * [출력] 입력된 순서대로 등수를 출력한다
 * [예시] 5
 * [예시] 87 89 92 100 76
 * [예시] 4 3 2 1 5
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Array08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = in.nextInt();
        }
        // 1
        for (int x : solution(cnt, arr)) {
            System.out.print(x + " ");
        }
        // 2
        for (int i = 0; i < cnt; i++) {
            System.out.print(solution2(arr)[i] + " ");
        }
    }

    // 1
    private static int[] solution(int cnt, int[] arr) {
        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            int count = 1;
            for (int j = 0; j < cnt; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    // 2
    private static int[] solution2(int[] arr) {
        int[] grade = new int[arr.length];
        List<Integer> sortedArr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < grade.length; i++) {
            grade[i] = sortedArr.indexOf(arr[i]) + 1;
        }
        return grade;
    }
}
