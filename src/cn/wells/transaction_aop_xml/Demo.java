package cn.wells.transaction_aop_xml;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//junit4
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/wells/transaction_aop_xml/applicationContext.xml")
public class Demo {
	@Resource(name="accountService")
	private AccountService as;
	@Test
	public void test(){
		as.transfer(1, 2, 100d);//Ã¿´Î×ª100
	}
}
