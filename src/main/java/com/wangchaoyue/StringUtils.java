package com.wangchaoyue;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

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
	
	/**
	 * 判断源字符串是否有值,空引号也算没值;
	 * 
	 * */
	public static boolean haveValue(String str) {
		return (str==null || str.trim().equals(""));
	}
	
	/**
	 * 印证手机号码
	 * 
	 * */
	public static boolean isMobile(String str) {
		String regex = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
	}
	
	/**
	 * 校验邮件
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
	}
	
	/**
	 * 获取N位随机英文字符创
	 */
	public static String getRandomStr(int n) {
		StringBuilder sb = new StringBuilder();
		Random random= new Random();
		for (int i=0;i<n;i++) {
			char c =(char)('A'+random.nextInt(26));
			sb.append(c);
			System.out.println("c is"+c);
			System.out.println("字符串是:"+sb);
		}
		return sb.toString();
	}
	
	
	public static String getRandomStr2(int n) {
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			int r = random.nextInt(36);
			if(r<26) {
				char c = (char)('A' +  r );
				sb.append(c);
			}else {
				sb.append(r-26);
			}
			
		}
		return sb.toString();
	}
	
	public static String getRandomCn(int n ) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(getRandomCn());
		}
		return sb.toString();
	}
	
	private static char getRandomCn() {
		
		String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("  ------");
        }

        return str.charAt(0);
	}
}
