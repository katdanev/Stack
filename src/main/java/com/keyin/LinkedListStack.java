package com.keyin;

import java.util.LinkedList;
import java.util.Stack;

// Implement a stack data structure using LinkedList instead of Arrays.

public class LinkedListStack<T> {

    private LinkedList<T> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    // Push - add the element to the Stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop - Removes and returns the element to the Stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Your stack is empty");
        }
        return list.removeFirst();
    }

    // Peek -  Returns the element from  the top of the stack without deleting it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Your stack is empty");
        }
        return list.getFirst();
    }

    // isEmpty - Checks if the stack is empty or not
    public boolean isEmpty() {
        return list.isEmpty();
    }


    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Pop and print elements from the top of the stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Peek at the top element without removing it
        System.out.println(stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
