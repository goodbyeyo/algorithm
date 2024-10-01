package com.study.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬
 * N개의 평면상의 좌표(x,y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성
 * 정렬기준은 먼저 x값에 의해서 정려하고, x값이 같을 경우 y값에 의해 정렬한다
 * [입력]
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6

 * [출력]
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;    //  작은 수에서 큰 수 감산
        }else{
            return this.x - o.x;
        }
    }
}

public class CompareTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
