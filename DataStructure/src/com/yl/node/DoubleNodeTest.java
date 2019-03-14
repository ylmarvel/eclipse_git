package com.yl.node;

public class DoubleNodeTest {
	public static void main(String[] args) {
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);
		n1.after(n2);
		n2.after(n3);
		System.out.println(n1.next().getDate());
		System.out.println(n2.next().getDate());
		System.out.println(n3.next().getDate());
		System.out.println(n2.pre().getDate());
		System.out.println(n3.pre().getDate());
	}
}
