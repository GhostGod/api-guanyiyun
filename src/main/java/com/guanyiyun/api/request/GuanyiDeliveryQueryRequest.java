package com.guanyiyun.api.request;

import java.util.Date;

import com.guanyiyun.api.response.GuanyiDeliveryQueryResponse;

/**
 * 管易发货单查询接口请求
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiDeliveryQueryRequest extends GuanyiBaseRequest<GuanyiDeliveryQueryResponse> {

	private static final long serialVersionUID = 8637156266494413067L;

	/** 管易发货单查询接口方法名称 */
	public final static String METHOD = "gy.erp.trade.deliverys.get";

	/** 页码 */
	private Integer page_no = 1;
	/** 每页大小 */
	private Integer page_size = 10;
	/** 单据编号 */
	private String code;
	/** 开始_创建时间 */
	private Date start_create;
	/** 结束_创建时间 */
	private Date end_create;
	/** 开始-发货时间 */
	private Date start_delivery_date;
	/** 结束-发货时间 */
	private Date end_delivery_date;
	/** 仓库代码 */
	private String warehouse_code;
	/** 店铺代码 */
	private String shop_code;
	/** 平台单号 */
	private String outer_code;
	/** 查询物流单的打印状态；0-未打印，1-已打印 */
	private Integer print;
	/** 扫描状态；0-未扫描，1-已扫描 */
	private Integer scan;
	/** 是否货到付款；0-否，1-是 */
	private Integer cod;
	/** 会员名称 */
	private String vip_name;
	/** 发货状态；0-未发货,发货失败,发货中；1-发货完成 */
	private Integer delivery;
	/** 物流单号 */
	private String mail_no;

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
	 * 获取开始_创建时间  
	 * @return start_create 开始_创建时间  
	 */
	public Date getStart_create() {
		return start_create;
	}

	/**  
	 * 设置开始_创建时间  
	 * @param start_create 开始_创建时间  
	 */
	public void setStart_create(Date start_create) {
		this.start_create = start_create;
	}

	/**  
	 * 获取结束_创建时间  
	 * @return end_create 结束_创建时间  
	 */
	public Date getEnd_create() {
		return end_create;
	}

	/**  
	 * 设置结束_创建时间  
	 * @param end_create 结束_创建时间  
	 */
	public void setEnd_create(Date end_create) {
		this.end_create = end_create;
	}

	/**  
	 * 获取开始-发货时间  
	 * @return start_delivery_date 开始-发货时间  
	 */
	public Date getStart_delivery_date() {
		return start_delivery_date;
	}

	/**  
	 * 设置开始-发货时间  
	 * @param start_delivery_date 开始-发货时间  
	 */
	public void setStart_delivery_date(Date start_delivery_date) {
		this.start_delivery_date = start_delivery_date;
	}

	/**  
	 * 获取结束-发货时间  
	 * @return end_delivery_date 结束-发货时间  
	 */
	public Date getEnd_delivery_date() {
		return end_delivery_date;
	}

	/**  
	 * 设置结束-发货时间  
	 * @param end_delivery_date 结束-发货时间  
	 */
	public void setEnd_delivery_date(Date end_delivery_date) {
		this.end_delivery_date = end_delivery_date;
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
	 * 获取平台单号  
	 * @return outer_code 平台单号  
	 */
	public String getOuter_code() {
		return outer_code;
	}

	/**  
	 * 设置平台单号  
	 * @param outer_code 平台单号  
	 */
	public void setOuter_code(String outer_code) {
		this.outer_code = outer_code;
	}

	/**  
	 * 获取查询物流单的打印状态；0-未打印，1-已打印  
	 * @return print 查询物流单的打印状态；0-未打印，1-已打印  
	 */
	public Integer getPrint() {
		return print;
	}

	/**  
	 * 设置查询物流单的打印状态；0-未打印，1-已打印  
	 * @param print 查询物流单的打印状态；0-未打印，1-已打印  
	 */
	public void setPrint(Integer print) {
		this.print = print;
	}

	/**  
	 * 获取扫描状态；0-未扫描，1-已扫描  
	 * @return scan 扫描状态；0-未扫描，1-已扫描  
	 */
	public Integer getScan() {
		return scan;
	}

	/**  
	 * 设置扫描状态；0-未扫描，1-已扫描  
	 * @param scan 扫描状态；0-未扫描，1-已扫描  
	 */
	public void setScan(Integer scan) {
		this.scan = scan;
	}

	/**  
	 * 获取是否货到付款；0-否，1-是  
	 * @return cod 是否货到付款；0-否，1-是  
	 */
	public Integer getCod() {
		return cod;
	}

	/**  
	 * 设置是否货到付款；0-否，1-是  
	 * @param cod 是否货到付款；0-否，1-是  
	 */
	public void setCod(Integer cod) {
		this.cod = cod;
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
	 * 获取发货状态；0-未发货发货失败发货中；1-发货完成  
	 * @return delivery 发货状态；0-未发货发货失败发货中；1-发货完成  
	 */
	public Integer getDelivery() {
		return delivery;
	}

	/**  
	 * 设置发货状态；0-未发货发货失败发货中；1-发货完成  
	 * @param delivery 发货状态；0-未发货发货失败发货中；1-发货完成  
	 */
	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

	/**  
	 * 获取物流单号  
	 * @return mail_no 物流单号  
	 */
	public String getMail_no() {
		return mail_no;
	}

	/**  
	 * 设置物流单号  
	 * @param mail_no 物流单号  
	 */
	public void setMail_no(String mail_no) {
		this.mail_no = mail_no;
	}

}
