package cn.wells.k_jdbctemplate_injection_advanced;

import java.util.List;

public interface UserDao {
		//��
		void save(User u);
		//ɾ
		void delete(Integer id);
		//��
		void update(User u);
		//��
		User getById(Integer id);
		//��,��ҳ
		int getTotalCount();
		//��
		List<User> getAll();
}
