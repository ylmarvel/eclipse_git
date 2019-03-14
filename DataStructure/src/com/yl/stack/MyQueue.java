package com.yl.stack;

//创建队列操作  
public class MyQueue {
	int[] elements;
	//定义队列列表     设置初始队列长度为0
	public MyQueue() {
		elements = new int[0];
	}
	//入队操作
	public void add(int element) {
		//创建一个新数组    进行入栈操作
				int[] newArr = new int[elements.length+1];
		//将原来的数组中的数据复制到新数组中
				for(int i = 0;i<elements.length;i++) {
					newArr[i] = elements[i];
				}
				//将需要添加到新数组的元素添加到最后
				newArr[elements.length] = element;
				elements = newArr;
			}
	
	//出队操作
	public int  poll() {
		//把数组中的第0个元素取出来
		int element = elements[0];
		//创建一个新的数组
		int[] newArr = new int[elements.length-1];
		//复制原数组中的元素到新数组中
		for(int i = 0;i<newArr.length;i++) {
			newArr[i] = elements[i];
		}
		elements = newArr;
		return element;
	}
	
	//  查看队列是否为空
	public boolean isEmpty() {
		
		return elements.length == 0;
	}
	
	//返回队列长度
	public int queueLeng() {
		return elements.length;
	}
	//返回队列首当前元素
	public int ele() {
		return elements[0];
	}
	//返回队列尾元素
	public int eleReal() {
		return elements[elements.length-1];
	}
	
	
	}
	
	
	

