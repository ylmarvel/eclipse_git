package Sort;

import java.util.Arrays;

import com.yl.stack.MyQueue;

/*
 * 基数排序   思想
 *   通过设置0---9  的基数    对整数的每一位进行比较    
 * 
 * */
public class RadixQueueSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,2,64,854,23,56,45,654,74,54,86,16,47};
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
		//用于临时存储数据的队列
		MyQueue[] temp = new MyQueue[10];
		
		
		
		for(int i = 0;i<temp.length;i++) {
			temp[i] = new MyQueue();
		}
		
		
		//根据最大长度的数字来决定比较的次数
		for(int i = 0,n = 1;i<maxLength;i++,n*=10) {
			for(int j = 0;j<arr.length;j++) {
				//计算余数
				int ys = arr[j]/n%10;
				//把当前遍历的数据放入指定的队列中
				temp[ys].add(arr[j]);
				
			}
			
			//记录取出元素需要放下的位置
			int index = 0;
			//把数字取出来
			for(int k = 0;k<temp.length;k++) {
				while ( !temp[k].isEmpty() ) {
					arr[index] = temp[k].poll();
					index++;
				}
				
			}
		}
		
	}
}	
