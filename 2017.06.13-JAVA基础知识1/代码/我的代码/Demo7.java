class Demo7{
	public static void main(String[] args){
		char c = 'K';
		//c = c+1;//不兼容的类型: 从int转换到char可能会有损失
		c += 1;
		System.out.println("c="+c);
	}
}