package AllSort;

import java.util.Scanner;

public class AllSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// char[] str = scanner.next().toCharArray();
		// perm(arr, 0, str.length);
		// perm(str, 0, str.length);
		// int[] arr = {1,2,3};
		System.out.println("请输入数字的个数:");
		int nextInt = scanner.nextInt();
		int[] arr = new int[nextInt];
		System.out.println("请输入具体的数字进行全排列");
		//对需要进行全排列的数字进行输入
		for (int i = 0; i < nextInt; i++) {
			arr[i] = scanner.nextInt();
		}
		perm(arr, 0, arr.length - 1);
	}
	

	/**
	 * @author 袁磊
	 * 对两个值进行交换
	 * @param arr   数组
	 * @param a 数组交换索引
	 * @param b  数组交换索引
	 * */
	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	/**
	 * @author 袁磊
	 * @param list   进行排序的数组
	 * @param k  起始位置
	 * @param 结束位置
	 * */
	public static void perm(int[] list, int k, int m) {
		if (k == m) {
			for (int i = 0; i <= m; i++)
				System.out.print(list[i]+" ");
			System.out.println();
		} else
			for (int i = k; i <= m; i++) {
				System.out.println(i);
				//对当前位置进行交换
				AllSort.swap(list, k, i);
				
				perm(list, k + 1, m);
				
				//索引+1后进行交换
				AllSort.swap(list, k, i);
				
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * // 进行交换 泛型方法进行交换 public static <T> void swap(T[] arr, int a, int b) { T tmp =
	 * arr[a]; arr[a] = arr[b]; arr[b] = tmp; }
	 * 
	 * public static <T> void perm(T[] list, int k, int m) { if (k == m) { for (int
	 * i = 0; i <= m; i++) System.out.print(list[i]); System.out.println(""); } else
	 * for (int i = k; i <= m; i++) {
	 * 
	 * AllSort.swap(list, k, i); perm(list, k + 1, m); AllSort.swap(list, k, i); } }
	 */

}
