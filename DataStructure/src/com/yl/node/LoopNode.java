package com.yl.node;

//节点
public class LoopNode {
	//创建出节点内容  进行下一个节点的数据内容进行复制    形成节点链
	//节点内容
	int data;
	//下一个节点
	LoopNode next = this;
	//创建节点
	
	public LoopNode(int data) {
	this.data  = data;
	
	}
	/*删除下一个节点  
	 * 通过将当前节点的下下个节点赋值给当前节点的下一个节点
	 * 实现将当前节点的下一个节点进行删除
	*/
	public void deleteNext() {
		
	LoopNode newnext=next.next;
	this.next = newnext;
	}
	public void shu() {
		System.out.println(this.next);
	}
	
	
	
//单次为节点追加节点
public void append(LoopNode LoopNode) {
	this.next = LoopNode;
}


//获取下一个节点
	public LoopNode next() {
		
		return this.next;
		}


//获取节点中的数据
public int getDate() {
	return this.data;
}

	
//显示当前节点之后的所有节点信息
public void show() {
	LoopNode currentLoopNode = this;
	while(true) {
	System.out.print(currentLoopNode.data+ " ");	
	currentLoopNode = currentLoopNode.next;
	if(currentLoopNode == null) {
		break;
	}
	}
}

//在当前节点后面插入一个节点
public void after(LoopNode LoopNode) {
	//取出下一个节点作为下下一个节点
	System.out.println(this);
	LoopNode nextNext= this.next;
	System.out.println(nextNext);
	//将插入的加点赋值为当前节点的下一个节点
	this.next = LoopNode;
	System.out.println(LoopNode);
	System.out.println("this.next"+this.next);
	//将下下个节点赋值为要查入节点的下一个节点  形成连庄
	LoopNode.next = nextNext;
	System.out.println(nextNext);
	
	
	
}


}
