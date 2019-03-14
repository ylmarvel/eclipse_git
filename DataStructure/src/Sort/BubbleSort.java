package Sort;



public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[]{4,9,3,56,814,64,854,23,56,45,654,74,54,86,16,47};
	
		bubbleSort(arr);
	
	
	
	}
	
	
	/*冒泡排序
	 * 思路 4,9,3,56,814,64,854,23,56,45
	 * 首先比较   4  9    选择出大的
	 * 然后将9 和3 比较    交换位置之后   将
	 * 9  和   56  比较  
	 *    
	 * */
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		//控制共比较多少轮
		for(int i=0;i<arr.length-1;i++) {
			//比较的次数
			for(int j = 0;j<arr.length-1-i;j++) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
