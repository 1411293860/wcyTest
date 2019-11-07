package com.wcy.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wangchaoyue.StringUtils;

/**
 * @author 王超越
 *
 * 2019年11月7日
 */
public class TestStringUtils {

	@Test
	public void testIsBlank() {
		assertTrue(StringUtils.isBlank("   "));
	}
	
	@Test
	public void testIsBlank2() {
		//断言假
		assertFalse(StringUtils.isBlank("aaaa"));
	}
	
}
