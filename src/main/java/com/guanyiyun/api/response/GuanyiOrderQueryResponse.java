package com.guanyiyun.api.response;

import java.util.List;

import com.guanyiyun.api.model.Delivery;
import com.guanyiyun.api.model.Goods;
import com.guanyiyun.api.model.Invoice;
import com.guanyiyun.api.model.Order;
import com.guanyiyun.api.model.Payment;

/**
 * 管易订单查询响应
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderQueryResponse extends GuanyiBaseResponse {

	private static final long serialVersionUID = -2717763219376912076L;
	/** 订单明细 */
	private List<Order> orders;
	/** 商品明细 */
	private List<Goods> details;
	/** 支付明细 */
	private List<Payment> payments;
	/** 发票明细 */
	private List<Invoice> invoices;
	/** 发货明细 */
	private List<Delivery> deliverys;
	/** 总计 */
	private Integer total;

	/**
	 * 获取订单明细
	 * @return orders 订单明细
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * 设置订单明细
	 * @param orders 订单明细
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	/**
	 * 获取商品明细
	 * @return details 商品明细
	 */
	public List<Goods> getDetails() {
		return details;
	}

	/**
	 * 设置商品明细
	 * @param details 商品明细
	 */
	public void setDetails(List<Goods> details) {
		this.details = details;
	}

	/**
	 * 获取支付明细
	 * @return payments 支付明细
	 */
	public List<Payment> getPayments() {
		return payments;
	}

	/**
	 * 设置支付明细
	 * @param payments 支付明细
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	/**
	 * 获取发票明细
	 * @return invoices 发票明细
	 */
	public List<Invoice> getInvoices() {
		return invoices;
	}

	/**
	 * 设置发票明细
	 * @param invoices 发票明细
	 */
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	/**
	 * 获取发货明细
	 * @return deliverys 发货明细
	 */
	public List<Delivery> getDeliverys() {
		return deliverys;
	}

	/**
	 * 设置发货明细
	 * @param deliverys 发货明细
	 */
	public void setDeliverys(List<Delivery> deliverys) {
		this.deliverys = deliverys;
	}

	/**
	 * 获取总计
	 * @return total 总计
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * 设置总计
	 * @param total 总计
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

}
