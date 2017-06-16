/*
比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试
*/
class EquilsTest{
	public static void main(String[] args) {
		byte a = 1,b = 2;
		equils(a,b);
		short x = 3,y = 3;
		equils(x,y);
		int m = 4,n = 5;
		equils(m,n);
		long i = 8,o = 8;
		equils(i,o);
	}
	
	public static void equils(byte a,byte b){
		if(a==b){
			System.out.println("这两个数相等");
		}else{
			System.out.println("这两个数不相等");
		}
	}
	public static void equils(int a,int b){
		if(a==b){
			System.out.println("这两个数相等");
		}else{
			System.out.println("这两个数不相等");
		}
	}
	public static void equils(short a,short b){
		if(a==b){
			System.out.println("这两个数相等");
		}else{
			System.out.println("这两个数不相等");
		}
	}
	public static void equils(long a,long b){
		if(a==b){
			System.out.println("这两个数相等");
		}else{
			System.out.println("这两个数不相等");
		}
	}
}
