class Demo5{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		int c = 10;

		a = b++;
		c = --a;
		b = ++a;
		a = c--;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int a1 = 4;
		int b1 = (a1++)+(++a1)+(a1*10);
		System.out.println("b1="+b1);
	}
}