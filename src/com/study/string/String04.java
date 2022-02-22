package com.study.string;

import java.util.*;

public class String04 {
    public static void main(String[] args) {
        String04 T = new String04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }

    private ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
        }
        return answer;
    }

}
