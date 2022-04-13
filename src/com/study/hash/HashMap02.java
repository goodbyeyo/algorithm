package com.study.hash;

/**
 * 아나그램(해쉬)
 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다
 * 예를 들면 AbaAeCe와 BaeeACA는 알파벳의 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * 알파벳과 그 개수가 모두 일치한다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라고 한다
 * 길이가 같은 두개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성
 * 아나그램 판별시 대소문자가 구분된다
 * [입력] 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두번째 단어가 입력된다, 단어의 길이는 100을 넘지 않는다
 * [출력] 두 단어가 아나그램이면 "YES"를 출력하고, 아니면 "NO"를 출력한다
 * [예시] AbaAEce, baeeACA -> YES
 * [예시] abaCC, Caaab -> NO
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMap02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.print(solution(a, b));
    }

    private static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }
}
