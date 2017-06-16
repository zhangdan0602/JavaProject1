/*

*/
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1,y = 1;

		if(x++==2 & ++y==2)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		
	}
}
