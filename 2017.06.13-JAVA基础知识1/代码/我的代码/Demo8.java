class Demo8{
	public static void main(String[] args){
		boolean result;
		int a = 10,b = 100;
		result = a == b;
		System.out.println("result="+result);
		
		result = a != b;
		System.out.println("result="+result);
		
		result = a <= b;
		System.out.println("result="+result);
		
		result = a >= b;
		System.out.println("result="+result);
		
		result = a < b;
		System.out.println("result="+result);
		
		result = a > b;
		System.out.println("result="+result);
		
		result = "result" instanceof String;
		System.out.println("result="+result);
	}
}