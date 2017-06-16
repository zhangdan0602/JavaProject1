/*
用switch语句实现键盘录入月份，输出对应的季节
3～5月为春季
6～8月为夏季
9～11月为秋季
12月～2月为冬季
*/
import java.util.Scanner;
class Demo8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入你的月份：");
		int month = sc.nextInt();
		switch (month){
			case 12:
			case 1:
			case 2:System.out.println("冬季");break;
			case 3:
			case 4:
			case 5:System.out.println("春季");break;
			case 6:
			case 7:
			case 8:System.out.println("夏季");break;
			case 9:
			case 10:
			case 11:System.out.println("秋季");break;
			default:System.out.println("你的输入有误");
		}
		
	}
}