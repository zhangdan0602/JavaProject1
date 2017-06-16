/*
小娟的妈妈每天给她3元钱，她都会存起来，但是，每当这一天的天数是存钱的第6天或者6的倍数的话，她都会花去5元钱，请问，经过多少天，小娟才可以存到100元钱
天数
天数是存钱的第6天或者6的倍数的话，她都会花去5元钱
每一天存3元钱
*/
class BreakTest{
	public static void main(String[] args){
		int day = 0;
		int money = 0;
		//死循环一直求钱的总额
		while(true){
			day++;
			money += 3;
			//判断天数
			if(day % 6==0){
				money -= 5;
			}
			//判断钱是否大于等于100
			if(money >= 100){
				break;
			}
		}
		
		System.out.println("小娟经过"+day+"天，一共攒了"+money+"元钱");
	}
}