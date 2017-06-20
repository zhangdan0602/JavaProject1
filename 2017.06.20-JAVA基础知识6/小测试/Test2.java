/*
封装一个方法：
       可以接收一个参数：数字类型的数组
       返回结果：数组中的元素拼接起来的字符串
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			arr[i] = sc.nextInt();
		}
		System.out.println("---------------------------------");
		System.out.println("拼接结果如下：");
		showArray(arr);
		
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
