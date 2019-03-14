package Sort;

import java.util.Arrays;



public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
		System.out.println(Arrays.toString(arr));
		insertSort_method1(arr);
		System.out.println(Arrays.toString(arr));
		insertSort_method2(arr);
		
	}
	
	
	public static void insertSort_method1(int[] arr) {
		//遍历所有的数字
		for(int i = 1;i<arr.length;i++){
			//如果当前数字比前面一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历的数字存起来
				int temp = arr[i];
				int j;
				//遍历当前数字前面所有的数字
				
				for(j = i-1;j>=0 && temp <arr[j] ;j--) {
					//把前一个数字复制给后一个数字
					arr[j+1] = arr[j];
				}
				//把临时变量赋值给不满住条件的后一个元素
				arr[j+1] = temp;
			}
		}
	}
	
	public static void insertSort_method2(int[] arr) {
		//定义交换时所用到的第三变量
				int temp = 0;
				for(int i = 0;i<arr.length;i++){
					for(int j = i;j>0 && arr[j] <arr[j-1];j--){
						//交换
						 temp = arr[j];
			             arr[j] = arr[j-1];
			             arr[j-1] = temp;
					}
				}
				//输出排序后的数组
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
		
		
		
	}
	public static void insertSortMethod3(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = i;j>0 && arr[j]<arr[j-1];j--) {
				 temp = arr[j];
	             arr[j] = arr[j-1];
	             arr[j-1] = temp;
			}
			
		}
	}
	
	
}
