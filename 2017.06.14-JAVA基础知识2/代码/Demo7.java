/*
键盘录入三个数据，然后获取最大值
*/
import java.util.Scanner;
class Demo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.print("请输入第二个数据：");
		int b = sc.nextInt();
		System.out.print("请输入第三个数据：");
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("最大值为："+a);
		}else if(a<b && c<b){
			System.out.println("最大值为："+b);
		}else{
			System.out.println("最大值为："+c);
		}
	}
}