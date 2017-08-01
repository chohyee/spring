package cn.wells.transaction_aop_annotation;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/wells/transaction_aop_annotation/applicationContext.xml")
public class Demo {
	@Resource(name="accountService")
	private AccountService as;
	@Test
	public void test(){
		as.transfer(1, 2, 100d);//Ã¿´Î×ª100
	}
}
