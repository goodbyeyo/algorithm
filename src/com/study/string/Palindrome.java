package com.study.string;

public class Palindrome {

    // 문자열  s의 substring에서 가장 긴 회문 리턴

    // 1. 문제분석(문제 정확히 이해, 분석내용정리 Devide & Conquer )
    // 2. 규칙찾기(분석내용으로 규칙을 찾는다)
    // 3. 코딩화(분석내용으로 알맞은 구현방법 찾기)
    // 4. 알고리즘 적용(알고리즘 정하고 담을 그릇 정한다)

    // index를 기준으로  left, right의 값이 같아야한다
    // s.charAt(left) == s.charAt(right)
    // left--, right-- 하면서 찾아들어간다
    // End = 끝번호-시작번호-1,   Start = 시작번호+1

    // 시간복잡도 : O(N^2),  대상 : String s,  이유 : String s를 for문을 돌리면서 내부에서 findSubstring()을 한번 더 호출하기때문

    // 공간복잡도 : 대상(Source) : 실제 상요되는 저장 공간을 계산(메모리 사용량)
    // 예 : 프로그램을 실행 및 완료하는데 필요한 저장공간
    // Space Complexity : O(1), 대상 : String s 의 substring,
    // 이유 : beginIndex, endIndex가 결정되면 String값을 substring 이용

    // 참고
    // O(1) : 스택, 큐, Map
    // O(n) : for문 => 데이터를 한번씩 다 호출하니까 가장 많음
    // O(lon N) : sort, prirotiyQueue, binary Search Tree, Tree
    // O(Klog N) : k번 만큼 소팅하는 경우
    // O(n^2) : 이중 for문
    // O(m*n) : 이중 for문인데, n이 다른 경우 bfs, dfs 류(예 n=100인데 m=5인 경우)
    
    public static void main(String[] args) {
        Palindrome a =  new Palindrome();
        String s = "banana";
//        String s = "bbbb";
        System.out.println(a.solve(s));
    }

    int start, end;

    public String solve(String s) {
        // 1. ds
        int len = s.length();
        if (len < 2) {
           return s;
        }

        // for while
        for (int i = 0; i < len; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                findSubstring(s, i, i);     //odd(홀수)
//                findSubstring(s, i, i+1);   //even(짝수)
            }
        }
        return s.substring(start, end+start);
    }

    private void findSubstring(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // 2, 1, 0
            right++; // 4, 5, 6
        }
        // 0, 6 -> 1, 5
        if(end < right - left - 1){
            start = left + 1;
            end = right-left - 1;
        }
        System.out.println("start = " + start + " end " + end);
    }
}
