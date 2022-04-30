package com.study.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주 구하기
 * 8명의 왕자가 있고 3을 외친왕자가 제외된다고 가정하면
 * 처음에는 3번 왕자가 3을 외쳐 제외되고 이어 6,1,5,2,8,4번 왕자가 차례대로 제외되고 마지막에 7번이 남는다
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성
 * [입력] 첫 줄에 자연수 N(5 <= N <= 1,000)과 K(2 <= K <= 9)가 주어진다
 * [출력] 첫 줄에 마지막 남은 왕자의 번호를 출력
 * [입력예제] 8 3
 * [출력예제] 7
 */
public class Queue01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while (!Q.isEmpty()) {  // 비어있지 않으면 반복
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());  // 꺼낸값을 리턴받고 다시 넣는다
            }
            Q.poll();   // Queue에서 없앤다
            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }

        return answer;
    }
}
