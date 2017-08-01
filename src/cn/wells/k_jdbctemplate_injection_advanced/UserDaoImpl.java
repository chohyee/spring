package cn.wells.k_jdbctemplate_injection_advanced;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//用JdbcDaoSupport类来实现增删改查操作
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
				//将arg0遍历出来的结果封装到对象中返回,arg1是索引，不关注就不用
				//并且能进来肯定有arg0，所以不用判空
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
			//mapRow循环运行，每次返回一个对象
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
