/*
求出1-100之间偶数和
求出1-100之间奇数和
*/
class ForTest3{
	public static void main(String[] args){
		//定义保存偶数和的变量
		int doubleSum = 0;
		//定义保存奇数和的变量
		int singleSum = 0;
		//遍历1-100
		for(int i=1; i<=100; i++){
			//判断是奇数还是偶数
			if(i%2==0){
				//偶数
				doubleSum += i;
			}else{
				//奇数
				singleSum += i;
			}
		}
		System.out.println("1-100之间偶数和："+doubleSum);
		System.out.println("1-100之间奇数和："+singleSum);
	}
}