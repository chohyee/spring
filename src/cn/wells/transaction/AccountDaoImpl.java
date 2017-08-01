package cn.wells.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	//����DataSource
	@Override//��Ǯ
	public void increaseMoney(Integer id, Double money) {
		getJdbcTemplate().update("update account set money = money+? where id = ? ", money,id);
	}

	@Override//��Ǯ
	public void decreaseMoney(Integer id, Double money) {
		getJdbcTemplate().update("update account set money = money-? where id = ? ", money,id);
	}

}
