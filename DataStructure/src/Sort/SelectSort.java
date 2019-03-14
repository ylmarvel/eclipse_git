package Sort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectSort(int[] arr) {
		//遍历所有的数
		for(int i = 0;i<arr.length;i++) {
			//记录数组中最小数的下标
			int minIndex = i;
			//把当前遍历的数和后面的数依次进行比较
			for(int j = i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int temp = arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
