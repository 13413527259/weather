package com.example.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HttpUtil {
	
	private static String WEATHER_URL = "https://api.seniverse.com/v3/weather/daily.json";
	
	private static String LOCATION_URL="https://api.seniverse.com/v3/location/search.json";
	
	private static String LIFE_URL="https://api.seniverse.com/v3/life/suggestion.json";

	private static String API_KEY = "8xpdyjgfcizdqyuc"; 

	/**
	 * 查询天气
	 * @param location
	 * 要查询的城市
	 * @return
	 * 天气日报JSON
	 * @throws Exception
	 */
	public static String getWeatherDailyURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=WEATHER_URL+"?key="+API_KEY+"&location="+encode;
		return result;
	}
	
	public static String getLocationURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=LOCATION_URL+"?key="+API_KEY+"&q="+encode;
		return result;
	}
	
	public static String getLifeURL(String location) throws Exception {
		String encode=URLEncoder.encode(location, "utf-8");
		String result=LIFE_URL+"?key="+API_KEY+"&location="+encode;
		return result;
	}
	
	public static String getContent(String path) throws Exception {
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
		BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer result =new StringBuffer();
		String line="";
		while ((line=br.readLine())!=null) {
			result.append(line);
		}
		System.out.println(result);
		return result.toString();
	}
	
	public static void main(String[] args) throws Exception {
//		HttpUtil.getContent(HttpUtil.getWeatherDailyURL("广州"));
//		HttpUtil.getContent(HttpUtil.getLocationURL("gz"));
		getContent(getLifeURL("广州"));
	}

}
