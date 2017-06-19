/*
成员变量和局部变量的区别：
	内存中的位置不同
		成员变量：放在堆内存中
		局部变量：放在栈内存中
	类中的位置不同
		成员变量：类中，方法外
		局部变量：方法参数列表上或者方法体内部
	生命周期不同
		成员变量：随着对象的创建而存在，随着对象的消失(当栈中没有引用指向时)完毕而消失
		局部变量：随着方法的调用加载而存在，随着方法的调用完毕而消失
	初始化值不同
		成员变量：是jvm自动给赋值
		局部变量：必须自己手动赋值
*/