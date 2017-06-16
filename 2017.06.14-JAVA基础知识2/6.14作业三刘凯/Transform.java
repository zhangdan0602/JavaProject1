/*
1.如何实现对两个整数变量的值进行互换（要求不使用第三个变量）
*/
import java.util.Scanner;
class Transform{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=10,b=12;
		//方法一
		/*int a=10,b=12; //a=1010^b=1100;
		a=a^b; //a=0110^b=1100;
		b=a^b; //a=0110^b=1010;
		a=a^b; //a=1100=12;b=1010;*/
		
		//方法二
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		//方法三
		a=b-a; //a=2;b=12
		b=b-a; //a=2;b=10
		a=b+a; //a=10;b=10
		
		System.out.println("a="+a+",b="+b);
	}
}
