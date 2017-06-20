// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo.java

import java.io.PrintStream;

class Person
{

	private String name;
	private int age;
	private char sex;
	private String password;

	Person()
	{
	}

	public void setName(String s)
	{
		name = s;
	}

	public String getName()
	{
		return name;
	}

	public void setSex(char c)
	{
		sex = c;
	}

	public char getSex()
	{
		return sex;
	}

	public void setAge(int i)
	{
		if (i < 1 || i > 260)
		{
			System.out.println("你设置的年龄不符合现实");
			return;
		} else
		{
			age = i;
			return;
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setPassword(String s)
	{
		password = s;
	}

	public String getPassword()
	{
		return password;
	}
}
