/*
¼Ì³ÐÁ·Ï°
*/
class ExtendsTest{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		System.out.println("name="+d.getName()+",age="+d.getAge());
		d.voice();
		System.out.println("----------------------------------");
		Cat c = new Cat();
		c.eat();
		c.sleep();
		System.out.println("name="+c.getName()+",age="+c.getAge());
		c.voice();
	}
}
class Animal{
	private String name;
	private int age;
	
	public void voice(){
		System.out.println("¶¯Îï»á½Ð");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("¹·³Ô¹ÇÍ·");
	}
	public void sleep(){
		System.out.println("¹·Ë¯¾õ");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("Ã¨³ÔÐ¡Óã");
	}
	public void sleep(){
		System.out.println("Ã¨Ë¯¾õ");
	}
}
