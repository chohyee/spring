package cn.wells.transaction_aop_annotation;

public interface AccountDao {
	//��Ǯ
	void increaseMoney(Integer id,Double money);
	//��Ǯ
	void decreaseMoney(Integer id,Double money);
}
