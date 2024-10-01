package com.study.hash;

/**
 * K번째 큰 수
 * 1부터 100사이 자연수가 전힌 N장의 카드가 있다.
 * 같은 숫자의 카드가 여러장 있을 수 있다
 * 이 중 3장의 카드를 뽑아 각 카드에 적힌 수를 합한 값을 기록 하려고 한다
 * 3장을 뽑을 수 있는 모든 경우를 기록한다
 * 기록 한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성한다
 * 만약 큰 수로부터 만들어진 수가 25 25 23 23 2 20 19 이고 K 값이 3이라면 K번째 큰값은 22
 * [입력설명] 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다
 * [출력설명] 첫 줄에 K번째 수를 출력한다. K번째 수가 존재하지 않으면 -1를 출력한다.
 * [입력예제]
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 * [출력예제]
 * 143
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMap05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }

    private static int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());  // 내림차순으로 자동정렬
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) {
                return x;
            }
//            System.out.println(cnt+"-"+x);
        }
        return answer;
        // Tset.remove(143); Tset.remove : 제거
        // Tset.size(); // 원소의 갯수 출력
        // Tset.first(); // 오름차순 -> 최소값, 내림차순 : 최대값
        // Test.last();  // 오름차순 -> 최대값, 내림차순 : 최소값값
    }

}
