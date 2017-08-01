package cn.wells.e_annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wells.domain.Person;


public class Demo {
	@Test
	public void test(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p.getName());
		
		ac.close();//ac关闭，所有对象的销毁方法调用
	}
}
