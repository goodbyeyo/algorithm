package com.study.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정 설계
 * [입력 설명] 첫 줄에 한줄에 필수과목의 순서가 주어진다. 모든 과목은 영문 대문자이다.
 * [출력 설명] 첫 줄에 수업설계가 잘된 것이면 "YES", 잘못된 것이면 "NO"를 출력한다.
 * [입력 예제] CBA
 * [입력 예제] CBDAGE
 * [출력 예제] YES
 */
public class Queue02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(solution(a, b));
    }

    private static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) {
            Q.offer(x); // 필수과목 세팅
        }
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {    // 필수과목에서 꺼낸 값과 비교
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}
