package cn.wells.transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	
	private TransactionTemplate tt;
	private AccountDao ad ;
	
	
	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}
	
	//set注入需要set方法
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	//匿名内部类访问局部变量需要将拒不避难量加final修饰
	public void transfer(final Integer from,final Integer to,final Double money) {
		//模板对象tt已经把事务管理做好了，只需告诉他你要做什么就好了
		//execute方法大概的执行为：打开事务，调用doInTransactionWithoutResult方法，提交事务
		//把你自己的代码放进该方法就行了
		tt.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				//减钱
				ad.decreaseMoney(from, money);
				//int i = 1/0;//
				//加钱
				ad.increaseMoney(to, money);
			}});

	}		
}

