package com.guanyiyun.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 管易相关配置类
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiConfig {

	private static final Logger logger = Logger.getLogger(GuanyiConfig.class);

	/** 管易API网关地址 */
	public final static String URL = "http://v2.api.guanyierp.com/rest/erp_open";
	/** 管易授权appKey */
	public static String APP_KEY = "";
	/** 管易授权secret */
	public static String SECRET = "";
	/** 管易授权sessionKey */
	public static String SESSION_KEY = "";
	/** 默认店铺代码 */
	public final static String DEFAULT_SHOP_CODE = "10";//本网（官网）
	/** 默认物流公司代码 */
	public final static String DEFAULT_EXPRESS_CODE = "SF";//顺丰
	/** 默认物流公司代码 */
	public final static String DEFAULT_WAREHOUSE_CODE = "01";//北京仓

	static {
		String filePath = "/web/guanyi.properties";
		File file = new File(filePath);
		if (file == null || file.isDirectory() || !file.exists()) {
			logger.warn("Load key failed. Please check [" + filePath + "].");
		} else {
			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream(file);
				Properties properties = new Properties();
				properties.load(new InputStreamReader(inputStream, "UTF-8"));
				APP_KEY = (String) properties.get("appkey");
				SECRET = (String) properties.get("secret");
				SESSION_KEY = (String) properties.get("sessionkey");
			} catch (IOException e) {
				throw new RuntimeException("Error loading properties file.", e);
			} finally {
				if (inputStream != null)
					try {
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
		//logger.info("APP_KEY=" + APP_KEY + ",SESSION_KEY=" + SESSION_KEY + ",SECRET=" + SECRET);
	}

	public static void main(String[] args) {
		new GuanyiConfig();
	}

	/**
	 * 订单类型代码
	 * @url http://v2.guanyierp.com/admin/order/sys_order_type/data/list
	 * @author liuyang
	 * @email y_liu@hiersun.com | 745089707@qq.com
	 */
	public enum OrderTypeCode {
		/** 销售订单 */
		Sales,
		/** 换货订单 */
		Return,
		/** 费用订单 */
		Charge,
		/** 补发货订单 */
		Delivery,
		/** 补发票订单 */
		Invoice
	}

	/**
	 * 支付类型代码
	 * @url http://v2.guanyierp.com/admin/finance/sys_trade_payment/data/all?_dc=1495074462583
	 * @author liuyang
	 * @email y_liu@hiersun.com | 745089707@qq.com
	 */
	public enum PayTypeCode {
		/** 支付宝 */
		zhifubao,
		/** 微信支付 */
		weixin;

		/**
		 * 根据代码获取支付类型的枚举值
		 * @param code 官网系统的支付类型代码
		 * @return
		 */
		public static PayTypeCode get(int code) {
			if (code == 1) {
				return zhifubao;
			} else if (code == 2) {
				return weixin;
			}
			return null;
		}
	}

	/**
	 * 平台旗帜
	 * @url http://v2.guanyierp.com/tc/trade/trade_order_header/data/flag
	 * @author liuyang
	 * @email y_liu@hiersun.com | 745089707@qq.com
	 */
	public enum PlatformFlag {
		/** 0无旗帜 */
		NONE,
		/** 1红旗 */
		RED,
		/** 2黄旗 */
		YELLOW,
		/** 3绿旗 */
		GREEN,
		/** 4蓝旗 */
		BLUE,
		/** 5紫旗 */
		PURPLE
	}

	/**
	 * 发票类型
	 * @url http://v2.guanyierp.com/admin/finance/sys_invoice_type/data/all?_dc=1495074462584
	 * @author liuyang
	 * @email y_liu@hiersun.com | 745089707@qq.com
	 */
	public enum InvoiceType {
		NONE,
		/** 普通发票 */
		PLAIN,
		/** 增值税发票 */
		VALUE_ADDED_TAX
	}
}
