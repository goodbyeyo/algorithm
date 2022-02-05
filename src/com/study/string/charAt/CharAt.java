package com.study.string.charAt;

public class CharAt {

    // 문자열처럼 생긴 음이 아닌 정수값 num1, num2 문자열의 합을 return
    // non-negative integers num1 and num2 represented as string
    
    // num1, num2 의 길이는 1000보다 작다
    // num1, num2 숫자만 포함(0~9)
    // num1, num2 선행 0을 포함하지 않는다

    // charAt(), substring()
    // int num = str.charAt(i) - '0';

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "888";
        System.out.println(new CharAt().solve(num1, num2));
    }

    private String solve(String num1, String num2) {
        // 1
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        // 2
        while (num1Length >= 0 || num2Length >= 0) {
            int n1 = 0, n2 = 0;
            if (num1Length >= 0) {
                n1 = num1.charAt(num1Length) - '0'; // String -> Int 형변환
                System.out.println("n1 = " + n1);
            }
            if (num2Length >= 0) {
                n2 = num2.charAt(num2Length) - '0'; // String -> Int 형변환
                System.out.println("n2 = " + n2);
            }
            int sum = n1 + n2 + carry;  // 11
            carry = sum / 10;   // 몫을 다음 반복문때 더해준다
            sb.append(sum % 10);
            num1Length--;
            num2Length--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString(); // 역순 정렬
    }

}
