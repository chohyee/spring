package cn.wells.h_annotationaop;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/wells/h_annotationaop/applicationContext.xml")
public class Demo {
	@Resource(name="userService2")
	private UserService us;
	
	@Test
	public void fun1(){
		us.save();
	}
	
}
