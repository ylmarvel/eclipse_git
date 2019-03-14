package com.yl.stack;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		System.out.println(myQueue.isEmpty());
		myQueue.add(5);
		myQueue.add(6);
		myQueue.add(12);
		System.out.println(myQueue.isEmpty());
		myQueue.add(38);
		myQueue.add(66);
		myQueue.add(99);
		int queueLeng = myQueue.queueLeng();
		
		System.out.println("队列长度："+queueLeng);
		int poll = myQueue.poll();
		System.out.println(poll);
		int ele = myQueue.ele();
		System.out.println(ele);
			int eleReal = myQueue.eleReal();
			
			System.out.println(eleReal);
	}

}
