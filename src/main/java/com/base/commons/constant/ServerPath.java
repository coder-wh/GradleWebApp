package com.base.commons.constant;

public class ServerPath {
	/* 服务器地址 */

	public String getAlbumById ;
	public String getAlbumListByChannelId ;
	public String getHomePage;
	public String getSubjectById;
	public String getSubjectList;
	
	public String getRankByType;
	public String getRankMap;
	

	ServerPath(String ServerUrl) {
		getAlbumById = ServerUrl + "/service/updateAlbumById";
		getAlbumListByChannelId = ServerUrl + "/service/updateAlbumListByChannelId";
		getHomePage = ServerUrl + "/service/updateHomePage";
		
		getSubjectList= ServerUrl + "/service/updateSubjectList";
		getSubjectById= ServerUrl + "/service/updateSubjectById";
		
		getRankByType= ServerUrl + "/service/updateRankByType";
		getRankMap= ServerUrl + "/service/updateRankMap";
		
	}

}
