/*
二维数组遍历
打印杨辉三角形(行数可以键盘录入)
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
*/
class ArrayTest{
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{23,3}};
		show(arr);
	}
	
	//二维数组遍历
	public static void show(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i].length==1){
					System.out.println("["+arr[i][j]+"]");
				}else if(j==arr[i].length-1){
					System.out.println(arr[i][j]+"]");
				}else if(j==0){
					System.out.print("["+arr[i][j]+",");
				}else{
					System.out.print(arr[i][j]+",");
				}
			}
		}
	}
}
