package AllSort;


import java.util.Scanner;

public class BarSerch {

	public static void main(String[] args){
		
		
		
		System.out.println("请输入一个您需要进行排序的元素个数:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("生成的数组：");
		printarr(arr);
		System.out.println();
		System.out.println("进行快速排序后的数组：");
		printarr(quickSort(arr, 0, arr.length-1));
		System.out.println();
		System.out.println("输入一个您想进行二分查找的值：");
		int x = sc.nextInt();
		int[] blownarySearch = binarySearch(arr,x);
		bool(blownarySearch,x);
	}
	public static int[] binarySearch(int[] array,int value){
	    int low=0,top=array.length-1,middle;
	    //startEnd[0]表示开始位置，startEnd[1]表示结束位置
	    int[] startEnd=new int[2];
	    //当进行二分的前值大于后值是进行跳出循环
	    while(low<=top){
	        middle=(low+top)/2;
	        //对需要寻找的值进行判断
	        if(array[middle]==value){
	            startEnd[0]=middle;
	            startEnd[1]=middle;
	            //返回
	            return startEnd;
	            
	        }//处理小于中间值的数组
	        else if(value<array[middle]){  
	            if(middle-1<low){
	                startEnd[0]=middle-1;
	                startEnd[1]=middle;
	                return startEnd;
	            }else{
	            	top=middle-1;   
	            }	            
	        }	        
	        else{//处理大于中间值的数组
	            if(middle+1>top){
	                startEnd[0]=middle;
	                startEnd[1]=middle+1;
	                return startEnd;
	            }else{
	                low=middle+1;
	            }
	        }
	    }
	    return startEnd;
	}
	//输出数组
	public static void printarr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	//快速排序算法
	public static int[] quickSort(int[] arr,int start,int end) {
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
		return arr;
	
	}
	
	public static void bool(int[] boo,int x) {
		if(boo[0] == boo[1]) {
			System.out.println("您输入的"+x+"在随机生成的数组中，且下标为"+boo[0]);
			
		}
		else {
			System.out.println("您输入的"+x+"不在随机数组中,且比x小的最大索引为"+boo[0]+","+
					"比x大的最小索引为"+boo[1]);
		}
	}
}
