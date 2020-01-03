package com.dsh.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRndomChineseString() {
		String s = StringUtil.randomChineseString(3);
		System.out.println(s);
	}
	
	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
