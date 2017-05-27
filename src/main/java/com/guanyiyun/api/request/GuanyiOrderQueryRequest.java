package com.guanyiyun.api.request;

import java.util.Date;

import com.guanyiyun.api.response.GuanyiOrderQueryResponse;

/**
 * 管易订单查询请求
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderQueryRequest extends GuanyiBaseRequest<GuanyiOrderQueryResponse> {

	private static final long serialVersionUID = 7487871738892308796L;

	/** 管易更新订单备注接口方法名称 */
	private final static String METHOD = "gy.erp.trade.get";

	/** 页码 */
	private Integer page_no = 1;
	/** 每页大小 */
	private Integer page_size = 10;
	/** 开始时间 */
	private Date start_date;
	/** 结束时间 */
	private Date end_date;
	/** 时间类型；默认为0, 0、创建时间 1、拍单时间 2、付款时间 */
	private int date_type;
	/** 订单类型；默认为0, 0、全部 1、未审核 2、已审核*/
	private int order_state;
	/** 仓库代码 */
	private String warehouse_code;
	/** 店铺代码 */
	private String shop_code;
	/** 会员名称 */
	private String vip_name;
	/** 平台单号 */
	private String platform_code;
	/** 收件手机 */
	private String receiver_mobile;

	@Override
	public String getMethod() {
		return METHOD;
	}

	/**
	 * 获取页码
	 * @return page_no 页码
	 */
	public Integer getPage_no() {
		return page_no;
	}

	/**
	 * 设置页码
	 * @param page_no 页码
	 */
	public void setPage_no(Integer page_no) {
		this.page_no = page_no;
	}

	/**
	 * 获取每页大小
	 * @return page_size 每页大小
	 */
	public Integer getPage_size() {
		return page_size;
	}

	/**
	 * 设置每页大小
	 * @param page_size 每页大小
	 */
	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
	}

	/**
	 * 获取开始时间
	 * @return start_date 开始时间
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * 设置开始时间
	 * @param start_date 开始时间
	 */
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	/**
	 * 获取结束时间
	 * @return end_date 结束时间
	 */
	public Date getEnd_date() {
		return end_date;
	}

	/**
	 * 设置结束时间
	 * @param end_date 结束时间
	 */
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	/**
	 * 获取时间类型；默认为00、创建时间1、拍单时间2、付款时间
	 * @return date_type 时间类型；默认为00、创建时间1、拍单时间2、付款时间
	 */
	public int getDate_type() {
		return date_type;
	}

	/**
	 * 设置时间类型；默认为00、创建时间1、拍单时间2、付款时间
	 * @param date_type 时间类型；默认为00、创建时间1、拍单时间2、付款时间
	 */
	public void setDate_type(int date_type) {
		this.date_type = date_type;
	}

	/**
	 * 获取订单类型；默认为00、全部1、未审核2、已审核
	 * @return order_state 订单类型；默认为00、全部1、未审核2、已审核
	 */
	public int getOrder_state() {
		return order_state;
	}

	/**
	 * 设置订单类型；默认为00、全部1、未审核2、已审核
	 * @param order_state 订单类型；默认为00、全部1、未审核2、已审核
	 */
	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}

	/**
	 * 获取仓库代码
	 * @return warehouse_code 仓库代码
	 */
	public String getWarehouse_code() {
		return warehouse_code;
	}

	/**
	 * 设置仓库代码
	 * @param warehouse_code 仓库代码
	 */
	public void setWarehouse_code(String warehouse_code) {
		this.warehouse_code = warehouse_code;
	}

	/**
	 * 获取店铺代码
	 * @return shop_code 店铺代码
	 */
	public String getShop_code() {
		return shop_code;
	}

	/**
	 * 设置店铺代码
	 * @param shop_code 店铺代码
	 */
	public void setShop_code(String shop_code) {
		this.shop_code = shop_code;
	}

	/**
	 * 获取会员名称
	 * @return vip_name 会员名称
	 */
	public String getVip_name() {
		return vip_name;
	}

	/**
	 * 设置会员名称
	 * @param vip_name 会员名称
	 */
	public void setVip_name(String vip_name) {
		this.vip_name = vip_name;
	}

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

	/**
	 * 获取收件手机
	 * @return receiver_mobile 收件手机
	 */
	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	/**
	 * 设置收件手机
	 * @param receiver_mobile 收件手机
	 */
	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

}
