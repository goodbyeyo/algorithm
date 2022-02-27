package com.study.string;

import java.util.Scanner;

/**
 * 유효한 팰린드롬
 * [설명] 앞에서 읽을때나 뒤에서 일을때나 같은 문자열을 팰린드롬이라고 한다
 * [설명] 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면" NO"를 출력
 * [설명] 단 회문을 검사할때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않는다
 * [설명] 알파벳 이외의 문자들은 무시
 * [입력] 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어진다
 * [출력] 첫번째 줄에 팰린드롬인지의 결과를 "YES" 또는 "NO"로 출력
 * [예시] found7, time: study; Yduts emit, 7Dnuof -> YES
 */
public class String08 {

    private static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");   // A~Z가 아니면 "" 으로
//        System.out.println("str = " + str);
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}

