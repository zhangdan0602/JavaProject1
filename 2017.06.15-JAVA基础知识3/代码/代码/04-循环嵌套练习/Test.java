//1.请输出一个4行5列的星星(*)图案
class Test{
	public static void main(String[] args){
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		//最外层for循环控制行数
		for(int i=0; i<4; i++){
			System.out.println("*****");
		}
		*/
		//定义一个行的变量
		int row = 4;
		//定义一个列的变量
		int colum = 5;
		
		//最外层for循环控制行数
		for(int i=0; i<row; i++){
			//里面这层控制列数
			for(int j=0; j<colum; j++){
				System.out.print("*");
			}
			//换行
			System.out.println();
		}
	}
}