package zd.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import zd.bean.User;

public class userDaoImpl implements userDao {

	@Override
	public int register(User user) throws SQLException {
		// 操作数据库
		// 1 要有jar 配置文件
		// 2 创建数据库连接池的对象
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 3使用阿帕奇的工具类
		QueryRunner runner = new QueryRunner(dataSource);
		// 写sql
		String sql = "insert into  user values(null,?,?,?,?,?,null)";
		int i = runner.update(sql, user.getUsername(), user.getPassword(), user.getGender(), user.getEmail(),
				user.getTelephone());
		return i;
	}

}
