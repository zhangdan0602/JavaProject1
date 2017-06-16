//选择结构--if语句练习
import java.util.Scanner;
class Demo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//键盘录入x的值，计算出y的并输出
		/*
			x和y的关系满足如下：
			x>=3	y = 2x + 1;
			-1<=x<1	y = 2x;
			x<-1	y = 2x – 1;
		*/
		System.out.print("请输入x的值：");
		int x = sc.nextInt(),y=0;
		if(x >= 3){
			y = 2*x+1;
			System.out.println("y的值为："+y);
		}else if(x<1 && x>=-1){
			y = 2*x;
			System.out.println("y的值为："+y);
		}else{
			y = 2*x-1;
			System.out.println("y的值为："+y);
		}
		
	}
}