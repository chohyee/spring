package cn.wells.b_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wells.domain.User;

public class Demo {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/wells/b_injection/applicationContext.xml");
		User u1 = (User) ac.getBean("user1");
		System.out.println(u1.getName());
		User u2= (User) ac.getBean("user2");
		System.out.println(u2.getName());
		User u3 = (User) ac.getBean("user3");
		System.out.println(u3.getName());
		User u4 = (User) ac.getBean("user4");
		System.out.println(u4.getName());
		((AbstractApplicationContext) ac).close();
	}
}
