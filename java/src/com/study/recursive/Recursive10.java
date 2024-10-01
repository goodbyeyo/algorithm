package com.study.recursive;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree 말단 노드까지의 가장 짧은 경로
 * 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램 작성
 *       1
 *    2     3
 *  4   5
 */
public class Recursive10 {
    Node root;
    public int BFS(int L, Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null  && cur.rt == null) return level;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Recursive09 tree = new Recursive09();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
