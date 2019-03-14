package com.yl.node;

public class TestNode {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		
		Node n2 = new Node(2);
		
		Node n3 = new Node(3);
		n1.appends(n2).appends(n3).appends(new Node(4));
		System.out.println(n1.next().next().next().getDate());
		System.out.println(n1.isLast());	
	System.out.println("------------------");
	
	System.out.println(n1);
//	n1.deleteNext();
	System.out.println(n2);
	System.out.println(n3);
	System.out.println("------------------");
	n1.show();
	System.out.println();
	n2.show();
	System.out.println("------------------");
	System.out.println(n1.LengthNode());
	System.out.println("------------------");
	n3.next.after(new Node(5));
	System.out.println(n1.LengthNode());
	n1.show();
	}

}
