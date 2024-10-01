package com.study.string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * [설명] 영어 알파벳과 특수 문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고
 * [설명] 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램 작성
 * [입력] 첫줄에 길이가 100을 넘지 않는 문자열이 주어진다
 * [출력] 첫줄에 알파벳만 뒤집힌 문자열을 출력
 * [예시] a#b!GE*T@S => S#T!EG*b@a
 */
public class String05 {

    private String solution(String str) {
        String answer;
        char[] s = str.toCharArray();   // 문자배열생성
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])){
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        String05 T = new String05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
