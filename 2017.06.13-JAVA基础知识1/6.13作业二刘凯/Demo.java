class Demo{
	public static void main(String[] args){
		byte result = (byte)313;// 不兼容的类型: 从int转换到byte可能会有损失
		System.out.println("result="+result);
	}
}