class Test{
	public static void main(String[] args){
		for(int a=0;a<50;a++){
			for(int b=0;b<50;b++){
				for(int c=0;c<50;c++){
					int r = 2*a+2*b+c-1;
					if(r == 50){
						System.out.println("a="+a+",b="+b+",c="+c);
					}
				}
			}
		}
	}
}