/*
键盘录入x的值，计算出y的并输出
x和y的关系满足如下：
	x>=3	y = 2x + 1;
	-1<=x<1	y = 2x;
	x<-1	y = 2x – 1;
*/
import java.util.Scanner;
class IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入X的值：");
		int x = sc.nextInt();
		int y = 0;
		if(x>=3){
			y = 2*x+1;
		}else if(x>=-1 && x<1){
			y = 2*x;
		}else if(x<-1){
			y = 2*x-1;
		}
		System.out.println(y);//可能尚未初始化变量y
	}
}