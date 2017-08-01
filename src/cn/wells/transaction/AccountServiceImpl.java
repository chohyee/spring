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
	
	//setע����Ҫset����
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	//�����ڲ�����ʾֲ�������Ҫ���ܲ���������final����
	public void transfer(final Integer from,final Integer to,final Double money) {
		//ģ�����tt�Ѿ���������������ˣ�ֻ���������Ҫ��ʲô�ͺ���
		//execute������ŵ�ִ��Ϊ�������񣬵���doInTransactionWithoutResult�������ύ����
		//�����Լ��Ĵ���Ž��÷���������
		tt.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				//��Ǯ
				ad.decreaseMoney(from, money);
				//int i = 1/0;//
				//��Ǯ
				ad.increaseMoney(to, money);
			}});

	}		
}

