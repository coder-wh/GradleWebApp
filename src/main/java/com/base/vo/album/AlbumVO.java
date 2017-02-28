package com.base.vo.album;

import java.util.List;

import com.base.vo.common.AbstractModel;
import com.base.vo.program.ProgramVO;
import com.base.vo.tag.TagVO;

/**
 * @author alex
 *
 */
public class AlbumVO extends AbstractModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1576123289408183792L;
	private List<ProgramVO> programList;
	private int programNum;

	// album唯一id
		private long albumId;

		// 类型 1为有声书 2为电台
		private int albumType;

		// album名称
		private String albumName;

		// 作者
		private String author;

		// 简介
		private String summary;

		// 是否完结
		private String playStatus;
		private String tags;
		// 分类tag
		private List<TagVO> tagList;
		// 封面图
		private String albumCover;
		
		private int channelId;
		
		
		private long rssCount;

		public long getAlbumId() {
			return albumId;
		}

		public void setAlbumId(long albumId) {
			this.albumId = albumId;
		}

		public int getAlbumType() {
			return albumType;
		}

		public void setAlbumType(int albumType) {
			this.albumType = albumType;
		}

		public String getAlbumName() {
			return albumName;
		}

		public void setAlbumName(String albumName) {
			this.albumName = albumName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getPlayStatus() {
			return playStatus;
		}

		public void setPlayStatus(String playStatus) {
			this.playStatus = playStatus;
		}

		public String getTags() {
			return tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getAlbumCover() {
			return albumCover;
		}

		public void setAlbumCover(String albumCover) {
			this.albumCover = albumCover;
		}

		public int getChannelId() {
			return channelId;
		}

		public void setChannelId(int channelId) {
			this.channelId = channelId;
		}

		public List<TagVO> getTagList() {
			return tagList;
		}

		public void setTagList(List<TagVO> tagList) {
			this.tagList = tagList;
		}

		public List<ProgramVO> getProgramList() {
			return programList;
		}

		public void setProgramList(List<ProgramVO> programList) {
			this.programList = programList;
		}

		public int getProgramNum() {
			return programNum;
		}

		public void setProgramNum(int programNum) {
			this.programNum = programNum;
		}

		public long getRssCount() {
			return rssCount;
		}

		public void setRssCount(long rssCount) {
			this.rssCount = rssCount;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (albumId ^ (albumId >>> 32));
			result = prime * result + ((albumName == null) ? 0 : albumName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AlbumVO other = (AlbumVO) obj;
			if (albumId != other.albumId)
				return false;
			if (albumName == null) {
				if (other.albumName != null)
					return false;
			} else if (!albumName.equals(other.albumName))
				return false;
			return true;
		}
	
}
