package com.study.array;
/**
 * 임시반장 정하기
 * 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이였던 사람이 가장 많은 학생을 임시반장으로 정한다
 * 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질때, 임시반장을 정하는 프로그램을 작성
 *           1학년   2학년  3학년  4학년   5학년
 * 1번학생      2      3     1      7      3
 * 2번학생      4      1     9      6      8
 * 3번학생      5      5     2      4      4
 * 4번학생      6      5     2      6      7
 * 5번학생      8      4     2      2      2
 * 5
 * 2 3 1 7 3
 * 4 1 9 6 8
 * 5 5 2 4 4
 * 6 5 2 6 7
 * 8 4 2 2 2
 */

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+1][6];  // 1부터 사용 5학년까지 있으니까 6까지
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(solution(n, arr));

    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int cnt=0;
            for (int j = 1; j < n; j++) {
                for (int k = 1; k <= 5; k++) {  // 5학년때까지
                    if (arr[i][k] == arr[j][k]) {   // [i]번 학생의 K학년의 반과 [j]번 학생의 K학년의 반이 같은지 비교
                        cnt ++; // 같으면 카운트 +1
                        break;  // 한번이라도 같으면 break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
