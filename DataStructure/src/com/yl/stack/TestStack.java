package com.yl.stack;

public class TestStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(5);
		myStack.push(6);
		myStack.push(9);
		myStack.push(4);
		myStack.push(2);
		myStack.push(15);
		int pop1 = myStack.pop();
		System.out.println(pop1);
		int pop2 = myStack.pop();
		System.out.println(pop2);
		int pop3 = myStack.pop();
		System.out.println(pop3);
		int peek = myStack.peek();
		System.out.println(peek);
	}

}

