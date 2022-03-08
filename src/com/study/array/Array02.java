package com.study.array;

import java.util.Scanner;

/**
 * [설명] 선생님이 N명의 학생을 일렬로 세웠습니다.
 * [설명] 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질ㄹ 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램 작성
 * [설명] (어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않습니다)
 * [입력] 첫 줄에 정수 N(5 <= N <= 100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 * [출력] 선생님이 볼 수 있는 최대 학생 수를 출력한다
 * [예시] 8
 * [예시] 130 135 148 140 145 150 150 153
 * [결과] 5
 */
public class Array02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       // n 숫자 입력
        int[] arr = new int[n];     // n 크기의 배열 생성
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();  // 배열에 하나씩 숫자 입력
        }
        System.out.print(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
