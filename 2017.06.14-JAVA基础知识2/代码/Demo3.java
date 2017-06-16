//导包
import java.util.Scanner;
class Demo3{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		//键盘录入两个int类型数据，并对这两个数据求和，输出其结果
		System.out.println("键盘录入两个int类型数据，并对这两个数据求和，输出其结果");
		int a,b;
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("b=");
		b = sc.nextInt();
		System.out.println("sum="+(a+b));
		
		//键盘录入两个long类型数据，获取这两个数据中的最大值，输出其结果
		System.out.println("键盘录入两个long类型数据，获取这两个数据中的最大值，输出其结果");
		long c,d,max;
		System.out.print("c=");
		c = sc.nextLong();
		System.out.print("d=");
		d = sc.nextLong();
		max = (c>d)?c:d;
		System.out.println("max="+max);
		
		//键盘录入三个float类型数据，获取这三个 数据中的最大值，输出其结果
		System.out.println("键盘录入三个float类型数据，获取这三个 数据中的最大值，输出其结果");
		float maxf,f1,f2,f3;
		System.out.print("f1=");
		f1 = sc.nextFloat();
		System.out.print("f2=");
		f2 = sc.nextFloat();
		System.out.print("f3=");
		f3 = sc.nextFloat();
		maxf = (((f1>f2)?f1:f2)>f3)?((f1>f2)?f1:f2):f3;
		System.out.println("maxf="+maxf);

		//键盘录入两个byte类型数据，比较这两个数据是否相等，输出其结果
		System.out.println("键盘录入两个byte类型数据，比较这两个数据是否相等，输出其结果");
		byte b1,b2;
		System.out.print("b1=");
		b1 = sc.nextByte();
		System.out.print("b2=");
		b2 = sc.nextByte();
		System.out.println(b1==b2);
	}
}