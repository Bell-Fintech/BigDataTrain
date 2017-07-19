package com.mi.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mi.Exception.DaoException;
import com.mi.domain.Comment;
import com.mi.util.DBCPUtil;

public class CommentDaoImpl {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

	public List<Comment> findAllComment(int pid) {
		try {
			return qr.query("select * from comment where pid=?", new BeanListHandler<Comment>(Comment.class), pid);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


	public void deleteComment(int cid) {
		try {
			String sql = "delete from comment where cid=?";
			qr.update(sql, cid);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		
	}
 
}
