/*
11.输出1-1000之内的质数，质数是大于1的自然数，质数是除了1和它自身不能被其它数整除的数。比如3就是一个质数，
因为它只能被1和3整除，又比如4不是一个质数，因为它可以同时被1,2,4整除
*/
import java.util.Scanner;
class Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,i;
		for(int a=2;a<=1000;a++){
			for(i=2,t=0;i<a;i++){
				if(a%i==0){
					t=1;
					break;
				}
			}
			if(t==0){
				System.out.println(a);
			}
		}
		
	}
}
