package com.test;
/*package com.kting.huawei.fm.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kting.huawei.fm.base.cache.CacheManager;
import com.kting.huawei.fm.base.cache.album.AlbumCache;
import com.kting.huawei.fm.base.commons.util.SizeOfObject;
import com.kting.huawei.fm.base.vo.album.AlbumVO;
import com.kting.huawei.fm.base.vo.program.ProgramVO;
import com.kting.huawei.fm.base.vo.tag.TagVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:app*.xml","classpath*:spring-servlet.xml"})
public class JCacheMemory {
	private final static String keyPrefix = "local_cache_album_id_";

	@Resource
	private  CacheManager cManager;
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		AlbumCache c = getCache();
		for (int i = 0; i < 10000; i++) {
			cManager.setLocalCache(keyPrefix+i, c);
			System.out.println(keyPrefix+i);
		}
		try {
			System.out.println(SizeOfObject.fullSizeOf(c));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static AlbumCache getCache() {
		AlbumCache c = new AlbumCache();

		// 封装vo
		AlbumVO albumVo = new AlbumVO();
		albumVo.setAlbumId(12L);
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
				"http://192.168.2.195/res/upload/cdn/kting_huawei_fm/cmsProgram123456/cover/album/20161229/23kf8qr9.jpg");
		albumVo.setChannelId(52);
		albumVo.setRssCount(1000000L);
		albumVo.setProgramNum(3000);

		// 封装programList
		ProgramVO pro = new ProgramVO();
		pro.setProgramId(36L);
		pro.setAlbumId(12L);
		pro.setProgramName("阿德法大赛");
		pro.setProgramCover(
				"http://192.168.2.195/res/upload/cdn/kting_huawei_fm/cmsProgram123456/cover/program/20161206/21rkif1i.jpg");
		pro.setAudioUrl("http://192.168.2.195/res/upload/cdn/kting_huawei_fm/audio/convert/20161206/21rkmfgu.mp3");
		pro.setAnchorName("阿德法大赛");
		pro.setPlayNum(1000000L);
		pro.setDuration(169700L);
		pro.setFileSize(1358283L);
		List<ProgramVO> plist = new ArrayList<>();
		for (int i = 0; i < 3000; i++) {
			plist.add(pro);
		}

		c.setAlbumVO(albumVo);
		c.setProgramListVO(plist);

		return c;
	}
}
*/