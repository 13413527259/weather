package com.example.demo.bean;

public class Location {
	
	private String id; //城市ID
	private String name;//城市名称
	private String     country;//国家代码
	private String     path; //隶属层级，从小到大
	private String     timezone; //IANA标准时区名称（该名称不受夏令时影响）
	private String     timezone_offset; //相对于UTC时区的偏移量（采用夏令时的城市会因夏令时而变化）
	public Location(String id, String name, String country, String path, String timezone, String timezone_offset) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.path = path;
		this.timezone = timezone;
		this.timezone_offset = timezone_offset;
	}
	public Location() {
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", country=" + country + ", path=" + path + ", timezone="
				+ timezone + ", timezone_offset=" + timezone_offset + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTimezone_offset() {
		return timezone_offset;
	}
	public void setTimezone_offset(String timezone_offset) {
		this.timezone_offset = timezone_offset;
	}
	
	

}
