/*
小娟的妈妈每天给她3元钱，她都会存起来，但是，每当这一天的天数是存钱的第6天或者6的倍数的话，
她都会花去5元钱，请问，经过多少天，小娟才可以存到100元钱
*/
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int day = 0;
		while(money<100){
			
			day++;
			money = money + 3;
			if(day%6==0){
				money = money - 5;
			}
			System.out.println(day+"天，存了"+money+"元");
		}
		System.out.println("经过"+day+"天，存了"+money+"元");
		System.out.println("经过"+day+"天，可以存到100元");
	}
}
