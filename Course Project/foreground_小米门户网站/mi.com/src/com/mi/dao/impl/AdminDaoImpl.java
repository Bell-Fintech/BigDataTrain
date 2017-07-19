package com.mi.dao.impl;

import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mi.Exception.DaoException;
import com.mi.domain.Admin;
import com.mi.util.DBCPUtil;

public class AdminDaoImpl {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

	public List<Admin> findAdminByCondition(String condition) {
		try {
			if (!condition.trim().startsWith("where")
					&& !condition.trim().startsWith("WHERE")) {
				throw new RuntimeException(
						"The param condition must be start with where");
			}
			return qr.query("select * from admin " + condition,
					new BeanListHandler<Admin>(Admin.class));
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

}
