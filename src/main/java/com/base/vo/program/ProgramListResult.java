package com.base.vo.program;

import java.util.List;

import com.base.vo.common.BaseResult;

public class ProgramListResult extends BaseResult {


	private List<ProgramVO> pageList;
	private int total;
	public List<ProgramVO> getPageList() {
		return pageList;
	}
	public void setPageList(List<ProgramVO> pageList) {
		this.pageList = pageList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

	


}
