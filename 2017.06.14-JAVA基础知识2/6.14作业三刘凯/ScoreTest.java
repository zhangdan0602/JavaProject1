/*
8.编写代码实现如下内容：if语句实现
考试成绩分等级。
	90~100	A等。
	80-89	B等。
	70-79	C等。
	60-69	D等。
	60以下	E等。
请根据给定成绩，输出对应的等级。
*/
import java.util.Scanner;
class ScoreTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.print("输入成绩有误！");
		}else if(score>=90 && score<=100){
			System.out.println("A等");
		}else if(score>=80 && score<=89){
			System.out.println("B等");
		}else if(score>=70 && score<=79){
			System.out.println("C等");
		}else if(score>=60 && score<=69){
			System.out.println("D等");
		}else{
			System.out.println("E等");
		}
		
	}
}
