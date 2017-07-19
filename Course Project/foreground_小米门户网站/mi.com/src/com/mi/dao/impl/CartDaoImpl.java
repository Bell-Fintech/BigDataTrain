package com.mi.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mi.Exception.DaoException;
import com.mi.domain.Announce;
import com.mi.domain.Cart;
import com.mi.util.DBCPUtil;

public class CartDaoImpl {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

	public List<Cart> findCart(int uid) {
		try {
			return qr.query("select * from cart where uid =" + uid,
					new BeanListHandler<Cart>(Cart.class));
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	public void addCart(int uid, int pid) {
		try {
			String sql = "insert into cart (uid,pid,cpamount) values(?,?,?)";
			Object params[] = {uid,pid,1};
			qr.update(sql, params);
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}
	
	public void delCart(int uid, int pid) {
		try {
			String sql = "delete from cart where uid= ? and pid = ?";
			Object params[] = {uid, pid};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}
	
}
