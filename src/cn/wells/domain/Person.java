package cn.wells.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//1.ע���������
@Component("person")//ע����Ϊperson�Ķ���������
	//Ϊ����������ܹ�,�����·ֻ���ֻ�����ֻ��˱���������ʵ����Component��
	//@Service("person")--->service��
	//@Controller("person")--->web��
	//@Repository("person")--->dao��--->Repository:�ֿ�
//�൱��<bean name="person" class="cn.wells.domain.Person"></bean>

//2.ָ����������÷�Χ
//singleton:����ʶ�Ķ����������н�ֻ����һ��
//prototype:����ʶ�Ķ����������н����ڶ��
//request:web�����£����������������requestһ��
//session:web�����£����������������sessionһ��
@Scope(scopeName="singleton")

public class Person {
	//3.ֵ��������ע��
	//ע���е�����ע�����ֻ��һ��ֵ����ʡ�Լ�����Value(name="tom")�ȼ���Value("tom")
	@Value("tom")//ͨ�������field��ֵ���ƻ��˷�װ��
	private String name;
	private int age;
	//4.��������ע��,
	//@Autowired //�Զ�װ���Ѿ�ע���Car���͵Ķ���,����������ڶ��Cat����ʱ�����޷�ȷ��ѡ���ĸ���
	//@Qualifier("cat")//ʹ�ø�ע�����Spring�����Զ�װ����һ������ʵ���ǲ��Ƽ���
	@Resource(name="cat")//�Ƽ�ʹ�ã��ֶ�ע�룬ָ��װ���ĸ����ƵĶ���,����������Ϊcat�Ķ���ע�뵽cat
	private Cat cat;
	
	@Value("tom")//ͨ��set��ֵ���Ƽ�ʹ��
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
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	//5.��ʼ��ע��
	@PostConstruct()//�ڶ��󱻴��������.init-method()
	public void init(){
		System.out.println("���ǳ�ʼ������");
	}
	@PreDestroy //������֮ǰ����.destory-method
	public void destroy(){
		System.out.println("�������ٷ���");
	}
	
}
