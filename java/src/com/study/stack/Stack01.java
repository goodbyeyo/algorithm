package com.study.stack;

/**
 * Stack : LIFO : Last In First Out
 * Queue : FIFO : First In First Out
 * 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 "YES", 올바르지 않으면 "NO"를 출력한다.
 * [입력예제]   (()())   (()())()))
 * [출력예제]    YES         NO
 */

import java.util.Scanner;
import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {  // String을 문자배열객체로
            if (x == '(') {
                stack.push(x);  // 추가
            }else{
                if (stack.isEmpty()) {
                    return "NO";    // 닫는 괄호가 많은 상황
                }
                stack.pop();    // 상단에 있는걸 꺼내고 리턴받는다

            }
        }
        if (!stack.isEmpty()) { // 여는 괄호가 많은 상황
            return "NO";
        }
        return answer;
    }
}
