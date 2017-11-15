package com.example.demo.util;

import com.example.demo.result.Result;

/**
 * 结果集工具类
 * @author 13413527259
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ResultUtil {

	/**
	 * 返回正确结果
	 * @param object
	 * 结果集
	 * @return
	 */
	public static Result success(Object object) {
		Result result=new Result();
		result.setStatus(200);
		result.setMessage("success");
		result.setDate(object);
		return result;
	}
	
	public static Result success() {
		return success(null);
	}
	
	/**
	 * 返回错误结果
	 * @param code
	 * 错误码
	 * @param msg
	 * 错误信息
	 * @return
	 */
	public static Result error(Integer code,String msg) {
		Result result=new Result();
		result.setStatus(400);
		result.setMessage("error");
		return result;
	}
}
