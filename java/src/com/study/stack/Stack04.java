package com.study.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postfix)
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12
 * [입력설명] 첫 줄에 후위연산식이 주어진다 연산식의 길이는 50을 넘지 않는다
 * [입력설명] 식은 1~9의 숫자와 +,-,*,/ 연산자로만 이루어진다
 * [출력설명] 연산한 결과를 출력한다
 * [입력예제] 352+*9-
 * [출력예제] 12
 */
public class Stack04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(soultion(str));
    }

    private static int soultion(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) { // 숫자인지 확인
                stack.push(x - 48);
            }else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x == '+'){
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);

        return answer;
    }
}
