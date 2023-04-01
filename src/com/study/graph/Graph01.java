package com.study.graph;

import java.util.Scanner;

/**
 * 경로탐색 (인접행렬)
 * 방향그래프가 주어지면 1번 정점에서 N번 벙점으로 가는 모든 경로의 가지 수를 출력하는 프로그램 작성
 * 1  ↔   2  →  5
 * ↓  ↘ ↙ ↑  ↗
 * 3  →   4
 * 위 그래프 1번 정점에서 5번 정점으로 가는 가지 수 : 6가지
 * 1 2 3 4 5
 * 1 2 5
 * 1 3 4 2 5
 * 1 4 2 5
 * 1 4 5
 *
 * [입력]
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 *
 * [출력]
 * 6
 */
public class Graph01 {
    static int n, m, answer = 0;
    static int [][] graph;
    static int [] ch;

    //
    public void DFS(int v) {
        if (v==n) answer ++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;  // call
                    DFS(i);
                    ch[i] = 0;  // back
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph01 main = new Graph01();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }
}
