package com.study.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 중복문자제거
 * [설명] 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성
 * [설명] 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지
 * [입력] 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다
 * [출력] 첫 줄에 중복문자가 제거된 문자열을 출력한다
 * [예시] ksekkset => kset
 */
public class String06 {

    private String removeDuplicateCharater(String str) {
        String answer = "";
        // 1) 문자열의 자신의 위치가 처음 발견된 위치 확인해서 같을 경우만 문자열 추가(다를경우 중복문자)
//        for (int i = 0; i < str.length(); i++) {
////            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
//            if(str.indexOf(str.charAt(i)) == i){
//                answer += str.charAt(i);
//            }
//        }

        // 2) 문자열의 배열 순서대로 더하면서 위치가 구해지지 않는 경우만 문자열 추가(구해지는경우 중복문자)
        char[] charArr = str.toCharArray();
        for (char x : charArr) {
            if (answer.indexOf(x) == -1) {
                answer += x;
            }
        }

        // 3) 문자를 배열로 저장하고 없는경우에만 리스트에 담는다(있는 경우는 중복문자)
//        ArrayList<Character> list = new ArrayList<>();
//        for (char x : str.toCharArray()) {
//            if (!list.contains(x)) {
//                list.add(x);
//                answer += x;
//            }
//        }

        // 4) HashSet을 이용한 방법
//        char[] arr = str.toCharArray();
//        Set<String> cache = new HashSet<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            String value = String.valueOf(arr[i]);
//            if (cache.contains(value)) {
//                continue;
//            }
//            cache.add(value);
//            sb.append(value);
//
//        }
//        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String06 T = new String06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.removeDuplicateCharater(str));
//        Scanner in = new Scanner(System.in);
//        Sting str = in.nextLine();
//        System.out.println(solution(str));
    }

//    private static String solution(String str) {
//        return null;
//    }
}
