/*
9.根据用户键盘录入的整数值，求出对应的阶乘。例如5的阶乘就是5*4*3*2*1
*/
import java.util.Scanner;
class JianCheng{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数值：");
		int num = sc.nextInt();
		
		long result=1;
		for(int i=1;i<=num;i++){
			result *=i; 
		}
		System.out.println("result="+result);
	}
}
