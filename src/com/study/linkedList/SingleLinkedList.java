package com.study.linkedList;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;                 // data
        Node<T> next = null;    // pointer

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    private Node<T> search(T data) {
        if (this.head == null) {
            return null;
        }
        Node<T> node = this.head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public boolean deleteNode(T isData) {
        if (this.head == null) {
            return false;
        }
        Node<T> node = this.head;
        if (node.data == isData) {
            this.head = this.head.next;
            return true;
        } else {
            while (node.next != null) {
                if (node.next.data == isData) {
                    node.next = node.next.next;
                    return true;
                }
                node = node.next;
            }
            return false;
        }
    }

    // expected 2, 3, 4, 6, 7
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.addNode(6);
        myLinkedList.addNodeInside(2, 1);
        myLinkedList.addNodeInside(7, 6);
        myLinkedList.addNodeInside(8, 10);
        myLinkedList.deleteNode(1);
        myLinkedList.deleteNode(5);
        myLinkedList.deleteNode(8);
        myLinkedList.deleteNode(10);
        myLinkedList.printAll();
    }
}
