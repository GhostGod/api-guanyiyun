package com.guanyiyun.api.request;

import com.guanyiyun.api.response.GuanyiOrderMemoUpdateResponse;

/**
 * 管易备注更新请求（二次备注）
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderMemoUpdateRequest extends GuanyiBaseRequest<GuanyiOrderMemoUpdateResponse> {

	private static final long serialVersionUID = -3584479351903406042L;

	/** 管易更新订单备注接口方法名称 */
	public final static String METHOD = "gy.erp.trade.memo.update";

	/** 平台单号 */
	private String tid;
	/** 备注 */
	private String memo;

	@Override
	public String getMethod() {
		return METHOD;
	}

	/**  
	 * 获取平台单号  
	 * @return tid 平台单号  
	 */
	public String getTid() {
		return tid;
	}

	/**  
	 * 设置平台单号  
	 * @param tid 平台单号  
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}

	/**  
	 * 获取备注  
	 * @return memo 备注  
	 */
	public String getMemo() {
		return memo;
	}

	/**  
	 * 设置备注  
	 * @param memo 备注  
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
