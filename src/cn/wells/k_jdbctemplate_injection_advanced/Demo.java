package cn.wells.k_jdbctemplate_injection_advanced;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//在注入对象的时候，如果注入的属性没有set方法，则会出现“failed to load applicationcontext”错误
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/wells/k_jdbctemplate_injection_advanced/applicationContext.xml")
public class Demo {
	@Resource(name="userDao")
	private UserDao ud;
	@Test
	public void test(){
		int totalCount = ud.getTotalCount();
		System.out.println(totalCount);
	}
}