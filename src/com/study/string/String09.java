package com.study.string;

import java.util.Scanner;

/**
 * 숫자만 추출
 * [설명] 문자와 숫자가 섞여잇는 문자열이 주어지면 그중 숫자만 추출하여 그 순서대로 자연수를 만든다
 * [설명] 만약"tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205가 된다
 * [설명] 추출하여 만들어지는 자연수는 100,000,000을 넘지 않는다
 * [입력] 첫 줄에 숫자가 섞인 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다
 * [출력] 첫줄에 자연수를 출력한다
 * [예시] g0en2t0s8eSoft -> 208
 */
public class String09 {
    private static int solution(String str) {
        // 1) char 를 탐색하는 방법
//        int answer = 0;
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }
//        return answer;

        // 2) Charater.isDigit 메서드를 이용하는 방법
//        String answer = "";
//        for (char x : str.toCharArray()) {
//            if (Character.isDigit(x)) {
//                answer += x;
//            }
//        }
//        return Integer.parseInt(answer);
        
        // 3) 정규표현식을 이용하는 방법
        return Integer.valueOf(str.replaceAll("^0-9]", ""));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

}
