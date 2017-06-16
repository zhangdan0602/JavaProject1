/*
请在控制台输出数据1-10
求出1-10之间数据之和
*/
class ForTest{
	public static void main(String[] args){
		//定义一个存放和的变量
		int sum = 0;
		//遍历1-10
		for(int i=1; i<=10; i++){
			//请在控制台输出数据1-10
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("------------------------");
		
		System.out.println("sum="+sum);
	}
}