package com.yl.node;

import java.util.Scanner;

public class Hanoi {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		System.out.println("请输入一个盘子的数量:");
		hanoi(nextInt, 'A', 'B', 'C');
	}
	
	/**
	 * @author 袁磊
	 * @param 共有N个盘子
	 * @param from 开始的柱子
	 * @param in 中间的柱子
	 * @param to 目标柱子
	 * 
	 * */
	public static void hanoi(int n,char from,char in,char to) {
		if(n == 1) {
			System.out.println("第1个盘子从"+from+"移到"+to);
		}
		
		else {
			//移动上面所有的盘子到中间位置
			hanoi(n-1, from, to, in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
		//将上面所有的盘子从中间位置移动到目标位置
			hanoi(n-1, in, from, to);
		}
	}
}
