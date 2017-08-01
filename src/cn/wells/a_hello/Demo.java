package cn.wells.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wells.domain.User;
//
public class Demo {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/wells/a_hello/applicationContext.xml");
		User u = (User) ac.getBean("user");
		System.out.println(u.getName());
	}
}
