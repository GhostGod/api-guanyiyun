package com.guanyiyun.api.response;

import java.io.Serializable;

/**
 * 管易响应参数
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiBaseResponse implements Serializable {

	private static final long serialVersionUID = -7775704314257535725L;

	/** 响应成功/响应失败 */
	private boolean success;
	/** 错误代码 */
	private String errorCode;
	/** 子错误代码 */
	private String subErrorCode;
	/** 错误描述 */
	private String errorDesc;
	/** 子错误描述 */
	private String subErrorDesc;
	/** 请求接口方法 */
	private String requestMethod;

	/**  
	 * 获取响应成功响应失败  
	 * @return success 响应成功响应失败  
	 */
	public boolean isSuccess() {
		return success;
	}

	/**  
	 * 设置响应成功响应失败  
	 * @param success 响应成功响应失败  
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**  
	 * 获取错误代码  
	 * @return errorCode 错误代码  
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**  
	 * 设置错误代码  
	 * @param errorCode 错误代码  
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**  
	 * 获取子错误代码  
	 * @return subErrorCode 子错误代码  
	 */
	public String getSubErrorCode() {
		return subErrorCode;
	}

	/**  
	 * 设置子错误代码  
	 * @param subErrorCode 子错误代码  
	 */
	public void setSubErrorCode(String subErrorCode) {
		this.subErrorCode = subErrorCode;
	}

	/**  
	 * 获取错误描述  
	 * @return errorDesc 错误描述  
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**  
	 * 设置错误描述  
	 * @param errorDesc 错误描述  
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	/**  
	 * 获取子错误描述  
	 * @return subErrorDesc 子错误描述  
	 */
	public String getSubErrorDesc() {
		return subErrorDesc;
	}

	/**  
	 * 设置子错误描述  
	 * @param subErrorDesc 子错误描述  
	 */
	public void setSubErrorDesc(String subErrorDesc) {
		this.subErrorDesc = subErrorDesc;
	}

	/**  
	 * 获取请求接口方法  
	 * @return requestMethod 请求接口方法  
	 */
	public String getRequestMethod() {
		return requestMethod;
	}

	/**  
	 * 设置请求接口方法  
	 * @param requestMethod 请求接口方法  
	 */
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GuanyiBaseResponse [success=" + success + ", errorCode=" + errorCode + ", subErrorCode=" + subErrorCode
				+ ", errorDesc=" + errorDesc + ", subErrorDesc=" + subErrorDesc + ", requestMethod=" + requestMethod
				+ "]";
	}

}
