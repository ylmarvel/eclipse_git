package com.yl_Array;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		
		int[] arr = new int[] {9,8,7};
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[arr.length+1];
		for(int i = 0;i<arr.length;i++) {
			arr2[i]=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));
	}
}
