package com.example.demo.bean;

import java.util.Date;

/**
 * 日报
 * 
 * @author 13413527259
 *
 */
public class Daily {

	private Date date; // 日期
	private String text_day; // 白天天气现象文字
	private Integer code_day; // 白天天气现象代码
	private String text_night; // 晚间天气现象文字
	private Integer code_night; // 晚间天气现象代码
	private double high; // 当天最高温度
	private double low; // 当天最低温度
	private double precip; // 降水概率，范围0~100，单位百分比
	private String wind_direction; // 风向文字
	private double wind_direction_degree; // 风向角度，范围0~360
	private double wind_speed; // 风速，单位km/h（当unit=c时）、mph（当unit=f时）
	private String wind_scale; // 风力等级

	public Daily(Date date, String text_day, Integer code_day, String text_night, Integer code_night, double high,
			double low, double precip, String wind_direction, double wind_direction_degree, double wind_speed,
			String wind_scale) {
		this.date = date;
		this.text_day = text_day;
		this.code_day = code_day;
		this.text_night = text_night;
		this.code_night = code_night;
		this.high = high;
		this.low = low;
		this.precip = precip;
		this.wind_direction = wind_direction;
		this.wind_direction_degree = wind_direction_degree;
		this.wind_speed = wind_speed;
		this.wind_scale = wind_scale;
	}

	public Daily() {
	}

	@Override
	public String toString() {
		return "Daily [date=" + date + ", text_day=" + text_day + ", code_day=" + code_day + ", text_night="
				+ text_night + ", code_night=" + code_night + ", high=" + high + ", low=" + low + ", precip=" + precip
				+ ", wind_direction=" + wind_direction + ", wind_direction_degree=" + wind_direction_degree
				+ ", wind_speed=" + wind_speed + ", wind_scale=" + wind_scale + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText_day() {
		return text_day;
	}

	public void setText_day(String text_day) {
		this.text_day = text_day;
	}

	public Integer getCode_day() {
		return code_day;
	}

	public void setCode_day(Integer code_day) {
		this.code_day = code_day;
	}

	public String getText_night() {
		return text_night;
	}

	public void setText_night(String text_night) {
		this.text_night = text_night;
	}

	public Integer getCode_night() {
		return code_night;
	}

	public void setCode_night(Integer code_night) {
		this.code_night = code_night;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getPrecip() {
		return precip;
	}

	public void setPrecip(double precip) {
		this.precip = precip;
	}

	public String getWind_direction() {
		return wind_direction;
	}

	public void setWind_direction(String wind_direction) {
		this.wind_direction = wind_direction;
	}

	public double getWind_direction_degree() {
		return wind_direction_degree;
	}

	public void setWind_direction_degree(double wind_direction_degree) {
		this.wind_direction_degree = wind_direction_degree;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public String getWind_scale() {
		return wind_scale;
	}

	public void setWind_scale(String wind_scale) {
		this.wind_scale = wind_scale;
	}

}
