/*
定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试类Test，进行测试
*/
class Test{
	public static void main(String[] args) {
		Demo d = new Demo();
		int sum = d.sum(12,12);
		d.show(sum);
	}
}

class Demo{
	public int sum(int m,int n){
		return m+n;
	}
	
	public void show(int sum){
		System.out.println("sum="+sum);
	}
}
