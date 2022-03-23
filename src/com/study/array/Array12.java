package com.study.array;
/**
 * 멘토링
 * [설명] M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램 작성
 * [입력] 첫번째 줄에 반 학생 수 N(1 <= N <= 20) 과 M(1 <= M <= 10) 이 주어진다.
 * [입력] 두번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등,...N등 순으로 표현
 * [입력] 만약 한줄에 N=4이고, 테스트 결과가 3 4 1 2 로 입력되었다면 3번 학생이 1등, 4번학생이 2등, 1번학생이 3등, 2번학생이 4등을 의미
 * [출력] 첫번째 줄에 짝을 만들수 있는 총 경우를 출력
 * [예시 입력]
 * 4 3         // N=4, M=3
 * 3 4 1 2
 * 4 3 2 1
 * 3 1 4 2
 * [예시 답안 ] 3
 * [힌트] (3,1) (3,2) (4,2)와 같이 3가의 경우의 (멘토, 멘티) 짝을 만들 수 있다.
 */

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {   // 테스트 번호
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) {   // 등수 번호 
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
