/*
 ---------------------------------------------------------
 Author     : alex
 ---------------------------------------------------------
 */

package com.base.cache;

public class CacheNameGenerator {
	private final static String prefix = "Cache_kting_huawei_fm";

	public static String genHomePageCacheKey() {
		return prefix + "_home_page_cache";
	}
	public static String genSubjectCacheKey(long subjectId) {
		return prefix + "_subject_cache_" + subjectId;
	}
	public static String genSubjectListCacheKey() {
		return prefix + "_subject_list_cache";
	}
	public static String genAlbumCacheKey(long albumId) {
		return prefix + "_album_" + albumId;
	}
	public static String genProgramCacheKey(long programId) {
		return prefix + "_program_" + programId;
	}
	public static String genAlbumListCacheKey(int id) {
		return prefix + "_album_list_category_" + id;
	}

	public static String genRankCacheKey(int rankType) {
		return prefix + "_rank_cache_" + rankType;
	}
	public static String genRankMapCacheKey() {
		return prefix + "_rank_map_cache";
	}

	public static String genAlbumStatNumCacheKey(long albumId) {
		// 保存专辑的播放量,hash结构
		// album_play : num
		// album_rss : num
		// programId_+{programId} : num
		return prefix + "_album_stat_num_hash_" + albumId;
	}
	public static String genAlbumStatPlayNumHashKey = "album_play";
	public static String genAlbumStatRssNumHashKey = "album_rss";
	public static String genAlbumStatProgramPlayNumHashKey(long programId) {
		// 保存专辑的播放量,hash结构
		// album_play : num
		// album_rss : num
		// programId_+{programId} : num
		return "programId+" + programId;
	}

	
	//-----------------------------
	public static String genUserHuaweiIdHashKey = "huawei_id";
	public static String genUserCuidIdHashKey = "cuid";
	public static String genUserRssNumHashKey(long albumId) {
		// 保存专辑的播放量,hash结构
		//huawei_id:id
		//cuid:id
		//rss_json:json
		return "rss_" + albumId;
	}
	public static String genUserCacheKey(String id) {
		// 保存专辑的播放量,hash结构
		//huawei_id:id
		//cuid:id
		//rss_json:json
		return prefix + "_user_info_" + id;
	}
	
	//-----------------------------
	public static String genUserRssKey(String id) {
		// 保存用户订阅专辑列表,list结构
		return prefix + "_user_rss_" + id;
	}
	public static String genRssUserKey(long albumId) {
		// 保存专辑被用户订阅的set,set结构
		return prefix + "_rss_user_" + albumId;
	}
}
