/*
封装练习：创建一个学生类，将属性用private修饰，并写入get和set方法
*/
class StudentDemo{
	public static void main(String[] args) {
		Student s = new Student();
		//s.name = "刘凯";
		//s.age = 21;
		//s.sno = 1414010349;
		s.setName("刘凯");
		s.setAge(21);
		s.setSno(1414010349);
		System.out.println("age="+s.getAge()+",name="+s.getName()+",sno="+s.getSno());
		s.play("王者荣耀");
		s.study("Python");
	}
}

class Student{
	//让属性只能通过
	private String name;
	private int age;
	private int sno;
	
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
