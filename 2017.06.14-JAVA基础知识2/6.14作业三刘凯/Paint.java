/*
10.根据用户键盘录入的整数值，打印对应层级的数字金字塔图案
列入用户输入3那么打印图案如下所示：
	  1
	 222
	33333
*/
import java.util.Scanner;
class Paint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		int data=sc.nextInt();
		for(int i=1;i<=data;i++){
			for(int j=0;j<(2*data-1)/2+1-i;j++){
				System.out.print("  ");
					
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
