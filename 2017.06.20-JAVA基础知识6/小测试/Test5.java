/*
写一个程序，模拟生成5个商品对象，比如：
 商品对象1：
    id=“pdt_001”
    name = “小米5sPlus”
    price = 1999.00

然后模拟生成一个订单对象，比如
   订单1：
      id="order_001"
      username = "远哥"
      items = [商品对象1，商品对象2，商品对象3，商品对象4]
      amount = <各商品价格累加>
      payment = <按照题4中描述的规则计算>

然后，在程序中打印该订单的所有信息；
*/
class Test5{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.5f);
		i[1] = new Item(002,"C++",57.34f);
		i[2] = new Item(003,"Python",85.9f);
		
		Order o = new Order(1,"刘凯",i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		System.out.println("----------------------------------------");
		System.out.println("商品1ID："+o.getItems()[0].getId());
		System.out.println("商品1名称："+o.getItems()[0].getName());
		System.out.println("商品1价格："+o.getItems()[0].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("商品2ID："+o.getItems()[1].getId());
		System.out.println("商品2名称："+o.getItems()[1].getName());
		System.out.println("商品2价格："+o.getItems()[1].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("商品3ID："+o.getItems()[2].getId());
		System.out.println("商品3名称："+o.getItems()[2].getName());
		System.out.println("商品3价格："+o.getItems()[2].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("订单编号："+o.getId());
		System.out.println("用户名："+o.getUsername());
		System.out.println("订单总金额："+amount);
		System.out.println("订单应付金额："+payment);
		
	}
}
//订单
class Order{
	private int id;
	private String username;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Item[] getItems(){
		return items;
	}
	public int getId(){
		return id;
	}
	public String getUsername(){
		return username;
	}
	
	public Order(int id,String username,Item[] items){
		this.id = id;
		this.username = username;
		this.items = items;
	}
	
	public float amount(Item[] items){
		float sum = 0.0f;
		for(int i=0;i<items.length;i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	
	public float payment(float amount){
		float result = 0.0f;
		if(amount>0 && amount<100){
			result = amount;
		}else if(amount>=100 && amount<200){
			result = amount*0.9f;
		}else if(amount>=100 && amount<200){
			result = amount*0.85f;
		}else{
			result = amount*0.8f;
		}
		return result;
	}
}
//商品
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(float price){
		if(price<1){
			System.out.println("你输入的价格有误！");
		}
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	
	public void show(){
		System.out.println("id="+id+",name="+name+",price="+price);
	}
}

