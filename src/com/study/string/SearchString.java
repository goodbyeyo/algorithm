package com.study.string;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        // static 메서드에서 instance 메서드를 호출하려면 클래스 객체를 생성해야 한다
        SearchString T = new SearchString();    //solution 메서드를 static로 생성하면 Main 클래스 객체를 생성하지 않아도 된다
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        // kb.next <- 문자열을 읽어들인 상태
        // charAt() <- 인덱스의 문자열을 리턴
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
    // instance 메서드
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()){ // 자료형 다음에는 배멸, 또는 eterator를 제공하는 컬렉션(List, Array)이 들어가야한다
             if(x == t) answer++;
        }
//        System.out.println(str + " " + t);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        return answer;
    }
}
