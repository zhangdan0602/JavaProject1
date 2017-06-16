//键盘录入两个int类型数据，并对这两个数据求和，输出其结果
import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum="+sum);
	}
}