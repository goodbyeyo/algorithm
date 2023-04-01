package com.study.graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Graph 인접 행렬 문제를 ArrayList 로 접근해서 해결
 */
public class ArrayListSearch {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;;
    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nextV : graph.get(v)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    DFS(nextV);
                    ch[nextV] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayListSearch main = new ArrayListSearch();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());    // 초기화 필요
        }
        ch = new int[n+1];
        for (int i = 0; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }
}
