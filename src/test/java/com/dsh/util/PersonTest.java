package com.dsh.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
	
	public static void main(String[] args) throws ParseException {
		for(int i =0;i<1000;i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date parse = sdf.parse("2010-1-1");
			Person p = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120),
					StringUtil.randomChineseString(140), RandomUtil.getRandomDate(parse));
		}
	}
	
	
	
	
}
