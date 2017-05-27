package com.guanyiyun.api.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.guanyiyun.api.GuanyiConfig;
import com.guanyiyun.api.GuanyiUtil;
import com.guanyiyun.api.response.GuanyiBaseResponse;

/**
 * 管易接口系统级参数
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public abstract class GuanyiBaseRequest<T extends GuanyiBaseResponse> implements Serializable {

	private static final long serialVersionUID = 7605222711634460524L;

	private static final Logger logger = Logger.getLogger(GuanyiBaseRequest.class);

	/** 租户appkey */
	private static String appkey = GuanyiConfig.APP_KEY;
	/** 租户sessionkey */
	private static String sessionkey = GuanyiConfig.SESSION_KEY;
	/** 接口名称 */
	protected String method;
	/** 签名 */
	private String sign;

	/**  
	 * 获取租户appkey  
	 * @return appkey 租户appkey  
	 */
	public String getAppkey() {
		return appkey;
	}

	/**  
	 * 获取租户sessionkey  
	 * @return sessionkey 租户sessionkey  
	 */
	public String getSessionkey() {
		return sessionkey;
	}

	/**  
	 * 获取接口名称  
	 * @return method 接口名称  
	 */
	public abstract String getMethod();

	/**  
	 * 获取签名  
	 * @return sign 签名  
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * 生成签名，一定要在所有参数赋值之后调用
	 */
	private void generateSign() {
		String json = JSON.toJSONString(this);
		String sign = GuanyiUtil.sign(json, GuanyiConfig.SECRET);
		this.sign = sign;
	}

	/**
	 * 发起请求
	 * @return
	 */
	public String execute() {
		//生成签名
		this.generateSign();
		String json = JSON.toJSONString(this);
		//定义请求头
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json;charset=UTF-8");
		//调用管易新增订单接口
		String response = GuanyiUtil.post(GuanyiConfig.URL, json, headers);
		logger.info(response);
		return response;
	}

	/**
	 * 发起请求
	 * @param clazz 结果类型
	 * @return
	 */
	public T execute(Class<T> clazz) {
		String response = execute();
		T t = JSON.parseObject(response, clazz);
		return t;
	}

}
