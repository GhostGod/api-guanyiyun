package com.guanyiyun.api.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.guanyiyun.api.GuanyiConfig.InvoiceType;

/**
 * 发票信息
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class Invoice implements Serializable {

	private static final long serialVersionUID = 7128192421663638473L;
	/** 发票类型 1-普通发票；2-增值发票*/
	private InvoiceType invoice_type;
	/** 发票抬头*/
	private String invoice_title;
	/** 发票内容 */
	private String invoice_content;
	/** 发票金额*/
	private BigDecimal invoice_amount;
	/**  
	 * 获取发票类型1-普通发票；2-增值发票  
	 * @return invoice_type 发票类型1-普通发票；2-增值发票  
	 */
	public int getInvoice_type() {
		return invoice_type.ordinal();
	}
	/**  
	 * 设置发票类型1-普通发票；2-增值发票  
	 * @param invoice_type 发票类型1-普通发票；2-增值发票  
	 */
	public void setInvoice_type(InvoiceType invoice_type) {
		this.invoice_type = invoice_type;
	}
	/**  
	 * 获取发票抬头  
	 * @return invoice_title 发票抬头  
	 */
	public String getInvoice_title() {
		return invoice_title;
	}
	/**  
	 * 设置发票抬头  
	 * @param invoice_title 发票抬头  
	 */
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	/**  
	 * 获取发票内容  
	 * @return invoice_content 发票内容  
	 */
	public String getInvoice_content() {
		return invoice_content;
	}
	/**  
	 * 设置发票内容  
	 * @param invoice_content 发票内容  
	 */
	public void setInvoice_content(String invoice_content) {
		this.invoice_content = invoice_content;
	}
	/**  
	 * 获取发票金额  
	 * @return invoice_amount 发票金额  
	 */
	public BigDecimal getInvoice_amount() {
		return invoice_amount;
	}
	/**  
	 * 设置发票金额  
	 * @param invoice_amount 发票金额  
	 */
	public void setInvoice_amount(BigDecimal invoice_amount) {
		this.invoice_amount = invoice_amount;
	}

}
