package com.base.commons.constant;

import java.util.HashMap;
import java.util.Map;

public class CodeTable {

	public static final int DefaultPageSize=20;
	
	public static final Map<String, String> CodeMap = new HashMap<String, String>();
	static {
		CodeMap.put("0", "删除");
		CodeMap.put("1", "可用");

		CodeMap.put("2", "禁用");
		CodeMap.put("3", "下线");
		CodeMap.put("4", "上线");



		CodeMap.put("11", "有声书");
		CodeMap.put("12", "栏目");

		
		CodeMap.put("21", "连载");
		CodeMap.put("22", "完本");
		
		CodeMap.put("31", "最受欢迎");
		CodeMap.put("32", "人气电台");
		CodeMap.put("33", "24小时最热");
		CodeMap.put("34", "分享最多");
		
		CodeMap.put("51", "音乐故事");
		CodeMap.put("52", "情感");
		CodeMap.put("53", "相声评书");
		CodeMap.put("54", "脱口秀");
		CodeMap.put("55", "广播剧");
		CodeMap.put("56", "旅游");
		CodeMap.put("57", "综艺娱乐");
		CodeMap.put("58", "少儿读物");
		
		CodeMap.put("59", "惊悚悬疑");
		CodeMap.put("60", "言情");
		CodeMap.put("61", "玄幻奇幻");
		CodeMap.put("62", "畅销小说");
		CodeMap.put("63", "都市");
		CodeMap.put("64", "武侠仙侠");
		CodeMap.put("65", "商业财经");
		CodeMap.put("66", "人文社科");
		
		CodeMap.put("71", "小编推荐");
		CodeMap.put("72", "最爱听");
		CodeMap.put("73", "最新鲜");
		CodeMap.put("74", "专题");
		CodeMap.put("75", "音乐故事");
		CodeMap.put("76", "情感");
		CodeMap.put("77", "畅销小说");
		
		
		CodeMap.put("100", "无法播放，无故暂停");
		CodeMap.put("101", "节目含有欺诈、反动、色情内容");
		CodeMap.put("102", "章节不完整，集数排序错误");
		CodeMap.put("103", "音质太差");
		
		
		

	}

}