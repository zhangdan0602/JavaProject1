/*

*/
import java.util.Scanner;
class Test4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1,y = 1;

		if(x++==1 || ++y==1)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		
	}
}
