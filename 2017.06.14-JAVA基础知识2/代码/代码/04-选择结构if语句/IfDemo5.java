/*
选择结构if语句格式3：
	if(关系表达式1){
		语句体1;
	}else if(关系表达式2){
		语句体2；
	}else if(关系表达式3){
		语句体3；
	}
	。。。
	else{
		语句体n+1；
	}
	执行流程：
		计算出关系表达式1的值，看其结果是true还是false
		如果是true，则执行语句体1
		如果是false，计算出关系表达式2的值，看其结果是true还是false
		如果是true，则执行语句体2
		如果是false，计算出关系表达式3的值，看其结果是true还是false
		如果是true，则执行语句体3
		如果是false，计算出关系表达式n的值，看其结果是true还是false
		如果是true，则执行语句体n
		如果是false，表明上述条件都不满足，则执行else里面的语句体n+1
		
	把咋们班考试成绩分等级来
	90-100	优秀
	80-90	好
	70-80	良
	60-70	及格
	60以下	不及格

	正确数据
	边界数据
	错误数据
*/
import java.util.Scanner;
class IfDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入考试成绩：");
		int score = sc.nextInt();
		//判断一下错误数据
		if(score<0 || score>100){
			System.out.println("你输入的成绩有误");
		}else if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score<90){
			System.out.println("好");
		}else if(score>=70 && score<80){
			System.out.println("良");
		}else if(score>=60 && score<70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}
}