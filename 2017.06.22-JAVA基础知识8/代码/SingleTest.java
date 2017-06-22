/*
单例设计模式
*/
class SingleTest{
	public static void main(String[] args) {
		SingleInstence s = SingleInstence.getInstence();
		SingleInstence s1 = SingleInstence.getInstence();
		System.out.println(s);
		System.out.println(s1);
		
	}
}
class SingleInstence{
	
	//懒汉式
	//创建私有化构造函数
	private SingleInstence(){
		
	}
	//创建一个私有的，静态的对象
	private static SingleInstence instence;
	//创建一个公共的方法，返回对象，其中判断对象是否为空，若为空，则创建对象，否则直接返回
	public static SingleInstence getInstence(){
		if(instence == null){
			instence = new SingleInstence();
		}
		return instence;
	}
	
	
	/*//恶汉式
	//创建私有化构造函数
	private SingleInstence(){
		
	}
	//创建一个私有的，静态的，最终的对象
	private static final SingleInstence instence = new SingleInstence();
	//创建公共方法，返回对象
	public static SingleInstence getInstence(){
		return instence;
	}*/
}
