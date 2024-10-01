package com.study.array;

/**
 * 봉우리
 * 지도 정보가 N * N 격자판에 주어진다. 각 격자에는 그 지역의 높이가 쓰여있다
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역에 해당하는데, 봉우리 지역이 몇 개 인지 알아내는 프로그램 작성
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다
 * [입력] 첫 줄에 자연수 N이 주어진다(2 <= N <= 50)
 * [입력] 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * [예시] 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * [답안] 10
 */

import java.util.Scanner;

public class Array10 {
    static int[] dx = {-1, 0, 1, 0};   // 전역변수,  main에서 객체생성하면 인스턴스변수에 접근가능(static 사용하지 않아도 된다)
    static int[] dy = {0, 1, 0, -1};   // 시계방향으로 12시, 3시, 6시, 9시 방향으로 탐색 dx: 행 , dy: 열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(solution(n, arr));

    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // 행
                    int ny = i + dy[k]; // 열
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
