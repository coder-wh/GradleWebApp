package com.base.vo.statistic;

import com.base.vo.common.BaseResult;

public class StatisticResult extends BaseResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1379971119076215717L;
	
	private long localDiskSize;
	private long localDiskSizeInBytes;
	private String localDiskSizeInGB;
	private long localHeapSize;
	private long localHeapSizeInBytes;
	private String localHeapSizeInGB;
	private String albumCacheSize;
	public String getAlbumCacheSize() {
		return albumCacheSize;
	}
	public void setAlbumCacheSize(Long albumCacheSize) {
		this.albumCacheSize = getPrintSize(albumCacheSize);
	}
	public String getLocalDiskSizeInGB() {
		return localDiskSizeInGB;
	}
	public void setLocalDiskSizeInGB(String localDiskSizeInGB) {
		this.localDiskSizeInGB = localDiskSizeInGB;
	}
	public String getLocalHeapSizeInGB() {
		return localHeapSizeInGB;
	}
	public void setLocalHeapSizeInGB(String localHeapSizeInGB) {
		this.localHeapSizeInGB = localHeapSizeInGB;
	}
	public long getLocalDiskSizeInBytes() {
		return localDiskSizeInBytes;
	}
	public void setLocalDiskSizeInBytes(long localDiskSizeInBytes) {
		this.localDiskSizeInBytes = localDiskSizeInBytes;
		setLocalDiskSizeInGB(getPrintSize(localDiskSizeInBytes));
	}
	public long getLocalHeapSizeInBytes() {
		return localHeapSizeInBytes;
	}
	public void setLocalHeapSizeInBytes(long localHeapSizeInBytes) {
		this.localHeapSizeInBytes = localHeapSizeInBytes;
		setLocalHeapSizeInGB(getPrintSize(localHeapSizeInBytes));
	}
	private long localSize;
	public long getLocalDiskSize() {
		return localDiskSize;
	}
	public void setLocalDiskSize(long localDiskSize) {
		this.localDiskSize = localDiskSize;
	}
	public long getLocalHeapSize() {
		return localHeapSize;
	}
	public void setLocalHeapSize(long localHeapSize) {
		this.localHeapSize = localHeapSize;
	}
	public long getLocalSize() {
		return localSize;
	}
	public void setLocalSize(long localSize) {
		this.localSize = localSize;
	}
	
	public static String getPrintSize(long size) {
		//如果字节数少于1024，则直接以B为单位，否则先除于1024，后3位因太少无意义
		if (size < 1024) {
			return String.valueOf(size) + "B";
		} else {
			size = size / 1024;
		}
		//如果原字节数除于1024之后，少于1024，则可以直接以KB作为单位
		//因为还没有到达要使用另一个单位的时候
		//接下去以此类推
		if (size < 1024) {
			return String.valueOf(size) + "KB";
		} else {
			size = size / 1024;
		}
		if (size < 1024) {
			//因为如果以MB为单位的话，要保留最后1位小数，
			//因此，把此数乘以100之后再取余
			size = size * 100;
			return String.valueOf((size / 100)) + "."
					+ String.valueOf((size % 100)) + "MB";
		} else {
			//否则如果要以GB为单位的，先除于1024再作同样的处理
			size = size * 100 / 1024;
			return String.valueOf((size / 100)) + "."
					+ String.valueOf((size % 100)) + "GB";
		}
	}
}
