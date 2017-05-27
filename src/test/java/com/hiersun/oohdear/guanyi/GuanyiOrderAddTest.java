package com.hiersun.oohdear.guanyi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.guanyiyun.api.GuanyiConfig.PayTypeCode;
import com.guanyiyun.api.GuanyiConfig.PlatformFlag;
import com.guanyiyun.api.model.Goods;
import com.guanyiyun.api.model.Invoice;
import com.guanyiyun.api.model.Payment;
import com.guanyiyun.api.request.GuanyiOrderAddRequest;

/**
 * 管易添加订单接口单元测试
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderAddTest {

	private static final Logger logger = Logger.getLogger(GuanyiOrderAddTest.class);

	@Test
	public void test() {
		GuanyiOrderAddRequest request = new GuanyiOrderAddRequest();
		request.setDeal_datetime("2017-01-01 01:01:01");
		List<Goods> details = new ArrayList<>();
		//TODO 查询商品信息加入list
		Goods goods = new Goods();
		goods.setItem_code("item_12345");
		goods.setOid("sub1234567891");
		goods.setPrice(new BigDecimal(100));
		goods.setQty(2);
		goods.setRefund(0);
		goods.setSku_code("sku_12345");
		details.add(goods);
		request.setDetails(details);
		List<Invoice> invoices = new ArrayList<>();
		//TODO 查询发票信息加入list
		request.setInvoices(invoices);
		//查询支付信息表的支付时间
		List<Payment> payments = new ArrayList<>();
		Date paytime = new Date();
		request.setPay_datetime("2017-01-01 01:01:01");
		Payment payment = new Payment();
		payment.setAccount("liuyang@test.com");
		payment.setPay_code("test1234567890");
		//支付类型代码
		payment.setPay_type_code(PayTypeCode.zhifubao);
		payment.setPayment(new BigDecimal(100));
		payment.setPaytime(paytime);
		//支付信息加入list
		payments.add(payment);
		request.setPayments(payments);
		request.setPlatform_code("test1234567891");
		String receiver_address = "北京市朝阳区东八里庄莱锦文化创意产业园";
		request.setReceiver_address(receiver_address);
		//model.setReceiver_city(receiver_city);
		//model.setReceiver_district(receiver_district);//收货人区域
		request.setReceiver_mobile("18686637936");
		request.setReceiver_name("liuyang");
		//model.setReceiver_province(receiver_province);
		request.setRefund(0);
		request.setVip_code("test1234567890");
		request.setVip_name("liuyang");
		//request.setVipEmail(vipEmail);
		request.setVipRealName("liuyang");

		request.setPlatform_flag(PlatformFlag.BLUE);
		request.setBuyer_memo("买家备注");
		request.setSeller_memo("卖家备注");
		request.setSeller_memo_late("二次备注");

		//调用管易新增订单接口
		String response = request.execute();
		logger.info(response);
	}

}
