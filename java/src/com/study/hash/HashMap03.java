package com.study.hash;

/**
 *  [매출액의 종류]
 *  현수의 아빠는 제과점을 운영
 *  현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구해야 한다
 *  만약 K=7이고 7일간의 매출기록이 아래와 같고, 이때 K=4이면
 *  20 12 20 10 23 17 10
 *  각 연속 4일간의 구간의 매출종류는
 *  첫 번째 구간은 [20, 12, 20, 10] 는 매출액의 종류가 20, 12, 10으로 3이다.
 *  두 번째 구간은 [12, 20, 10, 23] 는 매출액의 종류가 4이다.
 *  세 번째 구간은 [20, 10, 23, 17] 는 매출액의 종류가 4이다.
 *  네 번째 구간은 [10, 23, 17, 10] 는 매출액의 종류가 3이다.
 *  N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터
 *  각 구간별 매출액의 종류를 출력하는 프로그램을 작성
 *  [입력] 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어진다
 *  [입력] 두 번째 줄에 N개의 숫자열이 주어진다.
 *  [입력] 각 숫자는 500이하의 음이 아닌 정수이다
 *  [출력] 첫 줄에 각 구간의 매출액 종류를 순서대로 출력
 *  [입력] 7 4
 *  [입력] 20 12 20 10 23 17 10
 *  [출력] 3 4 4 3
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMap03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int x : soulution(n, k, arr)){
            System.out.print(x + " ");
        }

    }

    private static ArrayList<Integer> soulution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        int lt=0;
        for (int rt = k - 1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt])-1);
            if (hm.get(arr[lt]) == 0){
                hm.remove(arr[lt]);
                lt++;
            }
        }
        return answer;
    }
}
