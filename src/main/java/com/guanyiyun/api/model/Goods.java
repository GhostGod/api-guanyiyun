package com.guanyiyun.api.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品信息
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class Goods implements Serializable {

	private static final long serialVersionUID = 3833059891718141435L;

	/** 商品代码 */
	private String item_code;
	/** 规格代码 */
	private String sku_code;
	/** 实际单价 */
	private BigDecimal price;
	/** 商品数量 */
	private Integer qty;
	/** 是否退款 0非退款 ,1退款(退款中); */
	private Integer refund;
	/** 备注 */
	private String note;
	/** 子订单ID */
	private String oid;
	/**  
	 * 获取商品代码  
	 * @return item_code 商品代码  
	 */
	public String getItem_code() {
		return item_code;
	}
	/**  
	 * 设置商品代码  
	 * @param item_code 商品代码  
	 */
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	/**  
	 * 获取规格代码  
	 * @return sku_code 规格代码  
	 */
	public String getSku_code() {
		return sku_code;
	}
	/**  
	 * 设置规格代码  
	 * @param sku_code 规格代码  
	 */
	public void setSku_code(String sku_code) {
		this.sku_code = sku_code;
	}
	/**  
	 * 获取实际单价  
	 * @return price 实际单价  
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**  
	 * 设置实际单价  
	 * @param price 实际单价  
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**  
	 * 获取商品数量  
	 * @return qty 商品数量  
	 */
	public Integer getQty() {
		return qty;
	}
	/**  
	 * 设置商品数量  
	 * @param qty 商品数量  
	 */
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	/**  
	 * 获取是否退款0非退款1退款(退款中);  
	 * @return refund 是否退款0非退款1退款(退款中);  
	 */
	public Integer getRefund() {
		return refund;
	}
	/**  
	 * 设置是否退款0非退款1退款(退款中);  
	 * @param refund 是否退款0非退款1退款(退款中);  
	 */
	public void setRefund(Integer refund) {
		this.refund = refund;
	}
	/**  
	 * 获取备注  
	 * @return note 备注  
	 */
	public String getNote() {
		return note;
	}
	/**  
	 * 设置备注  
	 * @param note 备注  
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**  
	 * 获取子订单ID  
	 * @return oid 子订单ID  
	 */
	public String getOid() {
		return oid;
	}
	/**  
	 * 设置子订单ID  
	 * @param oid 子订单ID  
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}
	
}
