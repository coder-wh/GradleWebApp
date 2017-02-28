package com.base.vo.album;

import java.util.List;

import com.base.vo.common.BaseResult;

/**
 * album集合
 */
public class AlbumListResult extends BaseResult {
  
    private List<AlbumVO> albumList;


    public List<AlbumVO> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<AlbumVO> albumList) {
        this.albumList = albumList;
    }

}
