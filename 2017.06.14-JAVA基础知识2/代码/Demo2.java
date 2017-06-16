//练习三目运算符
class Demo2{
	public static void main(String[] args){
		//获取两个long类型整数中的最大值，输出其结果
		long a=12,b=23;
		long max1 = (a>b)?a:b;
		System.out.println("max1="+max1);
		
		//获取三个float小数中的最大值，输出其结果
		float c=12.12f,d=12.13f,o=12.14f;
		float max2 = (((c>d)?c:d)>o)?((c>d)?c:d):o;
		System.out.println("max2="+max2);
		
		//比较两个int整数是否相同，输出其结果
		int e=12,f=13;
		System.out.println("result="+(e==f));
	}
}