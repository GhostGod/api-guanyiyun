package com.hiersun.oohdear.guanyi;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.guanyiyun.api.request.GuanyiDeliveryQueryRequest;
import com.guanyiyun.api.response.GuanyiDeliveryQueryResponse;

/**
 * 管易查询发货单测试
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiDeliveryQueryTest {

	private static final Logger logger = Logger.getLogger(GuanyiDeliveryQueryTest.class);

	@Test
	public void test() {
		try {
			GuanyiDeliveryQueryRequest request = new GuanyiDeliveryQueryRequest();
			request.setOuter_code("18932160710812241");
			GuanyiDeliveryQueryResponse response = request.execute(GuanyiDeliveryQueryResponse.class);
			logger.info(response);
		} catch (RuntimeException e) {
			if (e.getMessage().contains("Connection refused: connect")) {
				logger.warn("Connection refused. SYNC STOP!!! Please wait!");
				return;
			} else {
				logger.error("", e);
			}
		}
	}

}
