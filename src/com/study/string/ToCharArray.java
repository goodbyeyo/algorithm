package com.study.string;

public class ToCharArray {

    public static void main(String[] args) {

        String s = "(a(b(c)d";
//        String s="((a(b(c(e(f)d))";
//        String s = "in(f(lea)r)n)";
//        String s = "a)b(c)d";
//        String s = "(()))";
//        String s = "(()";
//        String s = "))((";
//        String s = "((((";
        System.out.println("result = " + new ToCharArray().solve(s));
    }

    public String solve(String s) {
        // 1
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int openBrace = 0;  // "("

        // openBrace 1 check
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openBrace++;
            } else if (c == ')') {
                if (openBrace == 0) continue;
                openBrace--;
            }
            sb.append(c);   // "(a(b(c)d";
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            if(sb.charAt(i) == '(' && openBrace-- > 0) continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();

    }

}
