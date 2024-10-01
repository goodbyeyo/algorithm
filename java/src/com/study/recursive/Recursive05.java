package com.study.recursive;

/**
 * 이진트리 순회 (깊이 우선 탐색)
 *      1
 *   2    3
 * 4  5  6  7
 *
 * 전위 순회 출력 : 1 2 4 5 3 6 7
 * 중위 순회 출력 : 4 2 5 1 6 3 7
 * 후위 순회 출력 : 4 5 2 6 7 3 1
 *
 *                          100
 *                        lt    rt
 *                       200     300
 *
 *              200                       300
 *               2                         3
 *           lt    rt                   lt    rt
 *           400   500                 600     700
 *
 *     400              500        600             700
 *      4                5          6                7
 *  lt    rt        lt    rt     lt    rt       lt     rt
 *  null null      null  null   null  null      null   null
 */
public class Recursive05 {
    Node root;

    public void DFS(Node root) {
        if (root ==null) return;
        else {
            DFS(root.lt);
            System.out.print(root.data + " ");
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Recursive05 tree = new Recursive05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}


