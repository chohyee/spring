package cn.wells.transaction_aop_annotation;

public interface AccountDao {
	//º”«Æ
	void increaseMoney(Integer id,Double money);
	//ºı«Æ
	void decreaseMoney(Integer id,Double money);
}
