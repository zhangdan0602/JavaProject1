//if语句练习
import java.util.Scanner;
class Demo4{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//键盘录入数据，判断两个数据是否相同，并输出结果
		System.out.print("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.print("请输入第二个数据：");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("这两个数是相等的");
		}else{
			System.out.println("这两个数是不相等的");
		}
		
		//键盘录入数据，输出两个数中较大的值，并输出结果
		System.out.print("请输入第一个数据：");
		int a1 = sc.nextInt();
		System.out.print("请输入第二个数据：");
		int b1 = sc.nextInt();
		if(a1>b1){
			System.out.println("最大值为"+a1);
		}else{
			System.out.println("最大值为"+b1);
		}
		
		//键盘录入数据，判断数据是奇数还是偶数
		System.out.print("请输入测试数据：");
		int a3 = sc.nextInt();
		if(a3%2 == 0){
			System.out.println("这个数是偶数");
		}else{
			System.out.println("这个数是奇数");
		}
	}
}