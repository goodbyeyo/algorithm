package com.study.linkedList;

public class DoubleLinkedList<T> {

    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;
        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        }
        Node<T> node = this.head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<T>(data);
    }
}
