package cn.wells.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//1.注册对象到容器
@Component("person")//注册名为person的对象到容器中
	//为了区别三层架构,有以下分化（只是名字换了便于区别，其实还是Component）
	//@Service("person")--->service层
	//@Controller("person")--->web层
	//@Repository("person")--->dao层--->Repository:仓库
//相当于<bean name="person" class="cn.wells.domain.Person"></bean>

//2.指定对象的作用范围
//singleton:被标识的对象在容器中将只存在一个
//prototype:被标识的对象在容器中将存在多个
//request:web环境下，对象的生命周期与request一致
//session:web环境下，对象的生命周期与session一致
@Scope(scopeName="singleton")

public class Person {
	//3.值类型属性注入
	//注解中的属性注入如果只有一个值可以省略键，如Value(name="tom")等价于Value("tom")
	@Value("tom")//通过反射的field赋值，破坏了封装性
	private String name;
	private int age;
	//4.引用类型注入,
	//@Autowired //自动装配已经注入的Car类型的对象,但是如果存在多个Cat对象时，将无法确定选择哪个类
	//@Qualifier("cat")//使用该注解告诉Spring到底自动装配哪一个（其实还是不推荐）
	@Resource(name="cat")//推荐使用，手动注入，指定装配哪个名称的对象,将容器中名为cat的对象注入到cat
	private Cat cat;
	
	@Value("tom")//通过set赋值，推荐使用
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
	
	//5.初始化注解
	@PostConstruct()//在对象被创建后调用.init-method()
	public void init(){
		System.out.println("我是初始化方法");
	}
	@PreDestroy //在销毁之前调用.destory-method
	public void destroy(){
		System.out.println("我是销毁方法");
	}
	
}
