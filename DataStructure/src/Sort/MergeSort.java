package Sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		merge(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void merge(int[] arr,int low,int high) {
		int middle = (high+low)/2;
		if(low<high) {
		
		//处理左边的
		merge(arr, low, middle);
		//处理右边的
		merge(arr, middle+1, high);
		//归并
		merge(arr, low,middle, high);
		}
		
	}
	public static void merge(int[] arr,int low,int middle,int high) {
		//建立归并排序的临时数组
		int[] temp = new int[high-low+1];
		//记录第一个数组中需要遍历的下标
		int i = low;
		//记录第二个数组中需要遍历的下标
		int j = middle+1;
		//记录在临时数组中存放的下标
		int index = 0;
		//遍历两个数组  将小的数放入临时数组中
		while(i<=middle && j<=high) {
			//第一个数组中数据更小
			if (arr[i] <= arr[j]) {
				temp[index]=arr[i];
				i++;
			}
			else {
				temp[index]=arr[j];
				j++;
			}
			index++;
		}
		//处理多余的数据
		while (j<=high) {
			temp[index] = arr[j];
			j++;
			index++;
		}
		while(i<=middle) {
			temp[index] = arr[i];
			i++;
			index++;
		}
		
		//将临时数组中的数据重新存入到原数组中
		for(int k = 0;k<temp.length;k++) {
			arr[k+low] = temp[k];
		}
	}
	
}
