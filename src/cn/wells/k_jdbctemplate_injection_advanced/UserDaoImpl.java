package cn.wells.k_jdbctemplate_injection_advanced;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//��JdbcDaoSupport����ʵ����ɾ�Ĳ����
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	
	@Override
	public void save(User u) {
		String sql = "insert into user values(null,'rose') ";
		super.getJdbcTemplate().update(sql,u.getName());
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from user where id=?";
		super.getJdbcTemplate().update(sql,id);
	}

	@Override
	public void update(User u) {
		String sql = "update user set name=? where id=?";
		super.getJdbcTemplate().update(sql,u.getName(),u.getId());
	}

	@Override
	public User getById(Integer id) {
		String sql = "select*from user where id=?";
		return super.getJdbcTemplate().queryForObject(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet arg0, int arg1) throws SQLException {
				//��arg0���������Ľ����װ�������з���,arg1������������ע�Ͳ���
				//�����ܽ����϶���arg0�����Բ����п�
				User u = new User();
				u.setId(arg0.getInt("id"));
				u.setName(arg0.getString("uname"));
				return null;
			}
			
		}, id);
	}

	@Override
	public int getTotalCount() {
		String sql = "select count(*) from user";
		return super.getJdbcTemplate().queryForObject(sql, Integer.class);
		
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from user";
		List<User> list = super.getJdbcTemplate().query(sql, new RowMapper<User>(){

			@Override
			//mapRowѭ�����У�ÿ�η���һ������
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}
			
		});
		return list;
	}

}
