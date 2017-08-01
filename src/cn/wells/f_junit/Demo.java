package cn.wells.f_junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wells.domain.Person;

/*
 * 用注解配置产生容器方便junit测试
 */
@RunWith(SpringJUnit4ClassRunner.class)//帮我们创建容器
@ContextConfiguration("classpath:applicationContext.xml")//指定创建容器时使用哪个配置文件
public class Demo {
	
	@Resource(name="person")
	private Person p;
	@Test
	public void test(){
		//这会自动调用销毁方法，因为方法结束后会销毁该对象p
		System.out.println(p);
	}
}
