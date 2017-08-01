package cn.wells.transaction_aop_xml;


public class AccountServiceImpl implements AccountService {
	
	private AccountDao ad ;
	//set注入需要set方法
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	//匿名内部类访问局部变量需要将拒不避难量加final修饰
	public void transfer(Integer from,Integer to,Double money) {
		//减钱
		ad.decreaseMoney(from, money);
		//int i = 1/0;//用来检测事务是否配置成功
		//加钱
		ad.increaseMoney(to, money);
	}		
}

