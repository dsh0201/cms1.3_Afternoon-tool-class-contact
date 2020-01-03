package com.dsh.util;


import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test() {
		int[] subRandom = RandomUtil.subRandom(5, 10, 3);
		for (int i:subRandom) {
			System.out.println(i+"");
		}
	}
	
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	
	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(5);
		System.out.println(randomString);
	}
	

}
