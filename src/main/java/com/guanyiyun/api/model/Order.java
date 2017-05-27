package com.guanyiyun.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 管易订单信息
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class Order implements Serializable {

	private static final long serialVersionUID = 8394968842067118534L;

	/** 订单编号 */
	private String code;
	/** 订单类型 */
	private String order_type_name;
	/** 平台单号 */
	private String platform_code;
	/** 制单时间 */
	private String createtime;
	/** 拍单时间 */
	private Date dealtime;
	/** 支付时间 */
	private Date paytime;
	/** 是否为货到付款 */
	private Boolean cod;
	/** 是否已审核 */
	private Boolean approve;
	/** 发货状态 */
	private Integer delivery_state;
	/** 仓库代码 */
	private String warehouse_code;
	/** 仓库名称 */
	private String warehouse_name;
	/** 店铺代码 */
	private String shop_code;
	/** 店铺名称 */
	private String shop_name;
	/** 物流公司代码 */
	private String express_code;
	/** 物流公司名称 */
	private String express_name;
	/** 买家留言 */
	private String buyer_memo;
	/** 卖家备注 */
	private String seller_memo;
	/** 二次备注 */
	private String seller_memo_late;
	/** 会员代码 */
	private String vip_code;
	/** 会员名称 */
	private String vip_name;
	/** 收件人姓名 */
	private String receiver_name;
	/** 收件人电话 */
	private String receiver_phone;
	/** 收件人手机 */
	private String receiver_mobile;
	/** 收件邮编 */
	private String receiver_zip;
	/** 收件区域信息 */
	private String receiver_area;
	/** 收件详细地址 */
	private String receiver_address;
	/** 支付流水号 */
	private String payCode;
	/** 身份证号 */
	private String vipIdCard;
	/** 真实姓名 */
	private String vipRealName;
	/** 电子邮箱 */
	private String vipEmail;
	/** 订单金额 */
	private BigDecimal amount;
	/** 货款金额 */
	private BigDecimal payment_amount;
	/** 物流费用 */
	private BigDecimal post_fee;
	/** 让利金额 */
	private BigDecimal discount_fee;
	/** 实付金额 */
	private BigDecimal payment;
	/** 商品数量 */
	private BigDecimal qty;
	/** 标准重量 */
	private BigDecimal weight_origin;
	/** 物流成本 */
	private BigDecimal post_cost;
	/** 平台旗帜 */
	private Integer platform_flag;
	/** 业务员 */
	private String business_man;

	/**
	 * 获取订单编号
	 * @return code 订单编号
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置订单编号
	 * @param code 订单编号
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取订单类型
	 * @return order_type_name 订单类型
	 */
	public String getOrder_type_name() {
		return order_type_name;
	}

	/**
	 * 设置订单类型
	 * @param order_type_name 订单类型
	 */
	public void setOrder_type_name(String order_type_name) {
		this.order_type_name = order_type_name;
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
	 * 获取制单时间
	 * @return createtime 制单时间
	 */
	public String getCreatetime() {
		return createtime;
	}

	/**
	 * 设置制单时间
	 * @param createtime 制单时间
	 */
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	/**
	 * 获取拍单时间
	 * @return dealtime 拍单时间
	 */
	public Date getDealtime() {
		return dealtime;
	}

	/**
	 * 设置拍单时间
	 * @param dealtime 拍单时间
	 */
	public void setDealtime(Date dealtime) {
		this.dealtime = dealtime;
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
	 * 获取是否为货到付款
	 * @return cod 是否为货到付款
	 */
	public Boolean getCod() {
		return cod;
	}

	/**
	 * 设置是否为货到付款
	 * @param cod 是否为货到付款
	 */
	public void setCod(Boolean cod) {
		this.cod = cod;
	}

	/**
	 * 获取是否已审核
	 * @return approve 是否已审核
	 */
	public Boolean getApprove() {
		return approve;
	}

	/**
	 * 设置是否已审核
	 * @param approve 是否已审核
	 */
	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	/**
	 * 获取发货状态
	 * @return delivery_state 发货状态
	 */
	public Integer getDelivery_state() {
		return delivery_state;
	}

	/**
	 * 设置发货状态
	 * @param delivery_state 发货状态
	 */
	public void setDelivery_state(Integer delivery_state) {
		this.delivery_state = delivery_state;
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
	 * 获取店铺名称
	 * @return shop_name 店铺名称
	 */
	public String getShop_name() {
		return shop_name;
	}

	/**
	 * 设置店铺名称
	 * @param shop_name 店铺名称
	 */
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
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
	 * 获取买家留言
	 * @return buyer_memo 买家留言
	 */
	public String getBuyer_memo() {
		return buyer_memo;
	}

	/**
	 * 设置买家留言
	 * @param buyer_memo 买家留言
	 */
	public void setBuyer_memo(String buyer_memo) {
		this.buyer_memo = buyer_memo;
	}

	/**
	 * 获取卖家备注
	 * @return seller_memo 卖家备注
	 */
	public String getSeller_memo() {
		return seller_memo;
	}

	/**
	 * 设置卖家备注
	 * @param seller_memo 卖家备注
	 */
	public void setSeller_memo(String seller_memo) {
		this.seller_memo = seller_memo;
	}

	/**
	 * 获取二次备注
	 * @return seller_memo_late 二次备注
	 */
	public String getSeller_memo_late() {
		return seller_memo_late;
	}

	/**
	 * 设置二次备注
	 * @param seller_memo_late 二次备注
	 */
	public void setSeller_memo_late(String seller_memo_late) {
		this.seller_memo_late = seller_memo_late;
	}

	/**
	 * 获取会员代码
	 * @return vip_code 会员代码
	 */
	public String getVip_code() {
		return vip_code;
	}

	/**
	 * 设置会员代码
	 * @param vip_code 会员代码
	 */
	public void setVip_code(String vip_code) {
		this.vip_code = vip_code;
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
	 * 获取收件人姓名
	 * @return receiver_name 收件人姓名
	 */
	public String getReceiver_name() {
		return receiver_name;
	}

	/**
	 * 设置收件人姓名
	 * @param receiver_name 收件人姓名
	 */
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	/**
	 * 获取收件人电话
	 * @return receiver_phone 收件人电话
	 */
	public String getReceiver_phone() {
		return receiver_phone;
	}

	/**
	 * 设置收件人电话
	 * @param receiver_phone 收件人电话
	 */
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	/**
	 * 获取收件人手机
	 * @return receiver_mobile 收件人手机
	 */
	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	/**
	 * 设置收件人手机
	 * @param receiver_mobile 收件人手机
	 */
	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	/**
	 * 获取收件邮编
	 * @return receiver_zip 收件邮编
	 */
	public String getReceiver_zip() {
		return receiver_zip;
	}

	/**
	 * 设置收件邮编
	 * @param receiver_zip 收件邮编
	 */
	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	/**
	 * 获取收件区域信息
	 * @return receiver_area 收件区域信息
	 */
	public String getReceiver_area() {
		return receiver_area;
	}

	/**
	 * 设置收件区域信息
	 * @param receiver_area 收件区域信息
	 */
	public void setReceiver_area(String receiver_area) {
		this.receiver_area = receiver_area;
	}

	/**
	 * 获取收件详细地址
	 * @return receiver_address 收件详细地址
	 */
	public String getReceiver_address() {
		return receiver_address;
	}

	/**
	 * 设置收件详细地址
	 * @param receiver_address 收件详细地址
	 */
	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	/**
	 * 获取支付流水号
	 * @return payCode 支付流水号
	 */
	public String getPayCode() {
		return payCode;
	}

	/**
	 * 设置支付流水号
	 * @param payCode 支付流水号
	 */
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	/**
	 * 获取身份证号
	 * @return vipIdCard 身份证号
	 */
	public String getVipIdCard() {
		return vipIdCard;
	}

	/**
	 * 设置身份证号
	 * @param vipIdCard 身份证号
	 */
	public void setVipIdCard(String vipIdCard) {
		this.vipIdCard = vipIdCard;
	}

	/**
	 * 获取真实姓名
	 * @return vipRealName 真实姓名
	 */
	public String getVipRealName() {
		return vipRealName;
	}

	/**
	 * 设置真实姓名
	 * @param vipRealName 真实姓名
	 */
	public void setVipRealName(String vipRealName) {
		this.vipRealName = vipRealName;
	}

	/**
	 * 获取电子邮箱
	 * @return vipEmail 电子邮箱
	 */
	public String getVipEmail() {
		return vipEmail;
	}

	/**
	 * 设置电子邮箱
	 * @param vipEmail 电子邮箱
	 */
	public void setVipEmail(String vipEmail) {
		this.vipEmail = vipEmail;
	}

	/**
	 * 获取订单金额
	 * @return amount 订单金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 设置订单金额
	 * @param amount 订单金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 获取货款金额
	 * @return payment_amount 货款金额
	 */
	public BigDecimal getPayment_amount() {
		return payment_amount;
	}

	/**
	 * 设置货款金额
	 * @param payment_amount 货款金额
	 */
	public void setPayment_amount(BigDecimal payment_amount) {
		this.payment_amount = payment_amount;
	}

	/**
	 * 获取物流费用
	 * @return post_fee 物流费用
	 */
	public BigDecimal getPost_fee() {
		return post_fee;
	}

	/**
	 * 设置物流费用
	 * @param post_fee 物流费用
	 */
	public void setPost_fee(BigDecimal post_fee) {
		this.post_fee = post_fee;
	}

	/**
	 * 获取让利金额
	 * @return discount_fee 让利金额
	 */
	public BigDecimal getDiscount_fee() {
		return discount_fee;
	}

	/**
	 * 设置让利金额
	 * @param discount_fee 让利金额
	 */
	public void setDiscount_fee(BigDecimal discount_fee) {
		this.discount_fee = discount_fee;
	}

	/**
	 * 获取实付金额
	 * @return payment 实付金额
	 */
	public BigDecimal getPayment() {
		return payment;
	}

	/**
	 * 设置实付金额
	 * @param payment 实付金额
	 */
	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	/**
	 * 获取商品数量
	 * @return qty 商品数量
	 */
	public BigDecimal getQty() {
		return qty;
	}

	/**
	 * 设置商品数量
	 * @param qty 商品数量
	 */
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	/**
	 * 获取标准重量
	 * @return weight_origin 标准重量
	 */
	public BigDecimal getWeight_origin() {
		return weight_origin;
	}

	/**
	 * 设置标准重量
	 * @param weight_origin 标准重量
	 */
	public void setWeight_origin(BigDecimal weight_origin) {
		this.weight_origin = weight_origin;
	}

	/**
	 * 获取物流成本
	 * @return post_cost 物流成本
	 */
	public BigDecimal getPost_cost() {
		return post_cost;
	}

	/**
	 * 设置物流成本
	 * @param post_cost 物流成本
	 */
	public void setPost_cost(BigDecimal post_cost) {
		this.post_cost = post_cost;
	}

	/**
	 * 获取平台旗帜
	 * @return platform_flag 平台旗帜
	 */
	public Integer getPlatform_flag() {
		return platform_flag;
	}

	/**
	 * 设置平台旗帜
	 * @param platform_flag 平台旗帜
	 */
	public void setPlatform_flag(Integer platform_flag) {
		this.platform_flag = platform_flag;
	}

	/**
	 * 获取业务员
	 * @return business_man 业务员
	 */
	public String getBusiness_man() {
		return business_man;
	}

	/**
	 * 设置业务员
	 * @param business_man 业务员
	 */
	public void setBusiness_man(String business_man) {
		this.business_man = business_man;
	}

}
