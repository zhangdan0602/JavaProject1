/*
打印杨辉三角形(行数可以键盘录入)
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
*/
import java.util.Scanner;
class ArrayTest2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入行数：");
		int number = sc.nextInt();
		int[][] arr = new int[number][];
		arr[0][] = {1};
		arr[1][] = {1,1};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				
				if(arr.length>=3){
					System.out.print(arr[i-1][j]+arr[i-1][j-1]+" ");
				}
			}
			System.out.println();
		}
		
	}
	//打印杨辉三角形(行数可以键盘录入)
	/*public static void trigle(int[][] arr){
		arr[0][] = {1};
		arr[1][] = {1,1};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				
				if(arr.length>=3){
					System.out.print(arr[i-1][j]+arr[i-1][j-1]+" ");
				}
			}
			System.out.println();
		}
	}*/
}
