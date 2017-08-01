package cn.wells.domain;

public class User {
	private String name;
	private int age;
	private Car car;

	//Spring�����ַ�����������(�ղι��졢��̬������ʵ������)
	//1���ղι���
	public User(){
		//��Ӧ�����ļ�<bean name="user" class="cn.wells.domain.User"></bean>
	}
	public User(String name,int age, Car car){
		this.name = name;
		this.age = age;
		this.car = car;
	}
	//2����̬����
	public static User creatUser(){
		//��Ӧ�����ļ�<bean name="user" class="cn.wells.domain.User" factory-method="createUser"></bean>
		return new User();
	}
	//3��ʵ������(��Ҫһ���������������Ķ�����������һ������һ�㲻��)
	public User createUser2(){
		//��Ӧ�����ļ�	<bean name="user2" factory-bean="user1" factory-method="createUser2"></bean>
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
	//��ʼ����
	public void init(){
		System.out.println("���ǳ�ʼ����");
	}
	//���ٷ���
	public void destory(){
		System.out.println("�������ٷ���");
	}
	
}
