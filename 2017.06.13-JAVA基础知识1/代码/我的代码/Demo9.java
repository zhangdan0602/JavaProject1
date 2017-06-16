class Demo9{
	public static void main(String[] args){
		int x = 10;
		int y = 10;
		boolean flag1 = (x == y);
		//boolean flag2 = (x = y);//不兼容的类型: int无法转换为boolean
		System.out.println(flag1);
		//System.out.println(flag2);
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (b1 == b2);
		boolean b4 = (b2 = b1);
		System.out.println(b3);
		System.out.println(b4);
	}
}