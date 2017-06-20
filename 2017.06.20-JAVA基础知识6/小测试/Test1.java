/*
给定一个数组，比如[10,20,40,30,5]
写代码实现将这个数组变成：[5,30,40,20,10]
*/
import java.util.Scanner;
class Test1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			arr[i] = sc.nextInt();
		}
		System.out.println("---------------------------------");
		System.out.println("转变前");
		showArray(arr);
		System.out.print("");
		int[] arr1 = Trans(arr);
		System.out.println("---------------------------------");
		System.out.println("转变后");
		showArray(arr1);
	}
	
	//
	public static int[] Trans(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[i] = arr[arr.length-1-i];
		}
		return arr1;
	}
	
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			if(arr.length==1){
				System.out.println("["+arr[j]+"]");
			}else if(j==0){
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
}
