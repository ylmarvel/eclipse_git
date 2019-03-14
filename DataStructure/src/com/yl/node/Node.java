package com.yl.node;

//节点
public class Node {
	//创建出节点内容  进行下一个节点的数据内容进行复制    形成节点链
	//节点内容
	int data;
	//下一个节点
	Node next;
	//创建节点
	
	public Node(int data) {
	this.data  = data;
	
	}
	/*删除下一个节点  
	 * 通过将当前节点的下下个节点赋值给当前节点的下一个节点
	 * 实现将当前节点的下一个节点进行删除
	*/
	public void deleteNext() {
		
	Node newnext=next.next;
	this.next = newnext;
	}
	
	
	
	
//单次为节点追加节点
public void append(Node node) {
	this.next = node;
}
/**
 * 持续性的寻找节点  进行添加节点    通过线性的寻找  并且增加
 * */  

public Node appends(Node node) {
	//获取当前节点  谁调用即为谁的当前节点
	Node currentNode = this;
	//System.out.println(this);
	while(true) {
		//取出下一个节点
		 Node nextNode = currentNode.next;
		 //如果当前节点已经是最后一个节点  或者下一个节点为null
		 if(nextNode == null) {
			 break;
		 }
		 //赋值给当前节点
		 currentNode  = nextNode;
	}
	//把需要追加的节点追加为找到的当前节点的下一个节点
	currentNode.next = node;
	
	
	return this;
}


//获取下一个节点
	public Node next() {
		
		return this.next;
		}


//获取节点中的数据
public int getDate() {
	return this.data;
}

//自动追加节点

//   当前节点是否是最后一个节点
public boolean isLast() {
	return next == null;
}
	
//显示当前节点之后的所有节点信息
public void show() {
	Node currentNode = this;
	while(true) {
	System.out.print(currentNode.data+ " ");	
	currentNode = currentNode.next;
	if(currentNode == null) {
		break;
	}
	}
}

//在当前节点后面插入一个节点
public void after(Node node) {
	//取出下一个节点作为下下一个节点
	Node nextNext= this.next;
	//将插入的加点赋值为当前节点的下一个节点
	this.next = node;
	//将下下个节点赋值为要查入节点的下一个节点  形成连庄
	node.next = nextNext;
	
	
	
}

//   查看当前单链表的长度
public int LengthNode(){
	Node currentNode = this;
	int i = 0;
	while(true) {
		if(currentNode == null) {
			break;
		}
		currentNode = currentNode.next;
		i++;
	}
	
	return i;
}


}
