package com.study.string;

import java.util.Scanner;

/**
 * 문자거리
 * [설명] 첫번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어진다. 문자열의 길이는 100을 넘지 않는다
 * [출력] 첫번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다
 * [예시] ttteachermode e -> 3 2 1 0 1 2 1 0 1 2 2 1 0
 * [예시] teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
 */
public class String10 {

    private static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); // 둘중에 작은값을 배열에 할당
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // 문자열 하나 읽기
        char c = in.next().charAt(0);   // 문자 하나 읽기
        for(int x : solution(str, c)) { // 문자열과 문자 파라미터로 넘기기
            System.out.print(x + " ");
        }
    }
}
