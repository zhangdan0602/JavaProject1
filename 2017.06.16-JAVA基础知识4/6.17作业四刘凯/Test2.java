/*
编写一个程序，使它能够读入10个整数，并且存储其中互不相同的数，最后将这10个数输出
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		//定义一个不会有重复数据的数组下标
		int length=arr.length;
		//循环向数组写入10个整数
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"个整数：");
			arr[i] = sc.nextInt();
			if(i>0){
				if(arr(arr,i,arr[i])){//若发现有重复数据，则length-1
					length--;
				}
			}
		}
		System.out.println(arr.length);
		showArray(arr);
		//定义一个新数组
		int[] arr2 = new int[length];
		//给新数组第一个值赋值
		arr2[0] = arr[0];
		int first = 1;
		for(int i=1;i<arr.length;i++){
			if(!arr(arr2,first,arr[i])){//若有不同数据，则将该数据放入新数组
				arr2[first] = arr[i] ;
				first++;
			}
		}
		showArray(arr2);
		showArray(arr);
		
	}
	//判断输入的数值与前面输入的是否相同，若相同则返回true,不同则返回false
	public static boolean arr(int[] arr,int m,int n){
		for(int i=0;i<m;i++){
			if(n==arr[i]){
				
				return true;
			}
		}
		return false;
	}
	
	//遍历数组，并将数组进行输出
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			//判断是不是一个元素的情况
			if(arr.length==1){
				System.out.println(arr[j]);
			}else if(j==0){//判断是不是第一个元素
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){//判断是不是最后一个元素
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
}