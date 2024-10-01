package com.study.string;

import com.study.Main;

import java.util.Scanner;

/**
 * 대소문자 변환
 * [설명] 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력
 * [입력] 첫줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다
 * [입력] 문자열은 영어 알파벳으로만 구성되어 있다
 * [출력] 첫 줄에 대문자느 소문자로, 소문자는 대문자로 변환된 문자열을 출력력
 * */

public class String02 {
    public static void main(String[] args) {
        String02 T = new String02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
//        for(char x : str.toCharArray()) { // toCharArray() 문자를 문자배열로 생성
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            } else {
//                answer += Character.toLowerCase(x);
//            }
//        }
        // 대문자 : 65~90, 소문자 : 97 ~122
        // 소문자 - 32 = 대문자
        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122){
                answer += (char)(x - 32);
            }else{
                answer += (char)(x + 32);
            }
        }

        return answer;
    }
}
