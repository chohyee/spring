package cn.wells.j_jdbctemplate_injection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//��ע������ʱ�����ע�������û��set�����������֡�failed to load applicationcontext������
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/wells/j_jdbctemplate_injection/applicationContext.xml")
public class Demo {
	@Resource(name="userDao")
	private UserDao ud;
	@Test
	public void test(){
		int totalCount = ud.getTotalCount();
		System.out.println(totalCount);
	}
}
