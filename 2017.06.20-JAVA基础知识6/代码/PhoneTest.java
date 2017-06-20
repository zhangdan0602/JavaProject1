/*
标准的手机类(练习)
Person s = new Person ();在内存中做了哪些事情?
加载Person .class文件进内存
在栈内存为s开辟空间
在堆内存为人类对象开辟空间
对人类对象的成员变量进行默认初始化
对人类对象的成员变量进行显示初始化
通过构造方法对人类对象的成员变量赋值
人类对象初始化完毕，把对象地址赋值给s变量

*/
class PhoneTest{
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setName("三星");
		p.setPrice(4999.9f);
		p.show();
		Phone p1 = new Phone("苹果",6999.9f);
		p1.show();
		
	}
}

//创建一个手机类
class Phone{
	//创建私有化属性
	private String name;
	private float price;
	
	//构造方法
	public Phone(){}
	public Phone(String name,float price){
		this.name = name;
		this.price = price;
	}
	
	//get和set方法
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	
	//显示输出
	public void show(){
		System.out.println("name="+name+",price="+price);
	}
}
