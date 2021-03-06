package com.study.hash;

/**
 * 학급회장(해쉬)
 * 학급회장을 뽑는데 후보로 A,B,C,D,E 후보가 등록을 하였다
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알바벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있다
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램 작성
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정
 * [입력] 첫 줄에는 반 학생 수 N(5<=N<=50)이 주어진다.
 * [입력] 두번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력된다
 * [출력] 학급 회장으로 선택된 기호를 출력한다
 * [예시]
 * 15
 * BACDBACCACCBDEDE
 * [답안] C
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMap01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.print(solutuon(n, str));
    }

    private static char solutuon(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            // map.containsKey('key') : map 에 key가 존재하는지 ture, false 리턴
            // map.size('key') : map에 key의 갯수를 리턴
            // map.remove('key') : map에 key를 삭제
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(key);
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}
