package com.study.recursive;

/**
 * 첫번째 줄부터 각 줄에 하나씩 부분집합을 아래와 같은 순서로 출력, 단 공집합은 출력 X
 * [입력 예시] 3
 * [출력 예시] 1 2 3
 *           1 2
 *           1 3
 *           1
 *           2 3
 *           2
 *           3
 */
public class Recursive06 {

    static int n;
    static int[] ch;

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        Recursive06 T = new Recursive06();
        T.DFS(1);
    }

    private void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 0; i <= n; i++){
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        }else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
}
