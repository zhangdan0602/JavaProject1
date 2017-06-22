/*
继承中子父类成员方法的关系：
	通过子类对象调用方法的查找顺序：
		首先在子类范围找
		如果没有找到，就在父类范围找
		最后还是没有找到，就报错
方法的重写：当不满意父类的方法体时，但是又需要使用父类的功能时；我们可以在子类中写一个一模一样的方法，但是方法体由子类自己定义
如果子类中有和父类中一模一样的方法时，最终调用的是子类自己的
重写的注意事项：
	子类重写的方法的访问权限不能比父类的低
	子类无法重写父类中的私有方法
	如果子类重写的方法在父类中是静态的，那么子类重写的时候也必须声明是静态的(没有重写的特性，多态中验证)
*/
class ExtendsDemo6{
	public static void main(String[] args){
		//new Son5().show();
	}
}
class Father5{
	private int age;
	public static void show(){
		System.out.println("哈哈");
	}
	private void test(){
		System.out.println("test");
	}
}
class Son5 extends Father5{
	//被覆盖的方法为static
	public static void show(){
		
	}
	/*正在尝试分配更低的访问权限; 以前为public
	private void show(){
		System.out.println("呵呵");
	}*/
	//子类无法继承父类的私有方法，所以这样写就相当于子类自己定义了一个方法
	private void test(){
		
	}
}