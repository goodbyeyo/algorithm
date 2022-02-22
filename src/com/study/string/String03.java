package com.study.string;

import java.util.Scanner;

/**
 * [설명] 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성
 * [설명] 문장속의 각 단어는 공백으로 구분된다
 * [입력] 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어진다.
 * [입력] 문장은 영어 알파멧으로만 구성된다
 * [출력] 첫 줄에 가장 긴 단어를 출력한다.
 * [출력] 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다
 * 1) split
 * 2) indexOf, substring
 */
public class String03 {
    public static void main(String[] args) {
        String03 T = new String03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 문장(1줄)을 입력받아야 하므로 nextLine으로 받는다
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        // 1)
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x : s) {    // 배열이니까 forEach 가능
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
        // 2)
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {    // 공백위치를 발견하지 못하면 -1을 리턴
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {  // >= 로 조건을 변경하면 같은 길이의 뒤쪽 단어를 탐색
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);   // index 위치부터 분할
        }
        if (str.length() > m) { // 마지막 단어 체크
            answer = str;
        }

        return answer;
    }
}
