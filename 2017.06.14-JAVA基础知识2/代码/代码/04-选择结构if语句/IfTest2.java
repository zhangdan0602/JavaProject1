/*
键盘录入月份的值，输出对应的季节
	3～5月为春季
	6～8月为夏季
	9～11月为秋季
	12月～2月为冬季
*/
import java.util.Scanner;
class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		
		//一般情况下是先校验数据
		if(month<1 || month>12){
			System.out.println("你输入的月份不存在");
		}else if(month>=3 && month<=5){
			System.out.println("春季");
		}else if(month>=6 && month<=8){
			System.out.println("夏季");
		}else if(month>=9 && month<=11){
			System.out.println("秋季");
		}else{
			System.out.println("冬季");
		}
		
		/*
		if(month>=3 && month<=5){
			System.out.println("春季");
		}else if(month>=6 && month<=8){
			System.out.println("夏季");
		}else if(month>=9 && month<=11){
			System.out.println("秋季");
		}else if(month==12 || month==1 || month==2){
			System.out.println("冬季");
		}else{
			System.out.println("你输入的月份不存在");
		}*/
	}
}