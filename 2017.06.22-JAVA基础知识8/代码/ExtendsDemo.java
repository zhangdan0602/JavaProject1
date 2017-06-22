/*
静态代码块-->构造代码块-->构造方法-->普通代码块
静态代码块只加载一次
普通代码块只有在调用方法时才调用
*/
class ExtendsDemo{
	public static void main(String[] args) {
		new Test().show();
		new Test();
		
	}
}
class Test{
	{
		System.out.println("这是构造代码块");
	}
	static{
		System.out.println("这是静态代码块");
	}
	public Test(){
		System.out.println("这是构造方法");
	}
	public void show(){
		System.out.println("show方法");
		{
			System.out.println("这是普通代码块");
		}
	}
}