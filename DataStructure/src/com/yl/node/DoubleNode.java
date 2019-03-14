package com.yl.node;

//双向循环链表

public class DoubleNode {
	//上一个节点
	DoubleNode pre = this;
	//下一个节点
	DoubleNode next = this;
	//节点内容
	int data;
	//创建创想循环列表的节点
	public DoubleNode(int data) {
		this.data = data;
	}
	public void shu() {
	System.out.println(pre);
	System.out.println(next);
	}
	
	//增加节点
	public void after(DoubleNode node) {
	
		//原来的下一个节点
		DoubleNode nextNext = next;
		
		//把新节点作为当前节点的下一个节点
		this.next = node;
		
		//将当前节点作为新节点的前一个节点
		node.pre = this;
		//原来的下一个节点作为新节点的下一个节点
		node.next =nextNext;
		//原来的下一个节点的上一个节点为新节点
		nextNext.pre = node;
	}
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	//上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	//获取数据
	public int getDate() {
		return this.data;
	}
	
}
