package com.yl_Array;

public class BinarySearch {
	//使用二分法进行数据的查找
	public static void main(String[] args) {
		int[] arr =new  int[]{1,2,3,4,5,6,7,8,9};
		int binarySearch = binarySearch(arr, 1);
		System.out.println(binarySearch);
	}
	//二分法试用于排列有序的数组  适用范围不广  传入一个数组和需要查找的值
	public static int  binarySearch(int[] arr,int target){
		//设置开始值
		int begin = 0;
		//设置数组的结尾值
		int end = arr.length-1;
		//设置数组的中间值
		int mid = (begin+end)/2;
		//设置数组的范围下标
		int index = -1;
		int n = 0;
		while(true) {
			if(begin >= end) {
				return -1;
			}
			
			//对中间值的判断  是不是要查找的元素
			if(arr[mid] == target) {
				return mid;
			}
			//对于中间值不是需要查找值的进行判断
			else {
				//如果要查找的元素的值在中间值的前面  将末尾值设置为中间值减一
				if(arr[mid] >target) {
					end = mid-1;
				}
				//如果要查找的元素的值在中间值的后面  将初始值设置为中间值加一
				else {
					begin = mid+1;
				}
				//取出新的中间的位置的元素
				mid = (begin+end)/2;
			}
		}
	
		
		
	}
}
