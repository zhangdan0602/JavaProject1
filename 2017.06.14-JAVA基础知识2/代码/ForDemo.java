/*
循环结构：在循环条件为true的情况下，反复执行某一段代码，这段代码就叫做循环体语句；
			当在合适的时候，需要将这个判断条件改为false，从而结束整个循环。如果循环不结束，那么就是死循环
	输出10次“中北大学”
	
循环结构四大组成部分：
	初始化语句：一般用于初始化一些数据，比如初始化一个变量
	判断条件语句：判断当前的变量是否满足继续循环下去的条件
	循环体语句：就是我们要反复执行的代码
	控制条件语句：改变这个变量的值，让循环结构在合适的时候结束
	
	伪代码：只是一种思想
		初始化语句：定义变量i=0
		判断条件语句：判断i是否小于10
		循环体语句：输出"中北大学"
		控制条件语句：i++
	
循环结构：
	for语句格式：
		for(初始化语句;判断条件语句;控制条件语句){
			循环体语句;
		}
	执行流程：
		A:执行初始化语句
		B:执行判断条件语句，看其结果是true还是false
			如果是true继续执行C步骤
			如果是false，结束for语句
		C:执行循环体语句
		D:执行控制条件语句
		E:继续回到B步骤
	
	for语句注意事项：
		判断条件语句必须返回的是boolean类型地址
		for语句如果没有大括号，那么默认只能控制一条语句
		循环体语句可以是一条或者多条语句
		有大括号就没有分号，有分号就没有大括号
	while语句
	do...while语句
		
*/
class ForDemo{
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			System.out.println("中北大学");
		}
		System.out.println("over");
	}
}