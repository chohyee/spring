package cn.wells.domain;

public class User {
	private String name;
	private int age;
	private Car car;

	//Spring有三种方法创建对象(空参构造、静态工厂、实例工厂)
	//1、空参构造
	public User(){
		//对应配置文件<bean name="user" class="cn.wells.domain.User"></bean>
	}
	public User(String name,int age, Car car){
		this.name = name;
		this.age = age;
		this.car = car;
	}
	//2、静态工厂
	public static User creatUser(){
		//对应配置文件<bean name="user" class="cn.wells.domain.User" factory-method="createUser"></bean>
		return new User();
	}
	//3、实力工厂(需要一个包含工厂方法的对象来创建另一个对象，一般不用)
	public User createUser2(){
		//对应配置文件	<bean name="user2" factory-bean="user1" factory-method="createUser2"></bean>
		//			<bean name="user1" class="cn.wells.domain.User"></bean>
		return new User();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	//初始方法
	public void init(){
		System.out.println("我是初始方法");
	}
	//销毁方法
	public void destory(){
		System.out.println("我是销毁方法");
	}
	
}
