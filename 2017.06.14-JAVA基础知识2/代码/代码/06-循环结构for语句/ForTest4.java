/*请统计1-1000之间分别满足如下条件的数据有多少个：
对3整除余2
对5整除余3
对7整除余2*/
class ForTest4{
	public static void main(String[] args){
		//对3整除余2
		int count_1 = 0;
		//对5整除余3
		int count_2 = 0;
		//对7整除余2
		int count_3 = 0;
		//遍历1-1000的值
		for(int i=1; i<=1000; i++){
			if(i%3==2){//对3整除余2
				count_1++;
			}else if(i%5==3){//对5整除余3
				count_2++;
			}else if(i%7==2){//对7整除余2
				count_3++;
			}
		}
		System.out.println("1-1000之间对3整除余2的个数："+count_1);//333
		System.out.println("1-1000之间对5整除余3的个数："+count_2);//133
		System.out.println("1-1000之间对7整除余2的个数："+count_3);//77
	}
}
