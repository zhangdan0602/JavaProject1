// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test2.java


class Rectangle
{

	private int width;
	private int length;

	public Rectangle()
	{
	}

	public Rectangle(int i, int j)
	{
		width = i;
		length = j;
	}

	public int perimeter(int i, int j)
	{
		return (i + j) * 2;
	}

	public int area(int i, int j)
	{
		return i * j;
	}
}
