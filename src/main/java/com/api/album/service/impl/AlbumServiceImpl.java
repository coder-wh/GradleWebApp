package com.api.album.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.api.album.service.IAlbumService;
import com.base.cache.CacheManager;
import com.base.cache.CacheManagerTOT;
import com.base.cache.album.AlbumCache;
import com.base.vo.album.AlbumVO;
import com.base.vo.program.ProgramVO;
import com.base.vo.tag.TagVO;

@Service
public class AlbumServiceImpl implements IAlbumService{
	private final String keyPrefix = "local_cache_album_id_";
	
//	@Resource(name="cManagerTOT")
//	private CacheManagerTOT cManager;
	
	@Resource(name="cManager")
	private CacheManager cManager;
	
	@Override
	public void setAlbumCache(int albumNum) {
		// TODO Auto-generated method stub
		System.out.println("Service-----"+cManager);
		for (int i = 0; i < albumNum; i++) {
			AlbumCache c = getCache(i);
			cManager.setLocalCache(keyPrefix+i, c);
			System.out.println(keyPrefix+i+"====="+c);
		}
	}
	
	@Override
	public void setAlbumCacheById(int albumId){
		System.out.println("Service-----"+cManager);
		AlbumCache c = getCache(albumId);
		cManager.setLocalCache(keyPrefix+albumId, c);
		System.out.println(keyPrefix+albumId+"====="+c);
	}
	
	@Override
	public int getTotalEntries(){
		return cManager.getTotalEntries();
	}
	@Override
	public long getElementSize(int albumId){
		String key = keyPrefix+albumId;
		return cManager.getElementSize(key);
	}

	private static AlbumCache getCache(int j) {
		AlbumCache c = new AlbumCache();

		// 封装vo
		AlbumVO albumVo = new AlbumVO();
		albumVo.setAlbumId(j);
		albumVo.setAlbumType(1);
		albumVo.setAlbumName("但是风格谁的风格");
		albumVo.setAuthor("反跟");
		albumVo.setSummary("但是风格");
		albumVo.setPlayStatus("21");
		albumVo.setTags("21,15,12");
		List<TagVO> list = new ArrayList<>();
		TagVO tag = new TagVO();
		tag.setChannelId(51);
		tag.setTagId(21);
		tag.setTagName("谁加的，没名");
		list.add(tag);
		list.add(tag);
		list.add(tag);
		albumVo.setTagList(list);
		albumVo.setAlbumCover(
				"http://192.168.2.195/res/upload/cdn/kting_huawei_fm/cmsProgram123456/cover/album/20161229/23kf8qr9.jpg"+j);
		albumVo.setChannelId(52);
		albumVo.setRssCount(1000000L);
		albumVo.setProgramNum(3000);

		// 封装programList
		List<ProgramVO> plist = new ArrayList<>();
		for (int i = 0; i < 3000; i++) {
			ProgramVO pro = new ProgramVO();
			pro.setProgramId(i);
			pro.setAlbumId(12L);
			pro.setProgramName("阿德法大赛");
			pro.setProgramCover(
					"http://192.168.2.195/res/upload/cdn/kting_huawei_fm/cmsProgram123456/cover/program/20161206/21rkif1i.jpg_"+j+"_"+i);
			pro.setAudioUrl("http://192.168.2.195/res/upload/cdn/kting_huawei_fm/audio/convert/20161206/21rkmfgu.mp3_"+j+"_"+i);
			pro.setAnchorName("阿德法大赛");
			pro.setPlayNum(1000000L);
			pro.setDuration(169700L);
			pro.setFileSize(1358283L);
			plist.add(pro);
		}

		c.setAlbumVO(albumVo);
		c.setProgramListVO(plist);

		return c;
	}
}
