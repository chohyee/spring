package cn.wells.c_complexTypeInjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/wells/c_complexTypeInjection/applicationContext.xml");
		ComplexBean cb = (ComplexBean) ac.getBean("cb");
		System.out.println(cb);
	}
}	
