/*
创建学生类
*/
class StudentDemo{
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "刘凯";
		s.age = 21;
		s.sno = 1414010349;
		System.out.println("age="+s.age+",name="+s.name+",sno="+s.sno);
		s.play("王者荣耀");
		s.study("Python");
		System.out.println("--------------------------");
		s.name = "吴丕华";
		s.age = 21;
		s.sno = 1414010545;
		System.out.println("age="+s.age+",name="+s.name+",sno="+s.sno);
		s.play("王者荣耀");
		s.study("Python");
	}
}

class Student{
	public String name;
	public int age;
	public int sno;
	
	public void play(String gname){
		System.out.println(name+"玩"+gname);
	}
	
	public void study(String cname){
		System.out.println(name+"看"+cname);
	}
}
