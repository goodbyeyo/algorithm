package com.study.string;

import java.util.Scanner;

/**
 * [설명] 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다
 * [설명] 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력
 * [설명] 단 회문을 검사할 때 대소문자를 구분하지 않는다
 * [입력] 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어진다.
 * [출력] 첫번째 줄에 회문 문자열인지의 결과를 "YES" 또는 "NO"로 출력
 * [예시] gooG => Yes
 */
public class String07 {

    private static String solution(String str) {
        String answer = "YES";
//        str = str.toUpperCase();    // 대소문자 구별하지 않으므로 대문자로 변경

        // 1) 문자를 뒤집은 다음 비교해서 일치여부 확인
//        char[] arr = str.toCharArray();
//
//        int lt = 0;
//        int rt = str.length() - 1;
//
//        while (lt < rt) {
//            char tmp = arr[lt];
//            arr[lt] = arr[rt];
//            arr[rt] = tmp;
//            lt++;
//            rt--;
//        }
//        String value = String.valueOf(arr);
//        if(!str.equals(value)){
//            answer = "NO";
//        }

        // 2)
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len-i-1)) {
//                return "NO";
//            }
//        }

        // 3)
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {   //  equalsIgnoreCase()대소문자 구별하지않고 비교
            answer = "NO";
        }

        return answer;

        // 4)
//        boolean equalsYn = true;
//        str = str.toLowerCase();
//        char[] arr = str.toCharArray();
//        int lt = 0;
//        int rt = str.length() - 1;
//        while (lt < rt) {
//            if(arr[lt] != arr[rt]){
//                equalsYn = false;
//                break;
//            }
//            lt++;
//            rt--;
//        }
//        return equalsYn ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

}
