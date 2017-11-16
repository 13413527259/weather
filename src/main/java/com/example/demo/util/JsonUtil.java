package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.Daily;
import com.example.demo.bean.Location;

/**
 * JSON字符串转化为对象工具类
 * @author 13413527259
 *
 */
public class JsonUtil {

	/**
	 * 转化为List
	 * @param jsonStr
	 * JSON字符
	 * @param clazz
	 * 要转化的对象
	 * @return
	 * 对象的集合
	 * @throws Exception
	 * 未处理的对象
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List jsonToList(String jsonStr,Class clazz) throws Exception {
		List list=null;
		if (clazz.isAssignableFrom(Daily.class)) {
			list=new ArrayList<Daily>();
			JSONObject results=JSONObject.parseObject(jsonStr).getJSONArray("results").getJSONObject(0);
			JSONArray dailys=results.getJSONArray("daily");
			for (int i = 0; i < dailys.size(); i++) {
				list.add(dailys.getObject(i, clazz));
				System.out.println(list.get(i));
			}
		}else if (clazz.isAssignableFrom(Location.class)) {
			list=new ArrayList<Location>();
			JSONArray results=JSONObject.parseObject(jsonStr).getJSONArray("results");
			for (int i = 0; i < results.size(); i++) {
				list.add(results.getObject(i, clazz));
			}
		}else {
			throw new Exception();
		}
		return list;
	}

}
