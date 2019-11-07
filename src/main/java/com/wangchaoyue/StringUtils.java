package com.wangchaoyue;

/**
 * @author 王超越
 * 字符串工具类
 * 2019年11月7日
 */
public class StringUtils {
	
	/**
	 * 判断一个字符是否为空
	 * 
	 * */
		public static boolean isBlank(String str) {
			return (str==null || str.trim().equals(""));
		}
}
