package com.guanyiyun.api.model;

import java.io.Serializable;

/**
 * 发货单信息
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class Delivery implements Serializable {

	private static final long serialVersionUID = -4805682241970331530L;

	/** 发货单号 */
	private String code;
	/** 仓库代码 */
	private String warehouse_code;
	/** 仓库名称 */
	private String warehouse_name;
	/** 物流公司代码 */
	private String express_code;
	/** 物流公司名称 */
	private String express_name;
	/** 物流单号 */
	private String mail_no;
	/** 是否已打印物流单 */
	private Boolean printExpress;
	/** 是否已打印发货单 */
	private Boolean printDeliveryList;
	/** 是否已扫描 */
	private Boolean scan;
	/** 是否已称重 */
	private Boolean weight;
	/** 是否已发货 */
	private Boolean delivery;

	/**
	 * 获取发货单号
	 * @return code 发货单号
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置发货单号
	 * @param code 发货单号
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * 获取仓库名称
	 * @return warehouse_name 仓库名称
	 */
	public String getWarehouse_name() {
		return warehouse_name;
	}

	/**
	 * 设置仓库名称
	 * @param warehouse_name 仓库名称
	 */
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	/**
	 * 获取物流公司代码
	 * @return express_code 物流公司代码
	 */
	public String getExpress_code() {
		return express_code;
	}

	/**
	 * 设置物流公司代码
	 * @param express_code 物流公司代码
	 */
	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}

	/**
	 * 获取物流公司名称
	 * @return express_name 物流公司名称
	 */
	public String getExpress_name() {
		return express_name;
	}

	/**
	 * 设置物流公司名称
	 * @param express_name 物流公司名称
	 */
	public void setExpress_name(String express_name) {
		this.express_name = express_name;
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

	/**
	 * 获取是否已打印物流单
	 * @return printExpress 是否已打印物流单
	 */
	public Boolean getPrintExpress() {
		return printExpress;
	}

	/**
	 * 设置是否已打印物流单
	 * @param printExpress 是否已打印物流单
	 */
	public void setPrintExpress(Boolean printExpress) {
		this.printExpress = printExpress;
	}

	/**
	 * 获取是否已打印发货单
	 * @return printDeliveryList 是否已打印发货单
	 */
	public Boolean getPrintDeliveryList() {
		return printDeliveryList;
	}

	/**
	 * 设置是否已打印发货单
	 * @param printDeliveryList 是否已打印发货单
	 */
	public void setPrintDeliveryList(Boolean printDeliveryList) {
		this.printDeliveryList = printDeliveryList;
	}

	/**
	 * 获取是否已扫描
	 * @return scan 是否已扫描
	 */
	public Boolean getScan() {
		return scan;
	}

	/**
	 * 设置是否已扫描
	 * @param scan 是否已扫描
	 */
	public void setScan(Boolean scan) {
		this.scan = scan;
	}

	/**
	 * 获取是否已称重
	 * @return weight 是否已称重
	 */
	public Boolean getWeight() {
		return weight;
	}

	/**
	 * 设置是否已称重
	 * @param weight 是否已称重
	 */
	public void setWeight(Boolean weight) {
		this.weight = weight;
	}

	/**
	 * 获取是否已发货
	 * @return delivery 是否已发货
	 */
	public Boolean getDelivery() {
		return delivery;
	}

	/**
	 * 设置是否已发货
	 * @param delivery 是否已发货
	 */
	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}

}
