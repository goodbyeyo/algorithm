package com.study.recursive;

/**
 * Tree 말단 노드까지의 가장 짧은 경로 최단거리 -> [DFS]
 * 사실 BFS 로 구하는게 좋다
 * 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성
 * 각 경로의 길이는 루트 노드에서 말단 노드까지 가는데 이동하는 횟수를 구하기
 *          1
 *      2      3
 *   4    5
 */
public class Recursive09 {
    Node root;

    public int DFS(int L, Node root) {
        // 양쪽의 자식노드가 있어야 함(재귀 호출시 에러 발생 방지)
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
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
