/*
教室高度：48m，我现在有一张足够大的纸张，厚度为：0.12m。请问，我折叠多少次，就可以保证厚度不低于教室的高度?
*/
import java.util.Scanner;
class WhileDemo2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double n = 0.12;
		while(n<48){
			n=n*2;
			count++;
		}
		System.out.println("count="+count);
		
	}
}
