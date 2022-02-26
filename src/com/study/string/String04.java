package com.study.string;

import java.util.*;

/**
 * 단어 뒤집기
 * [설명] N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
 * [입력] 첫 줄에 자연수 N(3 <= N <= 20) 이 주어진다
 * [입력] 두번째 줄부터 N개의 단어가 각 줄어 하나씩 주어진다. 단어는 영어 알파멧으로만 구성
 * [출력] N개의 단어를 입력된 순서대로 한줄에 하나씩 뒤집어서 출력한다
 */
public class String04 {
    public static void main(String[] args) {
        String04 T = new String04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];   // String 배열을 만들면 기본적으로 null 값으로 초기화된다

        for(int i=0; i<n; i++){
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
//        ArrayList<String> tmp;
//        tmp=T.solution(n, str);
//        for(int i=0; i<tmp.size(); i++){
//            System.out.println(tmp.get(i));
//        }
    }

    private ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // 1) 전체 뒤집기
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        // 2) 쌍으로 위치 교환하면서 뒤집기
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // valueOf는 static으로 선언된 클래스 메서드
            answer.add(tmp);
        }
        return answer;
    }

}
