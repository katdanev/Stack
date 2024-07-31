package com.keyin;

import java.util.Stack;

// LIFO - last in first out

public class StackArrays {

        int [] arr;
        int topOfStack;

        public StackArrays(int size){
            this.arr = new int[size];
            this.topOfStack = -1;
            System.out.println("The stack is created with a size of: " + size);
        }
        //Check if it is empty

        public boolean isEmpty(){
            if (topOfStack == -1){
                System.out.println("Stack is empty");
                return true;
            } else {
                System.out.println("Stack is not empty");
                return false;
            }
        }

        //check if stack is Full стек заповнений до макс ємності
        public boolean isFull(){
            if (topOfStack == arr.length -1){
                System.out.println("Stack is full");
                return true;
            } else {
                System.out.println("Stack is not full");
                return false;
            }
        }

        //implement a push method
        public void push(int value){
            if (isFull()){
                System.out.println("the stack is full");
            } else {
                arr[topOfStack + 1] = value;
                topOfStack++;
                System.out.println("The value is successfully inserted");
            }
        }
        // my code
        //implement pop method (deleting the element)
    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty");
        }
        int poppedValue = arr[topOfStack];
        topOfStack--;
        System.out.println("You popped the value: " + poppedValue);
        return poppedValue;
    }

    //implement peek ( отримання верхнього елементу стеку)
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        }
        int peekValue = arr[topOfStack];
        System.out.println("The top element in the stack is: " + peekValue);
        return peekValue;
    }

        //implement delete a stack
        public void delete() {
            arr = null;
            topOfStack = -1;
            System.out.println("The stack has been deleted");
        }

    }


