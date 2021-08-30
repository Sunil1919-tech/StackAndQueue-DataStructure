package com.bridgelabz;

/*
Stack class is to implement the stack Operation
 */
public class Stack<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    // push the Node to stack
    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }


    //peek the top node in stack
    public INode peek() {
        return myLinkedList.head;
    }

    //pop operation in Stack
    public INode pop() {
        return myLinkedList.popFirst();
    }
}
