package cn.wells.transaction_aop_annotation;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//在类处开启使用事务,给类的每一个方法都开启事务，能被声明在方法处的Transactional覆盖
@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class AccountServiceImpl implements AccountService {
	
	private AccountDao ad ;
	//set注入需要set方法
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void transfer(Integer from,Integer to,Double money) {
				//减钱
				ad.decreaseMoney(from, money);
				//int i = 1/0;//检测事务是否生效
				//加钱
				ad.increaseMoney(to, money);
	}		
}

