package com.base.vo.program;

import com.base.vo.common.AbstractModel;

/**
 * 每个音频文件的实体类
 */
public class ProgramVO extends AbstractModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8584844381752807218L;
	// 单个program唯一id
	private long programId;
	private long albumId;
	// program 名称
	private String programName;
	// Program封面图
	private String programCover;
	// mp3地址
	private String audioUrl;
	// 主播
	private String anchorName;
	private Long playNum;
	// program时长
	private long duration;
	// 文件大小
	private long fileSize;
	public long getProgramId() {
		return programId;
	}
	public void setProgramId(long programId) {
		this.programId = programId;
	}
	public long getAlbumId() {
		return albumId;
	}
	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramCover() {
		return programCover;
	}
	public void setProgramCover(String programCover) {
		this.programCover = programCover;
	}
	public String getAudioUrl() {
		return audioUrl;
	}
	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}
	public String getAnchorName() {
		return anchorName;
	}
	public void setAnchorName(String anchorName) {
		this.anchorName = anchorName;
	}
	public Long getPlayNum() {
		return playNum;
	}
	public void setPlayNum(Long playNum) {
		this.playNum = playNum;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (programId ^ (programId >>> 32));
		result = prime * result + ((programName == null) ? 0 : programName.hashCode());
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
		ProgramVO other = (ProgramVO) obj;
		if (programId != other.programId)
			return false;
		if (programName == null) {
			if (other.programName != null)
				return false;
		} else if (!programName.equals(other.programName))
			return false;
		return true;
	}




}
