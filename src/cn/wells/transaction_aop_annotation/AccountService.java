package cn.wells.transaction_aop_annotation;

public interface AccountService {
	
	//×ªÕË·½·¨
	void transfer(Integer from,Integer to,Double money);
	
}