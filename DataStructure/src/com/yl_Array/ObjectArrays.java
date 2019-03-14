package com.yl_Array;

import java.util.Arrays;

public class ObjectArrays {
	private int[] elements;
	public ObjectArrays() {
		elements = new int[0];
	}
	
	//获取数组长度
	public int size() {
		return elements.length;
	}

	//向数组的末尾增加一个元素 
	public void add(int element) {
		//创建一个新数组
		int[] arr = new int[elements.length+1];
		for(int i = 0;i<elements.length;i++) {
			arr[i]=elements[i];
		}
		//将添加的元素放入到新数组中
		arr[elements.length]=element;
		
		//将新数组赋值给原数组
		elements=arr;
		
	}
	//println 打印 数组中的元素
	public void show() {
	System.out.println(Arrays.toString(elements));
	}
	//冲数组中删除指定元素
	public void delete(int pos) {
		if(pos < 0 || pos > elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		int[] newArr =  new int[elements.length-1];
		for(int i = 0; i<newArr.length;i++) {
			if(i<pos) {
				newArr[i]=elements[i];
				
			}
			else {
				newArr[i]=elements[i+1];
			}
		}
		elements=newArr;
			
		}
	//给定位置  取出该位置的值
	public int get(int index) {
		return elements[index];
	}
	
	//指定位置进行插入
	public void insert(int pos,int data) {
		/*if(pos<0 || pos>elements.length) {
			throw new RuntimeException("插入的位置越界"); 
		}*/
		int[] newArr =  new int[elements.length+1];
		for(int i = 0; i<elements.length;i++) {
			if(i < pos) {
				newArr[i] = elements[i];
				
			}
			
			else {
				newArr[i+1]=elements[i];
			}
		}
		newArr[pos]=data;
		elements=newArr;
	}
	
}
