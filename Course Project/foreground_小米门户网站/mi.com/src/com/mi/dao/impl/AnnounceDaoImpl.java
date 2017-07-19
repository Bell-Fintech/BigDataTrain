package com.mi.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mi.Exception.DaoException;
import com.mi.domain.Announce;
import com.mi.util.DBCPUtil;

public class AnnounceDaoImpl  {
	private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
	
	public List<Announce> findAllAnnounce() {
		try {
			String sql = "select * from announce";
			return qr.query(sql, new BeanListHandler<Announce>(Announce.class));
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


	public void addAnnounce(Announce announce) {
		try {
			String sql = "insert into announce (aid,acontent,acontenttime) values(?,?,?)";
			Object params[] = { announce.getAid(),announce.getAcontent(),announce.getAcontenttime() };
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


	public Announce findAnnounceById(int aid) {
		try {
			return qr.query("select * from announce where aid=?", new BeanHandler<Announce>(Announce.class), aid);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	public void updateAnnounce(Announce announce) {
		try {
			String sql = "update announce set acontent=?,acontenttime=? where aid=?";
			 Object params[] = {announce.getAcontent(),announce.getAcontenttime(),announce.getAid()};
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}


	public void deleteAnnounce(int aid) {
		try {
			String sql = "delete from announce where aid=?";
			qr.update(sql, aid);
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

}
