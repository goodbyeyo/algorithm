package com.study.stack;

import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(3);
        st.push(2);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
