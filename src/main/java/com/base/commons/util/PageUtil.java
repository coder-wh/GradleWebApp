package com.base.commons.util;

import java.util.Collections;
import java.util.List;

public class PageUtil {
	public static void main(String[] args) {
	
	}
	/**
	 * @param <T>
	
	 */
	
	public static final Integer DESC=1;
	public static final Integer ASC=0;
	
	public static <T> List<T> subPage(List<T> list, Integer no,Integer size) {
		
		return subPage(list,no,size,ASC);
		
	}
	
	public static <T> List<T> subPage(List<T> list, Integer no,Integer size,Integer type) {
		if(list==null){
			return null;
		}
		if(type!=null && type==DESC){
			Collections.reverse(list);
		}
		int pageNo = no==null?1:no;
		int pageSize =size==null?20:size;
		
		int pageBegin=(pageNo-1)*pageSize;
		if(pageBegin>=list.size()){
			return null;
		}
		int pageEnd=0;
		if(list.size()<(pageNo)*pageSize){
			pageEnd=list.size();
		}else{
			pageEnd=(pageNo)*pageSize;
		}
		List<T> l=list.subList(pageBegin, pageEnd);
		return l;
	
	}

}
