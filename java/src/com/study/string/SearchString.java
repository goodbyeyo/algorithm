package com.study.string;

import java.util.Scanner;

/**
 * 문자 찾기
 * [설명] 한개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇개 존재하는지 알아내는 프로그램 작성
 * [설명] 대소문자 구분하지 않음, 문자열의 길이는 100을 넘지 않는다
 * [입력] 첫 줄에 문자열이 주어지고, 두번째 줄에 문자가 주어진다
 * [입력] 문자열은 영어 알파벳으로만 구성되어 있다
 * [출력] 첫 줄에 해당 문자의 개수를 출력한다
 */

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
