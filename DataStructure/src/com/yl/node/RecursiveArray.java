package com.yl.node;

public class RecursiveArray {

	public static void main(String[] args) {
	
		System.out.println(Febonacci(7));
	}
	
	public static int Febonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {	
		return Febonacci(n-1)+Febonacci(n-2);
		}
	}
	
}
