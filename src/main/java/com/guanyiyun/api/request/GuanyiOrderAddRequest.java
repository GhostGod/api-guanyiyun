package com.guanyiyun.api.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.guanyiyun.api.GuanyiConfig;
import com.guanyiyun.api.GuanyiConfig.OrderTypeCode;
import com.guanyiyun.api.GuanyiConfig.PlatformFlag;
import com.guanyiyun.api.model.Goods;
import com.guanyiyun.api.model.Invoice;
import com.guanyiyun.api.model.Payment;
import com.guanyiyun.api.response.GuanyiOrderAddResponse;

/**
 * 管易新增订单请求
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderAddRequest extends GuanyiBaseRequest<GuanyiOrderAddResponse> {

	private static final long serialVersionUID = 4664183619843103783L;

	/** 管易订单新增接口方法名称 */
	public final static String METHOD = "gy.erp.trade.add";

	/** 订单类型code */
	private OrderTypeCode order_type_code = OrderTypeCode.Sales;
	/** 退款状态；0-非退款 ，1--退款（退款中）； */
	private Integer refund = 0;
	/** 货到付款 */
	private Boolean cod;
	/** 结算方式code */
	private String order_settlement_code;
	/** 平台单号 */
	private String platform_code;//
	/** 店铺code；必填；是否需要在管易新建一个店铺code？ */
	private String shop_code = GuanyiConfig.DEFAULT_SHOP_CODE;
	/** 物流公司code；必填 */
	private String express_code = GuanyiConfig.DEFAULT_EXPRESS_CODE;
	/** 仓库code；必填 */
	private String warehouse_code = GuanyiConfig.DEFAULT_WAREHOUSE_CODE;
	/** 会员code；必填 */
	private String vip_code;
	/** 会员名称 */
	private String vip_name;
	/** /收货人 */
	private String receiver_name;
	/** 收货地址 */
	private String receiver_address;
	/** 收货邮编 */
	private String receiver_zip;
	/** 收货人手机；手机和电话必填一项 */
	private String receiver_mobile;
	/** 收货人电话；手机和电话必填一项 */
	private String receiver_phone;
	/** 收货人省份 */
	private String receiver_province;
	/** 收货人城市 */
	private String receiver_city;
	/** 收货人区域 */
	private String receiver_district;
	/** 标记code */
	private String tag_code;
	/** 拍单时间；必填；格式：2015-03-17 15:03:45 */
	private String deal_datetime;
	/** 付款时间；格式：2015-03-17 15:03:45 */
	private String pay_datetime;
	/** 业务员code */
	private String business_man_code;
	/** 物流费用 */
	private BigDecimal post_fee;
	/** 到付服务费 */
	private BigDecimal cod_fee;
	/** 让利金额 */
	private BigDecimal discount_fee;
	/** 预计发货日期 */
	private Date plan_delivery_date;
	/** 买家留言 */
	private String buyer_memo;
	/** 卖家备注 */
	private String seller_memo;
	/** 二次备注 */
	private String seller_memo_late;
	/** 身份证号 */
	private String vipIdCard;
	/** 真实姓名 */
	private String vipRealName;
	/** 电子邮箱 */
	private String vipEmail;
	/** 发票信息数组；必填 */
	private List<Invoice> invoices;
	/** 商品信息数组 */
	private List<Goods> details;
	/** 支付信息数组  必填*/
	private List<Payment> payments;

	/** 平台旗帜 */
	private PlatformFlag platform_flag = PlatformFlag.NONE;

	@Override
	public String getMethod() {
		return METHOD;
	}

	/**  
	 * 获取订单类型code  
	 * @return order_type_code 订单类型code  
	 */
	public OrderTypeCode getOrder_type_code() {
		return order_type_code;
	}

	/**  
	 * 设置订单类型code  
	 * @param order_type_code 订单类型code  
	 */
	public void setOrder_type_code(OrderTypeCode order_type_code) {
		this.order_type_code = order_type_code;
	}

	/**  
	 * 获取退款状态；0-非退款，1--退款（退款中）；  
	 * @return refund 退款状态；0-非退款，1--退款（退款中）；  
	 */
	public Integer getRefund() {
		return refund;
	}

	/**  
	 * 设置退款状态；0-非退款，1--退款（退款中）；  
	 * @param refund 退款状态；0-非退款，1--退款（退款中）；  
	 */
	public void setRefund(Integer refund) {
		this.refund = refund;
	}

	/**  
	 * 获取货到付款  
	 * @return cod 货到付款  
	 */
	public Boolean getCod() {
		return cod;
	}

	/**  
	 * 设置货到付款  
	 * @param cod 货到付款  
	 */
	public void setCod(Boolean cod) {
		this.cod = cod;
	}

	/**  
	 * 获取结算方式code  
	 * @return order_settlement_code 结算方式code  
	 */
	public String getOrder_settlement_code() {
		return order_settlement_code;
	}

	/**  
	 * 设置结算方式code  
	 * @param order_settlement_code 结算方式code  
	 */
	public void setOrder_settlement_code(String order_settlement_code) {
		this.order_settlement_code = order_settlement_code;
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
	 * 获取店铺code；必填；是否需要在管易新建一个店铺code？  
	 * @return shop_code 店铺code；必填；是否需要在管易新建一个店铺code？  
	 */
	public String getShop_code() {
		return shop_code;
	}

	/**  
	 * 设置店铺code；必填；是否需要在管易新建一个店铺code？  
	 * @param shop_code 店铺code；必填；是否需要在管易新建一个店铺code？  
	 */
	public void setShop_code(String shop_code) {
		this.shop_code = shop_code;
	}

	/**  
	 * 获取物流公司code；必填  
	 * @return express_code 物流公司code；必填  
	 */
	public String getExpress_code() {
		return express_code;
	}

	/**  
	 * 设置物流公司code；必填  
	 * @param express_code 物流公司code；必填  
	 */
	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}

	/**  
	 * 获取仓库code；必填  
	 * @return warehouse_code 仓库code；必填  
	 */
	public String getWarehouse_code() {
		return warehouse_code;
	}

	/**  
	 * 设置仓库code；必填  
	 * @param warehouse_code 仓库code；必填  
	 */
	public void setWarehouse_code(String warehouse_code) {
		this.warehouse_code = warehouse_code;
	}

	/**  
	 * 获取会员code；必填  
	 * @return vip_code 会员code；必填  
	 */
	public String getVip_code() {
		return vip_code;
	}

	/**  
	 * 设置会员code；必填  
	 * @param vip_code 会员code；必填  
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
	 * 获取收货人  
	 * @return receiver_name 收货人  
	 */
	public String getReceiver_name() {
		return receiver_name;
	}

	/**  
	 * 设置收货人  
	 * @param receiver_name 收货人  
	 */
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	/**  
	 * 获取收货地址  
	 * @return receiver_address 收货地址  
	 */
	public String getReceiver_address() {
		return receiver_address;
	}

	/**  
	 * 设置收货地址  
	 * @param receiver_address 收货地址  
	 */
	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	/**  
	 * 获取收货邮编  
	 * @return receiver_zip 收货邮编  
	 */
	public String getReceiver_zip() {
		return receiver_zip;
	}

	/**  
	 * 设置收货邮编  
	 * @param receiver_zip 收货邮编  
	 */
	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	/**  
	 * 获取收货人手机；手机和电话必填一项  
	 * @return receiver_mobile 收货人手机；手机和电话必填一项  
	 */
	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	/**  
	 * 设置收货人手机；手机和电话必填一项  
	 * @param receiver_mobile 收货人手机；手机和电话必填一项  
	 */
	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	/**  
	 * 获取收货人电话；手机和电话必填一项  
	 * @return receiver_phone 收货人电话；手机和电话必填一项  
	 */
	public String getReceiver_phone() {
		return receiver_phone;
	}

	/**  
	 * 设置收货人电话；手机和电话必填一项  
	 * @param receiver_phone 收货人电话；手机和电话必填一项  
	 */
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	/**  
	 * 获取收货人省份  
	 * @return receiver_province 收货人省份  
	 */
	public String getReceiver_province() {
		return receiver_province;
	}

	/**  
	 * 设置收货人省份  
	 * @param receiver_province 收货人省份  
	 */
	public void setReceiver_province(String receiver_province) {
		this.receiver_province = receiver_province;
	}

	/**  
	 * 获取收货人城市  
	 * @return receiver_city 收货人城市  
	 */
	public String getReceiver_city() {
		return receiver_city;
	}

	/**  
	 * 设置收货人城市  
	 * @param receiver_city 收货人城市  
	 */
	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}

	/**  
	 * 获取收货人区域  
	 * @return receiver_district 收货人区域  
	 */
	public String getReceiver_district() {
		return receiver_district;
	}

	/**  
	 * 设置收货人区域  
	 * @param receiver_district 收货人区域  
	 */
	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}

	/**  
	 * 获取标记code  
	 * @return tag_code 标记code  
	 */
	public String getTag_code() {
		return tag_code;
	}

	/**  
	 * 设置标记code  
	 * @param tag_code 标记code  
	 */
	public void setTag_code(String tag_code) {
		this.tag_code = tag_code;
	}

	/**  
	 * 获取拍单时间；必填；格式：2015-03-1715:03:45  
	 * @return deal_datetime 拍单时间；必填；格式：2015-03-1715:03:45  
	 */
	public String getDeal_datetime() {
		return deal_datetime;
	}

	/**  
	 * 设置拍单时间；必填；格式：2015-03-1715:03:45  
	 * @param deal_datetime 拍单时间；必填；格式：2015-03-1715:03:45  
	 */
	public void setDeal_datetime(String deal_datetime) {
		this.deal_datetime = deal_datetime;
	}

	/**  
	 * 获取付款时间；格式：2015-03-1715:03:45  
	 * @return pay_datetime 付款时间；格式：2015-03-1715:03:45  
	 */
	public String getPay_datetime() {
		return pay_datetime;
	}

	/**  
	 * 设置付款时间；格式：2015-03-1715:03:45  
	 * @param pay_datetime 付款时间；格式：2015-03-1715:03:45  
	 */
	public void setPay_datetime(String pay_datetime) {
		this.pay_datetime = pay_datetime;
	}

	/**  
	 * 获取业务员code  
	 * @return business_man_code 业务员code  
	 */
	public String getBusiness_man_code() {
		return business_man_code;
	}

	/**  
	 * 设置业务员code  
	 * @param business_man_code 业务员code  
	 */
	public void setBusiness_man_code(String business_man_code) {
		this.business_man_code = business_man_code;
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
	 * 获取到付服务费  
	 * @return cod_fee 到付服务费  
	 */
	public BigDecimal getCod_fee() {
		return cod_fee;
	}

	/**  
	 * 设置到付服务费  
	 * @param cod_fee 到付服务费  
	 */
	public void setCod_fee(BigDecimal cod_fee) {
		this.cod_fee = cod_fee;
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
	 * 获取预计发货日期  
	 * @return plan_delivery_date 预计发货日期  
	 */
	public Date getPlan_delivery_date() {
		return plan_delivery_date;
	}

	/**  
	 * 设置预计发货日期  
	 * @param plan_delivery_date 预计发货日期  
	 */
	public void setPlan_delivery_date(Date plan_delivery_date) {
		this.plan_delivery_date = plan_delivery_date;
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
	 * 获取发票信息数组；必填  
	 * @return invoices 发票信息数组；必填  
	 */
	public List<Invoice> getInvoices() {
		return invoices;
	}

	/**  
	 * 设置发票信息数组；必填  
	 * @param invoices 发票信息数组；必填  
	 */
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	/**  
	 * 获取商品信息数组  
	 * @return details 商品信息数组  
	 */
	public List<Goods> getDetails() {
		return details;
	}

	/**  
	 * 设置商品信息数组  
	 * @param details 商品信息数组  
	 */
	public void setDetails(List<Goods> details) {
		this.details = details;
	}

	/**  
	 * 获取支付信息数组必填  
	 * @return payments 支付信息数组必填  
	 */
	public List<Payment> getPayments() {
		return payments;
	}

	/**  
	 * 设置支付信息数组必填  
	 * @param payments 支付信息数组必填  
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	/**  
	 * 获取平台旗帜  
	 * @return platform_flag 平台旗帜  
	 */
	public int getPlatform_flag() {
		return platform_flag.ordinal();
	}

	/**  
	 * 设置平台旗帜  
	 * @param platform_flag 平台旗帜  
	 */
	public void setPlatform_flag(PlatformFlag platform_flag) {
		this.platform_flag = platform_flag;
	}

}
