package com.keyin;


public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.push(4);
        stackArrays.push(5);

        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.delete();

    }
}