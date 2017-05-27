package com.guanyiyun.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.guanyiyun.api.GuanyiConfig.PayTypeCode;

/**
 * 支付信息
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class Payment implements Serializable {

	private static final long serialVersionUID = 5938988743536252644L;

	/** 支付类型code 必填 */
	private PayTypeCode pay_type_code;
	/** 支付时间 */
	private Date paytime;
	/** 支付金额  必填 */
	private BigDecimal payment;
	/** 支付交易号 */
	private String pay_code;
	/** 支付账户 */
	private String account;
	/**  
	 * 获取支付类型code必填  
	 * @return pay_type_code 支付类型code必填  
	 */
	public PayTypeCode getPay_type_code() {
		return pay_type_code;
	}
	/**  
	 * 设置支付类型code必填  
	 * @param pay_type_code 支付类型code必填  
	 */
	public void setPay_type_code(PayTypeCode pay_type_code) {
		this.pay_type_code = pay_type_code;
	}
	/**  
	 * 获取支付时间  
	 * @return paytime 支付时间  
	 */
	public Date getPaytime() {
		return paytime;
	}
	/**  
	 * 设置支付时间  
	 * @param paytime 支付时间  
	 */
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	/**  
	 * 获取支付金额必填  
	 * @return payment 支付金额必填  
	 */
	public BigDecimal getPayment() {
		return payment;
	}
	/**  
	 * 设置支付金额必填  
	 * @param payment 支付金额必填  
	 */
	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}
	/**  
	 * 获取支付交易号  
	 * @return pay_code 支付交易号  
	 */
	public String getPay_code() {
		return pay_code;
	}
	/**  
	 * 设置支付交易号  
	 * @param pay_code 支付交易号  
	 */
	public void setPay_code(String pay_code) {
		this.pay_code = pay_code;
	}
	/**  
	 * 获取支付账户  
	 * @return account 支付账户  
	 */
	public String getAccount() {
		return account;
	}
	/**  
	 * 设置支付账户  
	 * @param account 支付账户  
	 */
	public void setAccount(String account) {
		this.account = account;
	}

}
