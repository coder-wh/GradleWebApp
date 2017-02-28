package com.base.cache.album;

import java.util.List;

import com.base.vo.album.AlbumListVO;
import com.base.vo.album.AlbumVO;
import com.base.vo.common.AbstractModel;
import com.base.vo.program.ProgramVO;

/**
 * album集合
 */
public class AlbumCache extends AbstractModel {
  
    /**
	 * 
	 */
	private static final long serialVersionUID = -7064538713943798150L;
	private AlbumVO albumVO;
    private List<ProgramVO> programListVO;
    private List<AlbumListVO> albumListVO;
	public AlbumVO getAlbumVO() {
		return albumVO;
	}
	public void setAlbumVO(AlbumVO albumVO) {
		this.albumVO = albumVO;
	}
	public List<ProgramVO> getProgramListVO() {
		return programListVO;
	}
	public void setProgramListVO(List<ProgramVO> programListVO) {
		this.programListVO = programListVO;
	}
	public List<AlbumListVO> getAlbumListVO() {
		return albumListVO;
	}
	public void setAlbumListVO(List<AlbumListVO> albumListVO) {
		this.albumListVO = albumListVO;
	}


	

}
