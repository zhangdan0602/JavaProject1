/*
用do...while语句实现1-1000的奇数与偶数个数
*/
import java.util.Scanner;
class DoWhileDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int doublenum = 0;
		int simplenum = 0;
		int i=1;
		do{
			if(i%2==0){
				doublenum++;
			}else{
				simplenum++;
			}
			i++;
		}while(i<=1001
		);
		System.out.println("奇数个数为："+doublenum+"，偶数个数为："+simplenum);
		
	}
}
