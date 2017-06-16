/*
键盘录入两个数据，返回两个数中的较大值
键盘录入两个数据，比较两个数是否相等
键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;
class MethodDemo{
	public static void main(String[] args) {
		int max=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个参数：");
		int a = sc.nextInt();
		System.out.print("请输入第二个参数：");
		int b = sc.nextInt();
		max = getMax(a,b);
		System.out.println("max="+max);
		isSame(a,b);
		
		System.out.print("请输入第三个参数：");
		int c = sc.nextInt();
		max = getMax(getMax(a,b),c);
		System.out.println("max="+max);
	}
	
	//键盘录入两个数据，返回两个数中的较大值
	public static int getMax(int x, int y){
		int max;
		if(x>y){
			max = x;
		}else{
			max = y;
		}
		return max;
	}
	
	//键盘录入两个数据，比较两个数是否相等
	public static void isSame(int a,int b){
		boolean flag = false;
		if(a==b){
			System.out.println("这两个数相同");
		}else{
			System.out.println("这两个数不相同");
		}
	}
	
	//键盘录入三个数据，返回三个数中的最大值
	public static int isMax(int a, int b, int c){
		int max = 0;
		max = (max=a>b?a:b)>c?max:c;
		return max;
	}
}
