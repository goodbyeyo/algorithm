package com.study.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 * [입력설명] 첫 줄에 자연수 N(5 <= N <= 100) 과 M(0 <=M <N)이 주어진다
 * [입력설명] 두번째 줄에 접수한 순서대로 환자의 위험도(50 <= 위험도 <= 100)가 주어진다
 * [입력설명] 위험도는 값이 높을수록 더 위험하다는 뜻으로 같은 값의 위험도가 존재 할 수 있다
 * [츌력설명] M번째 환자의 몇 번째로 진료받는지 출력
 * [입력예제 1] 5 2
 * [입력예제 1] 60 50 70 80 90
 * [출력예제 1] 3
 * [입력예제 2] 6 3
 * [입력예제 2] 70 60 90 60 60 60
 * [출력예제 2] 4
 */

public class Queue03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    private static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}

