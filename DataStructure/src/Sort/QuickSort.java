package Sort;

import java.util.Arrays;

public class QuickSort {
/*
 * 思想它的基本思想是：
 * 通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * */
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr,int start,int end) {
		if(start<end) {
			//将数组中的第0个 数字作为标准数
			int stard = arr[start];
			//记录排序下标
			int low = start;
			int high = end;
			//循环比较出比标准数小的数   和  比标准数大的数
			while(low<high) {
				//右边的数比标准数大
				while (low<high && stard<=arr[high]) {
					high--;
					
				}
				//使用右边的数字替换左边的数
				arr[low] = arr[high];
				while(low<high && arr[low]<=stard) {
					low++;
				}
				arr[high] = arr[low];
			//把标准数赋给底所在的位置元素
				arr[low]=stard;
				
				//处理所有小的数字
				quickSort(arr, start, low);
				//处理所有大的数字
				quickSort(arr, low+1, end);
				
			}
	
		}
		
	
		
	}
}
