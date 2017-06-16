//键盘录入数据，判断数据是奇数还是偶
import java.util.Scanner;
class IfDemo3{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.println("请输入要判断的数值：");
		int number = sc.nextInt();
		
		if(number%2==0){
			System.out.println("你输入的数是偶数");
		}else{
			System.out.println("你输入的数是奇数");
		}
	}
}