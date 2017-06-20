// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StudentDemo2.java

import java.io.PrintStream;

class Student
{

	private String name;
	private int age;
	private int sno;

	public Student()
	{
		name = "Tom";
		age = 21;
		sno = 0x1e249;
	}

	public Student(String s, int i, int j)
	{
		name = "Tom";
		age = 21;
		sno = 0x1e249;
		name = s;
		age = i;
		sno = j;
	}

	public void show()
	{
		System.out.println((new StringBuilder()).append("age=").append(age).append(",name=").append(name).append(",sno=").append(sno).toString());
	}

	public void setName(String s)
	{
		name = s;
	}

	public String getName()
	{
		return name;
	}

	public void setAge(int i)
	{
		age = i;
	}

	public int getAge()
	{
		return age;
	}

	public void setSno(int i)
	{
		sno = i;
	}

	public int getSno()
	{
		return sno;
	}

	public void play(String s)
	{
		System.out.println((new StringBuilder()).append(name).append("Íæ").append(s).toString());
	}

	public void study(String s)
	{
		System.out.println((new StringBuilder()).append(name).append("¿´").append(s).toString());
	}
}
