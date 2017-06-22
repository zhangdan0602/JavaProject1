/*

*/
class Test2{
	public static void main(String[] args) {
		B b = new B();
		b.foo2();
		
	}
}
class A {
     public void foo1() {
          System.out.println("AAAAAAAAAAAAAAAA");
     }
 
     public void foo2() {
          this.foo1();
     }
}
 
class B extends A{
     public void  foo1() {
          System.out.println("BBBBBBBBBBBBBBBB");
		  
     }
}
