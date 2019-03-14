package com.yl_Array;

import java.util.Arrays;

public class DeleteArray {
	public static void main(String[] args) {
		//删除数组中的元素
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		//设置要删除的元素下标
		int dest = 9;
		System.out.println(Arrays.toString(arr));
		//创建一个新数组  
		int[] arr2 = new int[arr.length-1];
		
		
		for(int i = 0; i<arr2.length;i++) {
			if(i<dest) {
				arr2[i]=arr[i];
				
			}
			else {
				arr2[i]=arr[i+1];
			}
		}
			arr=arr2;
			System.out.println(Arrays.toString(arr));
		}
	}


