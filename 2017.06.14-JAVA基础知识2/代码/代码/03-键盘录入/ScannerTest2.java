//键盘录入三个float类型数据，获取这三个 数据中的最大值，输出其结果
import java.util.Scanner;
class ScannerTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数值：");
		float f = sc.nextFloat();
		System.out.println("请输入第二个数值：");
		float f2 = sc.nextFloat();
		System.out.println("请输入第三个数值：");
		float f3 = sc.nextFloat();
		
		float max = (max=f>f2?f:f2)>f3?max:f3;
		
		System.out.println("max="+max);
	}
}