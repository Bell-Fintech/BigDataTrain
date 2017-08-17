package zd.model;

import java.util.Date;

public class User {
	private int id;
	private String account;
	private String password;
	private String nickname;
	private Date bdString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBdString() {
		return bdString;
	}
	public void setBdString(Date bdString) {
		this.bdString = bdString;
	}
	public User(int id, String account, String password, String nickname, Date bdString) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.nickname = nickname;
		this.bdString = bdString;
	}
	
	
}
