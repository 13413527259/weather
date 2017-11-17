package com.example.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiUtil {
	
	private static String WEATHER_URL = "https://api.seniverse.com/v3/weather/daily.json";
	
	private static String LOCATION_URL="https://api.seniverse.com/v3/location/search.json";
	
	private static String LIFE_URL="https://api.seniverse.com/v3/life/suggestion.json";

	private static String API_KEY = "8xpdyjgfcizdqyuc"; 

	/**
	 * 查询天气
	 * @param location
	 * 要查询的城市
	 * @return
	 * 封装的API
	 * @throws Exception
	 */
	public static String getWeatherDailyURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=WEATHER_URL+"?key="+API_KEY+"&location="+encode;
		return result;
	}
	/**
	 * 查询城市
	 * @param location
	 * 要查询城市的关键字：广州/gz/guangzhou
	 * @return
	 * 封装的API
	 * @throws Exception
	 */
	public static String getLocationURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=LOCATION_URL+"?key="+API_KEY+"&q="+encode;
		return result;
	}
	/**
	 * 查询生活指数
	 * @param location
	 * 要查询的城市
	 * @return
	 * 封装的API
	 * @throws Exception
	 */
	public static String getLifeURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=LIFE_URL+"?key="+API_KEY+"&location="+encode;
		return result;
	}
	/**
	 * 根据API获取内容
	 * @param api
	 * 要查询的API
	 * @return
	 * 结果集
	 * @throws Exception
	 */
	public static String getContent(String api) throws Exception {
		URL url = new URL(api);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
        conn.connect();
        BufferedReader br=null;
        if (conn.getResponseCode()!=HttpURLConnection.HTTP_OK) {
//        	throw new Exception("获取内容时发生错误");
        	br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}else {
			br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}
		StringBuffer result =new StringBuffer();
		String line="";
		while ((line=br.readLine())!=null) {
			result.append(line);
		}
		return result.toString();
	}

}
