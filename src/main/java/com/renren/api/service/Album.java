/**
 * Autogenerated by renren-api2-generator 2013-06-06 15:02:04
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.renren.api.service;
import java.util.*;
/**
 *
 * 相册
 */
public class Album {
	
	/**
	 * 相册的ID
	 */
	private long id;
	/**
	 * 相册的类型
	 */
	private AlbumType type;
	/**
	 * 相册的封面
	 */
	private List<Image> cover;
	/**
	 * 相册的名字
	 */
	private String name;
	/**
	 * 相册的描述
	 */
	private String description;
	/**
	 * 相册的创建时间
	 */
	private String createTime;
	/**
	 * 相册的最后更新时间，最后上传照片至这个相册的时间
	 */
	private String lastModifyTime;
	/**
	 * 相册拍摄的地点
	 */
	private String location;
	/**
	 * 相册中的照片数
	 */
	private int photoCount;
	/**
	 * 相册的访问控制
	 */
	private AccessControl accessControl;
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return this.id;
	}
	public void setType(AlbumType type) {
		this.type = type;
	}
	public AlbumType getType() {
		return this.type;
	}
	public void setCover(List<Image> cover) {
		this.cover = cover;
	}
	public List<Image> getCover() {
		return this.cover;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime() {
		return this.createTime;
	}
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getLastModifyTime() {
		return this.lastModifyTime;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return this.location;
	}
	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}
	public int getPhotoCount() {
		return this.photoCount;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	public AccessControl getAccessControl() {
		return this.accessControl;
	}
}
