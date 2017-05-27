package com.guanyiyun.api.response;

/**
 * 管易订单新增响应
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderAddResponse extends GuanyiBaseResponse {

	private static final long serialVersionUID = -1484605413292296343L;

	/** 订单id */
	private String id;
	/** 单据编号 */
	private String code;
	/** 创建时间 */
	private String created;

	/**
	 * 获取订单id
	 * @return id 订单id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置订单id
	 * @param id 订单id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取单据编号
	 * @return code 单据编号
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置单据编号
	 * @param code 单据编号
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取创建时间
	 * @return created 创建时间
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * 设置创建时间
	 * @param created 创建时间
	 */
	public void setCreated(String created) {
		this.created = created;
	}

}
