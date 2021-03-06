package com.hd123.wsw.core.utils;

public class PageUtil {
	private int rows;
	
	private int totalPage;
	
	public static int size = 8 ;//page.properties
	
	private int curPageNo;

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	} 

	public int getCurPageNo() {
		return curPageNo;
	}

	public void setCurPageNo(int curPageNo) {
		this.curPageNo = curPageNo;
	}

	public PageUtil() { 
	}
	 
	public PageUtil(int rows,int curPageNo) {
		this.rows = rows;
		this.totalPage = (int)(rows-1/size)+1;
		this.curPageNo = curPageNo;
	}
}
