package com.guanyiyun.api.request;

import com.guanyiyun.api.response.GuanyiOrderRefundStatusUpdateResponse;

/**
 * 管易退款状态更新接口请求
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderRefundStatusUpdateRequest extends GuanyiBaseRequest<GuanyiOrderRefundStatusUpdateResponse> {

	private static final long serialVersionUID = 6356229358324815996L;

	/** 管易订单退款状态修改接口方法名称 */
	public final static String METHOD = "gy.erp.trade.refund.update";

	/** 平台单号 */
	private String tid;
	/** 子订单号 */
	private String oid;
	/** 退款状态；0、取消退款 1、标识退款 */
	private Integer refund_state;

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
	 * 获取子订单号  
	 * @return oid 子订单号  
	 */
	public String getOid() {
		return oid;
	}

	/**  
	 * 设置子订单号  
	 * @param oid 子订单号  
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}

	/**  
	 * 获取退款状态；0、取消退款1、标识退款  
	 * @return refund_state 退款状态；0、取消退款1、标识退款  
	 */
	public Integer getRefund_state() {
		return refund_state;
	}

	/**  
	 * 设置退款状态；0、取消退款1、标识退款  
	 * @param refund_state 退款状态；0、取消退款1、标识退款  
	 */
	public void setRefund_state(Integer refund_state) {
		this.refund_state = refund_state;
	}

}
