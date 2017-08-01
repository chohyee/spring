package cn.wellls.i_jdbctemplate;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//演示spring中jdbc对象技术
public class Demo {
	@Test
	public void test() throws PropertyVetoException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql:///test");
		dataSource.setUser("root");
		dataSource.setPassword("272400");
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dataSource);
		String sql = "insert into user values(null,'rose') ";
		jt.update(sql);
	}
}
