/*
	6、扩展提升题（对以上订单模型进行增强）
再写一个类描述客户Customer，客户包含以下属性：
   客户名称username
   客户等级（等级的值可以是“至尊钻石VIP”“尊享白金VIP”“普通客户”）

然后将题4中的订单类的username属性改成用客户对象来表示,其他属性与题4一致，即：
   订单id
   订单所属用户，如 Customer c;
   商品数组items（数组中存放的是多个商品对象）
   订单总金额amount（订单总金额=商品数组中各商品价格的总和）
   订单实际应支付额payment（改变之前逻辑：在之前的总金额打折基础上，根据客户的等级再打折，比如：至尊钻石VIP叠加一个8折，尊享白金vip叠加一个9折，普通客户不叠加折扣）


然后写程序模拟创建几个商品，一个订单，然后打印订单信息（扩展需求：可以通过调用订单对象上的一个自定义方法直接获取该订单中最贵的商品）
*/
class Customer{
	//客户名称
	private String username;
	//客户等级（假设用2表示“至尊钻石VIP”	用1表示“尊享白金VIP” 默认0表示“普通客户”）
	private int level;
	public Customer(String username,int level){
		this.username = username;
		this.level = level;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return username;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
}