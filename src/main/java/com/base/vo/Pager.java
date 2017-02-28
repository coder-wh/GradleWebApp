package com.base.vo;

import java.util.List;

public class Pager<V> {
	// 总记录数
	private int total;
	// 每页显示的具体内容
	private List<V> pageList;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<V> getPageList() {
		return pageList;
	}
	public void setPageList(List<V> pageList) {
		this.pageList = pageList;
	}
	
	
	
	
}
