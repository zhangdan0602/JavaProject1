/*
1.请输出一个4行5列的星星(*)图案
*/
import java.util.Scanner;
class XingXing{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H=0,L;
		while(H<4){
			L=0;
			while(L<5){
				System.out.print("*");
				L++;
			}
			//System.out.println("*****");
			H++;
			System.out.println();
		}
		
	}
}
