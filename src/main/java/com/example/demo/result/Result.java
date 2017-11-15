package com.example.demo.result;

/**
 * 返回结果集
 * 
 * @author 13413527259
 *
 * @param <T>
 */
public class Result<T> {

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + ", date=" + data + "]";
	}

	/** 错误码 */
	private Integer status;
	/** 错误信息 */
	private String message;
	/** 具体内容 */
	private T data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getDate() {
		return data;
	}

	public void setDate(T date) {
		this.data = date;
	}

	public Result() {
	}

}
