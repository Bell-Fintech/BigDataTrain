package com.eems.util;

public class PageUtil {
	private int pageSize;//页面大小
	private int totalCount;//全部记录数
	private int currentPage;//当前页面
	private int totalPage;//总共页面数
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage=totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize+1);
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
}
