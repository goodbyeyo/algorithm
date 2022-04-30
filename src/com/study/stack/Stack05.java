package com.study.stack;
/**
 * 쇠막대기
 * [입력설명] 한 쥴애 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호문자의 개수는 최대 100,000이다.
 * [출력설명] 잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
 * [입력예제 1] ()(((()())(())()))(())
 * [출력예제 1] 17
 * [입력예제 2] (((()(()()))(())()))(()())
 * [출력예제 2]
 */

import java.util.Scanner;
import java.util.Stack;

public class Stack05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }else{
                stack.pop();
                if (str.charAt(i - i) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
