package com.study.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기(BFS : 상태트리탐색)
 *
 * A 와 송아지의 위치가 수직선상의 좌표점으로 주어지면
 * A는 현재위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다
 * 송아지는 움직이지 않고 제자리에 있다
 * A는 스카이 콩콩을 타고 가는데 한번의 점프로 옆으로 1, 뒤로1, 앞으로 5를 이동가능
 * 최소 몇번의 점프로 A가 송아지의 위치까지 갈수 잇는지 프로그램 작성
 * 첫번째 줄에 A의 위치 S와 송아지의 위치 E가 주어진다
 * [입력] 직선의 좌표점은 1부터 10,000까지
 * [출력] 점프의 최소 횟수를 구한다 답은 1이상이고, 반드시 존재
 *
 */
public class Recursive08 {
    int answer = 0;
    int[] distance = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                // if (x == e) return L;
                for (int j = 0; j < 3; j++) {
                    int nextX = x + distance[j];
                    if (nextX == e) return L + 1;
                    if (nextX >= 1 && nextX <= 10000 && ch[nextX] == 0) {
                        ch[nextX] = 1;
                        Q.offer(nextX);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Recursive08 T = new Recursive08();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(T.BFS(s, e));
    }


}
