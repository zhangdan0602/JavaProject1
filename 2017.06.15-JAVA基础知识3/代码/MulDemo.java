/*
2.在控制台输出九九乘法表
*/
import java.util.Scanner;
class MulDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+(i*j)+"	");
			}
			System.out.println();
		}
		
	}
}
