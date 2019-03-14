package com.yl.stack;

public class MyStack {
	//栈的底层  使用数组实现
	int[] elements;
		public MyStack() {
			elements = new int[0];
		}
	
	public void push(int element) {
		//创建一个新数组    进行入栈操作
		int[] newArr = new int[elements.length+1];
		
		for(int i = 0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		//将需要添加到新数组的元素添加到最后
		newArr[elements.length] = element;
		elements = newArr;
	}
		//取出栈顶元素
	public int  pop() {
	//栈中的元素为空
		if(elements.length == 0) {
			throw new RuntimeException("stack is empty");
		}
		//取出数组的最后一个元素
		int element = elements[elements.length-1];
		//  创建一个新的数组
		int[] newArr = new int[elements.length-1];
		//原数组中除了最后一个的其他元素都放到新数组中进行更换数组
		for(int i = 0;i<elements.length-1;i++) {
			
			newArr[i] = elements[i];
			
		}
		elements = newArr;
		return element;
	}
	//查看栈顶元素
	public int  peek() {
		return elements[elements.length-1];
	}
	
	//判断栈是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
	
	
		
}
