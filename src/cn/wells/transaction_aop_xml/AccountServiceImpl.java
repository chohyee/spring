package cn.wells.transaction_aop_xml;


public class AccountServiceImpl implements AccountService {
	
	private AccountDao ad ;
	//setע����Ҫset����
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	//�����ڲ�����ʾֲ�������Ҫ���ܲ���������final����
	public void transfer(Integer from,Integer to,Double money) {
		//��Ǯ
		ad.decreaseMoney(from, money);
		//int i = 1/0;//������������Ƿ����óɹ�
		//��Ǯ
		ad.increaseMoney(to, money);
	}		
}

