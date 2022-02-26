package com.study.string;

import java.util.Scanner;

/**
 * [설명] 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다
 * [설명] 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력
 * [설명] 단 회문을 검사할 때 대소문자를 구분하지 않는다
 * [입력] 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어진다.
 * [출력] 첫번째 줄에 회문 문자열인지의 결과를 "YES" 또는 "NO"로 출력
 */
public class String07 {

    private static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        char[] arr = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            lt++;
            rt--;
        }
        String value = String.valueOf(arr);
        if(!str.equals(value)){
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

}
