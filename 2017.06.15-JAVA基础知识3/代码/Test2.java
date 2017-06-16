/*
键盘录入行数和列数，输出对应的星形
键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args) {
		System.out.print("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		star(a);
		System.out.println("-----------------------------");
		mul(a);
		
	}
	
	public static void star(int a){
		for(int i=0;i<a;i++){
			System.out.println("*****");
		}
	}
	
	public static void mul(int a){
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+(j*i)+"	");
			}
			System.out.println();
		}
	}
}
