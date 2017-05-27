package com.hiersun.oohdear.guanyi;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.guanyiyun.api.request.GuanyiOrderRefundStatusUpdateRequest;

public class GuanyiOrderRefundStatusUpdateTest {

	private static final Logger logger = Logger.getLogger(GuanyiOrderRefundStatusUpdateTest.class);

	@Test
	public void test() {
		GuanyiOrderRefundStatusUpdateRequest request = new GuanyiOrderRefundStatusUpdateRequest();
		request.setOid("sub1234567890");
		request.setRefund_state(1);
		request.setTid("test1234567890");
		String response = request.execute();
		logger.info(response);
	}

}
