package com.base.vo.tag;

import com.base.vo.common.AbstractModel;

/**
 * 
 * @author alex 标签(cms_tag)
 */
public class TagVO extends AbstractModel{

	private int tagId; // 标签ID
	private String tagName; // 标签名字
	private int channelId; // 频道ID
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}


}
