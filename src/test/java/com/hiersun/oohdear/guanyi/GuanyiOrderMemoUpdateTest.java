package com.hiersun.oohdear.guanyi;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.guanyiyun.api.request.GuanyiOrderMemoUpdateRequest;

/**
 * 管易订单备注更新测试
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class GuanyiOrderMemoUpdateTest {

	private static final Logger logger = Logger.getLogger(GuanyiOrderMemoUpdateTest.class);

	@Test
	public void test() {
		GuanyiOrderMemoUpdateRequest request = new GuanyiOrderMemoUpdateRequest();
		request.setMemo("测试多少个汉字呀呀测试多少个汉字呀呀呀测试多少个汉字呀呀呀测试多少个汉字呀呀呀测试多少个汉字呀呀呀52");
		request.setTid("test1234567890");
		String response = request.execute();
		logger.info(response);
	}

}
