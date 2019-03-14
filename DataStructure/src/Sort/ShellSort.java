package Sort;

import java.util.Arrays;
/**
 * 希尔排序思想：      将待排序的元素进行分组    将无序的数组排序为大致有序
 * 
 * */
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void shellSort(int[] arr) {
		//   遍历所有的步长
		for(int d = arr.length/2;d>0;d/=2) {
			//遍历所有的元素
			for(int i = d;i<arr.length;i++) {
				//遍历本组中的元素
				for(int j = i-d;j>=0; j-=d) {
					if(arr[j] > arr[j+d]) {
					int temp = arr[j];
					arr[j]=arr[j+d];
					arr[j+d] = temp;
					}
				}
			}
		}
	}
}
