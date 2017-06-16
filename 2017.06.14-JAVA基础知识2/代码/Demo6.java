/*
键盘录入月份的值，输出对应的季节。
3～5月为春季
6～8月为夏季
9～11月为秋季
12月～2月为冬季
*/
import java.util.Scanner;
class Demo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int x = sc.nextInt();
		if(x>12 || x<1){
			System.out.println("输入的数据有误");
		}else if(x >= 3 && x<=5){
			System.out.println("春季");
		}else if(x >= 6 && x<=8){
			System.out.println("夏季");
		}else if(x >= 9 && x<=11){
			System.out.println("秋季");
		}else{
			System.out.println("冬季");
		}
	}
}