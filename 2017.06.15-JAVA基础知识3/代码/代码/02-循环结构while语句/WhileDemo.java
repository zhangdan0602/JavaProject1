/*
循环结构while语句：
	初始化语句;
	while(判断条件语句){
		循环体语句;
		控制条件语句：
	}
执行流程：
	A:执行初始化语句
	B:执行判断条件语句，看其结果是true还是false
		如果是false，就结束while语句
		如果是true，就继续C步骤
	C:执行循环体语句
	D:执行控制条件语句
	E:回到B步骤
	
	用while循环改写输出10次“中北大学”
	用while循环实现1-10之间的和
*/
class WhileDemo{
	public static void main(String[] args){
		//初始化语句
		int i=0;
		while(i<10){//判断条件语句
			System.out.println("中北大学");//循环体语句
			i++;//控制条件语句
		}
	}
}