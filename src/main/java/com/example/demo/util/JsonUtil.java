package com.example.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.Daily;
import com.example.demo.bean.Location;

public class JsonUtil {
	
	public static void jsonToDaily(String str) {
		JSONObject results=JSONObject.parseObject(str).getJSONArray("results").getJSONObject(0);
		JSONArray dailys=results.getJSONArray("daily");
		for (Object object : dailys) {
			Daily daily = JSONObject.toJavaObject((JSONObject)object, Daily.class);
			System.out.println(daily.toString());
		}
	}
	
	public static void jsonToLocation(String str) {
		JSONArray results=JSONObject.parseObject(str).getJSONArray("results");
		for (Object object : results) {
			Location location=JSONObject.toJavaObject((JSONObject)object, Location.class);
			System.out.println(location.toString());
		}
	}

	public static void main(String[] args) throws Exception {
		jsonToDaily(HttpUtil.getContent(HttpUtil.getWeatherDailyURL("广州")));
//		jsonToLocation(HttpUtil.getContent(HttpUtil.getLocationURL("gz")));
	}
}
