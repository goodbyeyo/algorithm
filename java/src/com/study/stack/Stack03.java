package com.study.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
 */
public class Stack03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
            System.out.println(solution(board, moves));
        }
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {  // stack.peek() 꺼내서 값만 확인
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
