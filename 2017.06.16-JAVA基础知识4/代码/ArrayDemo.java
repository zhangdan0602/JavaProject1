/*
二维数组定义方式1
*/
class ArrayDemo{
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);
		
		arr[0][1] = 12;
		arr[1][2] = 13;
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);
	}
}
