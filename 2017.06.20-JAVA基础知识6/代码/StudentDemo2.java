/*
构造方法练习（两种赋值方式）
*/
class StudentDemo2{
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.play("王者荣耀");
		s.study("Python");
		//s.name = "刘凯";
		//s.age = 21;
		//s.sno = 1414010349;
		//s.setName("刘凯");
		//s.setAge(21);
		//s.setSno(1414010349);
		Student s1 = new Student("Jack",20,1414010349);
		s1.show();
		s1.play("王者荣耀");
		s1.study("Python");
	}
}

class Student{
	//让属性只能通过
	private String name = "Tom";
	private int age = 21;
	private int sno = 123465;
	
	//创建构造方法
	public Student(){}
	public Student(String name,int age,int sno){
		this.name = name;
		this.age = age;
		this.sno = sno;
	}
	
	public void show(){
		System.out.println("age="+age+",name="+name+",sno="+sno);
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
	
	public void setSno(int sno){
		this.sno = sno;
	}
	public int getSno(){
		return sno;
	}
	
	public void play(String gname){
		System.out.println(name+"玩"+gname);
	}
	
	public void study(String cname){
		System.out.println(name+"看"+cname);
	}
}
