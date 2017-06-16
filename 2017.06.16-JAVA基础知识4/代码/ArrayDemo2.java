/*
二维数组定义方式2
*/
class ArrayDemo2{
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
