/*
再写一个类描述客户Customer，客户包含以下属性：
   客户名称username
   客户等级（等级的值可以是“至尊钻石VIP”“尊享白金VIP”“普通客户”）
然后将题4中的订单类的username属性改成用客户对象来表示,其他属性与题4一致，即：
   订单id
订单所属用户，如 Customer c;
   商品数组items（数组中存放的是多个商品对象）
   订单总金额amount（订单总金额=商品数组中各商品价格的总和）  订单实际应支付额payment（改变之前逻辑：在之前的总金额打折基础上，根据客户的等级再打折，比如：至尊钻石VIP叠加一个8折，尊享白金vip叠加一个9折，普通客户不叠加折扣）
然后写程序模拟创建几个商品，一个订单，然后打印订单信息（扩展需求：可以通过调用订单对象上的一个自定义方法直接获取该订单中最贵的商品）
*/
class Test6{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.5f);
		i[1] = new Item(002,"C++",97.34f);
		i[2] = new Item(003,"Python",85.9f);
		
		Order o = new Order(1,new Customer("刘凯","至尊钻石VIP"),i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		for(int j=0;j<o.getItems().length;j++){
			System.out.println("----------------------------------------");
			System.out.println("商品"+(j+1)+"ID："+o.getItems()[j].getId());
			System.out.println("商品"+(j+1)+"名称："+o.getItems()[j].getName());
			System.out.println("商品"+(j+1)+"价格："+o.getItems()[j].getPrice());
		}
		System.out.println("----------------------------------------");
		System.out.println("价格最大的商品信息如下：");
		System.out.println("商品ID："+o.maxPrice(i).getId());
		System.out.println("商品名称："+o.maxPrice(i).getName());
		System.out.println("商品价格："+o.maxPrice(i).getPrice());
		System.out.println("----------------------------------------");
		System.out.println("订单编号："+o.getId());
		System.out.println("用户名："+o.getCustomer().getUsername());
		System.out.println("人物等级："+o.getCustomer().getRank());
		System.out.println("订单总金额："+amount);
		System.out.println("订单应付金额："+payment);
		
	}
}

//客户
class Customer{
	private String username;
	private String rank;
	
	public Customer(String username,String rank){
		this.username = username;
		this.rank = rank;
	}
	
	public String getUsername(){
		return username;
	}
	public String getRank(){
		return rank;
	}
	
}

//订单
class Order{
	private int id;
	private Customer customer;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Item[] getItems(){
		return items;
	}
	public int getId(){
		return id;
	}
	public Customer getCustomer(){
		return customer;
	}
	
	public Order(int id,Customer customer,Item[] items){
		this.id = id;
		this.customer = customer;
		this.items = items;
	}
	//计算总金额
	public float amount(Item[] items){
		float sum = 0.0f;
		for(int i=0;i<items.length;i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	//计算应付金额
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
		if(customer.getRank()=="至尊钻石VIP"){
			result *= 0.8;
		}else if(customer.getRank()=="尊享白金VIP"){
			result *= 0.9;
		}
		return result;
	}
	
	//获取价格最大的商品
	public Item maxPrice(Item[] items){
		Item max = new Item();
		for(int i=0;i<items.length-1;i++){
			if(items[i].getPrice()>items[i+1].getPrice()){
				max = items[i];
			}else{
				max = items[i+1];
			}
		}
		return max;
	}
}
//商品
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(){}
	
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


