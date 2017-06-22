/*

*/
class Test3{
	public static void main(String[] args) {
		
		B b = new B();
		A a = new A();
	}
}
class A{
	{
		System.out.println("父类构造代码块");
	}
	static{
		System.out.println("父类静态代码块");
	}
	public A(){
		System.out.println("父类构造方法");
	}
}

class B{
	{
		System.out.println("b子类构造代码块");
	}
	static{
		System.out.println("b子类静态代码块");
	}
	public B(){
		System.out.println("b子类构造方法");
	}
}

