package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * purpose-to create stack and Queue Using Linked List
 * @author Sunil
 * @version 16.0
 * @since 25/08/2021
 */
public class MyLinkedListTest {
    //testcase to Create the Stack Using Linked list
    @Test
    public void IfStackIsCreated_shouldReturnTrue() {
        Stack<MyNode<Integer>> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode peek = stack.peek();
        Assertions.assertEquals(peek, myFirstNode);
    }
    //testcase to Peak and Pop
    @Test
    public void IfStackPopOrPeek_ShouldReturnTrue() {
        Stack<MyNode<Integer>> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode popStack = stack.pop();
        Assertions.assertEquals(popStack, myFirstNode);
    }
}
