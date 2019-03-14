package Sort;

import java.util.Arrays;

/*
 * 基数排序   思想
 *   通过设置0---9  的基数    对整数的每一位进行比较    
 * 
 * */
public class RadixSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void radixSort(int[] arr) {
		//存储数组中最大的数
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		//计算最大数字是几位数
		int maxLength = (max+"").length();
		//用于临时存储数据的数组
		int[][] temp = new int[10][arr.length];
		//用于记录在temp中相应数组存放的数字的数量
		int[] counts = new int[10];
		//根据局最大长度的数字来决定比较的次数
		for(int i = 0,n = 1;i<maxLength;i++,n*=10) {
			for(int j = 0;j<arr.length;j++) {
				int ys = arr[j]/n%10;
				//把当前遍历的数据放入指定的数组中
				temp[ys][counts[ys]] = arr[j];
				//记录数量
				counts[ys]++;
			}
			//记录取出元素需要放下的位置
			int index = 0;
			//把数字取出来
			for(int k = 0;k<counts.length;k++) {
				//记录数量的额数组中当前榆树记录的数量不为0
				if(counts[k] != 0) {
						//循环取出
					for(int l = 0;l<counts[k];l++) {
					//取出元素
						arr[index] = temp[k][l];
						index++;
					}
					//把数量置为0   
					counts[k] = 0;
					}
				
			}
		}
		
	}
}	
