package cn.wells.transaction_aop_annotation;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//���ദ����ʹ������,�����ÿһ�����������������ܱ������ڷ�������Transactional����
@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class AccountServiceImpl implements AccountService {
	
	private AccountDao ad ;
	//setע����Ҫset����
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void transfer(Integer from,Integer to,Double money) {
				//��Ǯ
				ad.decreaseMoney(from, money);
				//int i = 1/0;//��������Ƿ���Ч
				//��Ǯ
				ad.increaseMoney(to, money);
	}		
}

