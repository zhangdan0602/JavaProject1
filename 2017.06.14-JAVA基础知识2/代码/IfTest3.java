/*
键盘录入三个数据，然后获取最大值
*/
import java.util.Scanner;
class IfTest3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数：");
		int c = sc.nextInt();
		
		int max;
		
		/*
		//首先比较a和b的值
		if(a>b){
			//如果代码走到这里了，说明a比b大
			//比较a和c
			if(a>c){
				//如果代码走到了这里，说明最大值是a
				max = a;
			}else{
				//如果代码走到了这里，说明最大值是c
				max = c;
			}
		}else{
			//如果代码走到这里了，说明b比a大
			//比较b和c
			if(b>c){
				//如果代码走到这里，说明最大值是b
				max = b;
			}else{
				//如果代码走到这里，说明最大值是c
				max = c;
			}
		}*/
		
		if(a>b){
			//如果代码走到这里了，说明a比b大
			//比较a和c
			if(a>c){
				//如果代码走到了这里，说明最大值是a
				max = a;
			}else{
				//如果代码走到了这里，说明最大值是c
				max = c;
			}
		}else if(b>c){//如果代码走到这里了，说明b比a大
			//如果代码走到这里，说明最大值是b
			max = b;		
		}else{//如果代码走到这里，说明最大值是c
			max = c;
		}
		
		System.out.println("最大值是"+max);
	}
}