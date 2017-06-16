//根据用户键盘录入的整数值，求出对应的阶乘。列入5的阶乘就是5*4*3*2*1
import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number = sc.nextInt();
		//定义一个变量保存阶乘
		int result = 1;
		for(int i=1; i<=number; i++){
			result *= i;
		}
		System.out.println("result="+result);
	}
}