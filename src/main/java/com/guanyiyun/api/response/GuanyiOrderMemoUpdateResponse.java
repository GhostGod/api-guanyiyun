package com.guanyiyun.api.response;
/**
 * 管易订单备注更新响应（二次备注）
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderMemoUpdateResponse extends GuanyiBaseResponse {

	private static final long serialVersionUID = 995889895164188385L;

	/** 平台单号 */
	private String platform_code;

	/**  
	 * 获取平台单号  
	 * @return platform_code 平台单号  
	 */
	public String getPlatform_code() {
		return platform_code;
	}

	/**  
	 * 设置平台单号  
	 * @param platform_code 平台单号  
	 */
	public void setPlatform_code(String platform_code) {
		this.platform_code = platform_code;
	}
	
}
