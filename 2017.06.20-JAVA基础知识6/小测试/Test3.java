/*
写一个类，用来描述商品Item，商品包含以下属性：
商品id
商品名称
商品单价
*/
class Test3{
	public static void main(String[] args) {
		Item i = new Item(001,"老人与海",23.9f);
		i.show();
	}
}
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void show(){
		System.out.println("id="+id+",name="+name+",price="+price);
	}
}
