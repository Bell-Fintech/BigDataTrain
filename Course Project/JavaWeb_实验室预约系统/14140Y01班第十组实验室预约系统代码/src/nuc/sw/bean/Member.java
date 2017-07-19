package nuc.sw.bean;

public class Member {
	public static final int PAGE_SIZE=1;//Ã¿Ò³¼ÇÂ¼Êý
	private String username;
	private String password;
	private String  dept;
	private String  name;
	private String  week;
	private String  day;
	private String  time;
	private String  sbook;
	public static int getPageSize() {
		return PAGE_SIZE;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time= time;
	}
	public String getSbook() {
		return sbook;
	}
	public void setSbook(String sbook) {
		this.sbook= sbook;
	}
	
	
	
}
