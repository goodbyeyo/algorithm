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
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        }
        Node<T> node = this.head;
        while (node.data != null) {
            if (node.data == isData) {
                return node.data;
            }
            node = node.next;
            System.out.println(node.data);
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        }
        Node<T> node = this.tail;
        while (node.data != null) {
            if (node.data == isData) {
                return node.data;
            }
            node = node.prev;
            System.out.println(node.data);
        }
        return null;
    }

    public boolean insertToFront(T existedData, T addData) {
        if (this.head == null) {
            this.head = new Node<T>(addData);
            this.tail = this.head;
            return true;
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else {    // 전체 순회
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
// prev node.prev node.prev.next, newPrev.prev newPrev newPrev.next node.prev node next
                    Node<T> newPrev = new Node<T>(addData);
                    node.prev.next = newPrev;
                    newPrev.prev = node.prev;
                    newPrev.next = node;
                    node.prev = newPrev;
                    return true;

// other solution (is same?)
// prev nodePrev next , prev, nodePrev.next, nextPrev node next
//                    Node<T> nodePrev = node.prev;
//                    nodePrev.next = new Node<T>(addData);
//                    nodePrev.next.next = node;
//                    nodePrev.next.prev = nodePrev;
//                    node.prev = nodePrev.next;
//                    return true;
                } else {    // not found existedData
                    node = node.next;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(3);
        myLinkedList.addNode(5);
        myLinkedList.addNode(7);
        myLinkedList.addNode(9);
        myLinkedList.searchFromTail(7);
        myLinkedList.searchFromHead(3);
        myLinkedList.insertToFront(3, 2);
        myLinkedList.insertToFront(5, 4);
        myLinkedList.insertToFront(7, 6);
        myLinkedList.insertToFront(9, 8);
        System.out.println("---------------------");
        myLinkedList.printAll();
    }
}
