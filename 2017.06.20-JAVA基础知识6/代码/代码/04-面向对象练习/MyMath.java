// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MyMathTest.java


class MyMath
{

	private MyMath()
	{
	}

	public static MyMath getInstance()
	{
		return new MyMath();
	}

	public int add(int i, int j)
	{
		return i + j;
	}

	public int sub(int i, int j)
	{
		return i - j;
	}

	public int mul(int i, int j)
	{
		return i * j;
	}

	public int div(int i, int j)
	{
		return i / j;
	}
}
