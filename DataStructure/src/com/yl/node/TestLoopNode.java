package com.yl.node;

public class TestLoopNode {
	public static void main(String[] args) {
		LoopNode n1 = new LoopNode(1);
		LoopNode n2 = new LoopNode(2);
		LoopNode n3 = new LoopNode(3);
		LoopNode n4 = new LoopNode(4);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("--------------------------");
		n1.after(n2);
		System.out.println("+++++++++++++++++++++++++");
		n2.after(n3);
		System.out.println("---------------");
		System.out.println(n1.next().getDate());
		System.out.println(n2.next().getDate());
		System.out.println(n3.next().getDate());
		
		/*System.out.println("---------------");
		n1.shu();
		System.out.println(n1);
		System.out.println(n2);*/
		
	}
		
}
