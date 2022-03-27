package com.study.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A, B 두개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성
 * [설명] 첫번째 줄에 집합 A의 크기 N(1 <= N <= 30,000)이 주어진다
 * [설명] 두번째 줄에 N개의 원소가 주어진다. 원소가 중복되어 주어지지 않는다
 * [설명] 세번째 줄에 집합 B의 크기 M(1 <= N <= 30,000)이 주어진다
 * [설명] 네번째 줄에 N개의 원소가 주어진다. 원소가 중복되어 주어지지 않는다
 * [설명] 각 집합의 원소는 1,000,000,000이하의 자연수
 * [출력] 두 집합의 공통 원소를 오름차순으로 정렬하여 출력
 * [입력예제]
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 * [출력예시] 2 3 5
 */
public class twoPointers02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        for (int x : solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
}
