/*
2.对一维数组进行增删改查：int[] num = new int[10]; 
	要求：用方法实现 
		1.输入10个整数存入数组 
		2.删除指定位置上的数 
		3.修改指定位置上的数 
		4.查找某个数的位置（下标） 
		5.查找最大值 
		6.查找最小值 
		7.去掉一个最大值，去掉一个最小值，求平均值
		8.将数组排序(正序和逆序)
*/
import java.util.Scanner;
class Test1{
	public static void main(String[] args) {
		System.out.println("	1.输入10个整数存入数组 ");
		int[] arr = insertArray();
		while(true){
			System.out.println("*********************************");
			System.out.println("	2.删除指定位置上的数 ");
			System.out.println("	3.修改指定位置上的数  ");
			System.out.println("	4.查找某个数的位置（下标） ");
			System.out.println("	5.查找最大值 ");
			System.out.println("	6.查找最小值 ");
			System.out.println("	7.去掉一个最大值，去掉一个最小值，求平均值 ");
			System.out.println("	8.将数组排序(正序和逆序) ");
			System.out.println("	9.退出 ");
			System.out.println("*********************************");
			showArray(arr);
			System.out.println("---------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入你的选择：");
			int n = sc.nextInt();
			if(n==9){
				System.out.println("你已成功退出！");
				break;
			}
			switch(n){
				case 2:
					System.out.print("请输入要删除的位置：");
					int m = sc.nextInt();
					int[] arr1 = delArray(arr,m);
					showArray(arr1);break;
				case 3:
					System.out.print("请输入要修改的位置：");
					int m1 = sc.nextInt();
					System.out.print("请输入想要修改的数据：");
					int m2 = sc.nextInt();
					int[] arr3 = alterArray(arr,m1,m2);
					showArray(arr3);break;
				case 4:
					System.out.print("请输入要查找的数据：");
					int m4 = sc.nextInt();
					int res = queryIndex(arr,m4);
					System.out.println("该数据在数组中下标为："+res);break;
				case 5:
					int max = max(arr);
					System.out.println("该数组最大值为："+max);
					break;
				case 6:
					int min = min(arr);
					System.out.println("该数组最大值为："+min);
					break;
				case 7:
					float f = avge(arr);
					System.out.println("去掉一个最大值，去掉一个最小值，该数组平均值为："+f);
					break;
				case 8:
					sort(arr);
					break;
				default:System.out.println("你输入的数据有误！");break;
			}
		}
		
		
	}
	
	public static void sort(int[] args){
		for(int i=0;i<args.length-1;i++){
             for(int j=i+1;j<args.length;j++){
				if (args[i]>args[j]){
					int temp=args[i];
					args[i]=args[j];
					args[j]=temp;
                }
			}
		}
		System.out.println("升序结果为：");
		showArray(args);
		for(int i=0;i<args.length-1;i++){
             for(int j=i+1;j<args.length;j++){
				if (args[i]<args[j]){
					int temp=args[i];
					args[i]=args[j];
					args[j]=temp;
                }
			}
		}
		System.out.println("降序结果为：");
		showArray(args);
	}
	
	public static float avge(int[] arr){
		int max = max(arr);
		int min = min(arr);
		int maxIde = queryIndex(arr,max);
		int minIde = queryIndex(arr,min);
		int[] arr1 = delArray(delArray(arr,maxIde+1),minIde+1);
		int sum=0;
		for(int i=0;i<arr1.length;i++){
			sum += arr1[i]; 
		}
		float avg = 1.0f*sum/arr1.length;
		return avg;
	}
	
	public static int min(int[] arr){
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int max(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int queryIndex(int[] arr,int n){
		int m = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				m = i;
			}
		}
		return m;
	}
	
	public static int[] alterArray(int[] arr,int n,int m){
		for(int i=0;i<arr.length;i++){
			if(i==(n-1)){
				arr[i] = m;
			}
		}
		return arr;
	}
	
	//将一个数组中的元素进行删除
	public static int[] delArray(int[] arr,int n){
		int[] arr1 = new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++,j++){
			if(i==(n-1)){
				j--;
				continue;
			}
			arr1[j] = arr[i];
		}
		return arr1;
	}
	
	//遍历数组，并将数组进行输出
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			//判断是不是一个元素的情况
			if(arr.length==1){
				System.out.println(arr[j]);
			}else if(j==0){//判断是不是第一个元素
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){//判断是不是最后一个元素
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
	
	//获取键盘输入，并写入数组中
	public static int[] insertArray(){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		//循环向数组写入10个整数
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"个整数：");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
