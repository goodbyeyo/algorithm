package com.study.twoPointers;

/**
 * 두 배열 합치기
 * 오름차순으로 정렬이 된 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램 작성
 * [입력] 첫번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어진다
 * [입력] 두번째 줄에 N개의 배열 원소가 오름차순으로 주어진다
 * [입력] 세번째 줄에 두 번째 배열의 크기 M(1<=N<=100)이 주어진다
 * [입력] 네번째 줄에 M개의 배열 원소가 오름차순으로 주어진다.
 * [입력] 각 리스트의 원소는 int형 변수의 크기를 넘지 않는다
 * [출력] 오름차순으로 정렬된 배열을 출력한다
 * [예제]
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 * [답안] 1 2 3 3 5 6 7 9
 */

import java.util.ArrayList;
import java.util.Scanner;

public class twoPointers01 {
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
        int p1=0;
        int p2=0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            }else{
                answer.add(b[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(a[p1++]);
        }
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }
}
