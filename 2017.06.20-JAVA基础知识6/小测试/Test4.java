/*
写一个订单类，用来描述用户生成的订单Order，订单包含以下属性：
订单id
订单所属的用户名username
商品数组items（数组中存放的是多个商品对象）
订单总金额amount（不能让调用者直接赋值，应该在内部自动计算!!! 订单总金额=商品数组中各商品价格的总和）
订单实际应支付额payment（不能让调用者直接赋值，应该在内部自动计算!!!
       实际应支付额的计算逻辑：
       如果 订单总金额 在[0-99] 之间，则应支付额=总金额
       如果 订单总金额 在[100-199] 之间，则应支付额=总金额*0.9
       如果 订单总金额 在[199-200] 之间，则应支付额=总金额*0.85
       如果 订单总金额  >200，则应支付额=总金额*0.8）
*/
class Test4{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.0f);
		i[1] = new Item(002,"C++",57.0f);
		i[2] = new Item(003,"Python",85.0f);
		
		Order o = new Order(1,"刘凯",i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		System.out.println("amount="+amount+",payment="+payment);
		
	}
}
//订单
class Order{
	private int id;
	private String username;
	private Item[] items;
	private float amount;
	private float payment;
	
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
