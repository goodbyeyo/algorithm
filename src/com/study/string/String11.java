package com.study.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 문자열 압축
 * [설명] 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
 * [설명] 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램 작성
 * [입력] 첫줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * [출력] 첫줄에 압축된 문자열을 출력한다.
 * [예시] KKHSSSSSSSE -> K2HS7E
 */
public class String11 {

    private static String solution(String str) {
        String answer= "";
        str = str + " ";
        int cnt = 1;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                cnt++;
            } else {
                answer += arr[i];
                if(cnt > 1){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == str.charAt(i+1)) {
//                cnt++;
//            } else {
//                answer += str.charAt(i);
//                if(cnt > 1){
//                    answer += String.valueOf(cnt);
//                    cnt = 1;
//                }
//            }
//        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(solution(str));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String strr = br.readLine();
    }
}
