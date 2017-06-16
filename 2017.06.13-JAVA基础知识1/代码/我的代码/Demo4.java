//强制类型转换练习
class Demo4{
	public static void main(String[] args){
		byte a1 = 3,a2 = 4,b;
		b = (byte)(a1 + a2);
		System.out.println(b);
		b = 3 + 4;
		System.out.println(b);
		double d = 12.345;
		float f = (float)d;//不兼容的类型: 从double转换到float可能会有损失
		System.out.println(f);
		float f1 = (float)12.345;//强制转换为float
		float f2 = 12.345f;//直接定义为float
		System.out.println(f2);
		double l = 12345.923;
		long d1 = (long)l;//会直接将小数部分舍弃
		System.out.println(d1);
		
		//byte by = 130;// 从int转换到byte可能会有损失
		//byte by = (byte)130;// -126
		/*
			补码：00000000 00000000 00000000 10000010
			截取：10000010
			反码：10000001
			原码：11111110   ->  -126
		*/
		int by = 130;// 130
		System.out.println(by);
		
		char ch = 'w';
		int in = ch; //119
		System.out.println(in);
		
		int in1 = 143; //119
		//char ch1 = in1;//从int转换到char可能会有损失
		char ch1 = (char)in1;//  ?  
		System.out.println(ch1);
		
		
	}
}