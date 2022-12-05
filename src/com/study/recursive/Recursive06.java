package com.study.recursive;

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
            for (int i = 0; i < n; i++){
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
                if (tmp.length() > 0) {
                    System.out.println(tmp;
                }
            }
        }else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
}
