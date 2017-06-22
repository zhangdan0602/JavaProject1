/*
子类与父类方法名相同，可通过super.方法名()来访问父类
*/
class ExtendsTest2{
	public static void main(String[] args) {
		
		Sun s = new Sun();
		s.test();
		
	}
}

class Father{
	private String name;
	private int age;
	
	public Father(int age){
		System.out.println("父类构造方法被调用了");
	}
	
	public void show(){
		System.out.println("父类show()被调用");
	}
}
class Sun extends Father{
	public void show(){
		System.out.println("子类show()被调用了");
	}
	
	public Sun(){
		System.out.println("子类构造方法被调用了");
	}
	
	public void test(){
		//super.show();
		show();
	}
}