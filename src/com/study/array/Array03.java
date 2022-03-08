package com.study.array;

/**
 * [설명] A,B 두사람이 가위바위보 게임
 * [설명] 총 N번의 게임을 하여 A가 이기면 A를 출력, B가 이기면 B를 출력, 비길경우에는 D를 출력
 * [설명] 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
 * [설명] 두사람의 각회의 가위, 바위, 보 정보가 주어지면 각회를 누가 이겼는지 출력하는 프로그램 작성
 * [입력] 첫번째 줄에 게임 횟수인 자연수 N (1 <= N <= 100 ) 이 주어진다
 * [입력] 두번째 줄에 A가 낸 가위, 바위, 보 정보 N 개 주어진다
 * [입력] 세번째 줄에 B가 낸 가위, 바위, 보 정보 N 개 주어진다
 * [출력] 각 줄에 각 회의 승자를 출력한다. 비겼을 경우 D를 출력한다
 * [예시] 5
 * [예시] 2 3 3 1 3
 * [예시] 1 1 2 2 3
 * [결과] A B A B D
 */
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arrB[j] = in.nextInt();
        }
        for (char x : solution(n, arrA, arrB).toCharArray()) {
            System.out.println(x);
        }
//        System.out.println(solution(n, arrA, arrB));
    }

    private static String solution(int n, int[] arrA, int[] arrB) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                answer += "D";
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                answer += "A";
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                answer += "A";
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }
}
