package com.bridgelabz;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    /* push the Node to stack */
    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    /* peak the top node in stack */
    public INode peak() {
        return myLinkedList.head;
    }
}
