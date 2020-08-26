package com.shirley.aTest.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @Description: TODO(这里用一句话描述这个类的作用)
*/
public class AssertMehtod {
	/**
	 * 根据判断assert。method进行断言
	 */
	public Boolean doAssert(String key, String value, String method) {
		try {
			if (null != key && null != value) {
				if ("equal".equals(method)) {
					if (key.equals(value))
						return true;
					else
						return false;

				}
				if ("nEqual".equals(method)) {
					if (key.equals(value))
						return false;
					else
						return true;
				}
				if ("contain".equals(method)) {
					if (key.contains(value))
						return true;
					else
						return false;
				}
				if ("nContain".equals(method)) {
					if (key.contains(value))
						return false;
					else
						return true;
				}
				if ("regular".equals(method)) {
					Pattern pattern = Pattern.compile(value);
					Matcher matcher = pattern.matcher(key);
					return matcher.matches();
				}
				if ("startwith".equals(method)) {
					return key.startsWith(value);
				}
				if ("endwith".equals(method)) {
					return key.endsWith(value);
				}
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
