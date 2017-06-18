/*
编写一个程序，读入数目确定的考试分数，并且判断有多少个分数高于或等于平均分，有多少个分数低于平均分。输入一个负数标志输入结束，假设最高分为100
*/
import java.util.Scanner;
class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum=0,count=0,number1=0,number2=0;
		float avg = 0.0f;
		int[] arr = new int[1];
		while(true){
			System.out.print("请输入考试分数：");
			int n = sc.nextInt();
			if(n<0){
				break;
			}
			if(count==0){//将第一个值直接赋值
				arr[0] = n;
			}else{//将其他分数放入数组
				int[] temp_arr = make(arr,n);
				arr = null;//清空初始数组
				arr = temp_arr;
				temp_arr = null;//清空临时数组
			}
			
			
			count++;
			sum+=n;
			System.out.println("sum="+sum);
			
			
			avg = 1.0f*sum/count;
			System.out.println("avg="+avg);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=avg){
				number1++;
			}else{
				number2++;
			}
		}
		System.out.println("高于或等于平均分:"+number1);
		System.out.println("低于平均分:"+number2);
	
		
	}
	//将数组内容加一
	public static int[] make(int[] arr2, int n){
		int[] arr1 = new int[arr2.length+1];
		for(int i=0;i<arr2.length;i++){
			arr1[i] = arr2[i];
		}
		arr1[arr1.length-1] = n;
		return arr1;
	}
	
}