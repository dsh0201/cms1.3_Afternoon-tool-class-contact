package com.dsh.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

/**
 * 
    * @ClassName: RandomUtil
    * @Description: TODO(工具类)
    * @author 段舒皓
    * @date 2020年1月3日
    *
 */
public class RandomUtil {

	
	// 注册日期属性值模拟2010年1月1日至今任意随机时间
	public static Date getRandomDate(Date date1) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		Date date2 = new Date();
		long time1=date1.getTime();
		long time2=date2.getTime();
		long time=(long)(Math.random()*(time2-time1)+time1);
		calendar.setTimeInMillis(time);
		Date time3 = calendar.getTime();
		
		return time3;
	}
	
	//方法1：返回min-max之间的随机整数（包含min和max值），
		//例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min,int max) {
		Random random = new Random();
		return min+(random.nextInt(max-min+1));
	}
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	//例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，
	//[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom(int min,int max,int subs) {
		HashSet<Integer> set = new HashSet<Integer>();
		int [] arr = new int[subs];
		while(set.size()<subs) {
			set.add(random(min, max));
		}
		int i =0;
		for (Integer s:set) {
			arr[i]=s;
			i++;
		}
		return arr;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		String str="123456789abcdefghijklmnopqistuvwxyz";
		Random random = new Random();
		int nextInt = random.nextInt();
		char charAt = str.charAt(nextInt);
		return charAt;
	}
	
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}
	
	
	
	
	
	
}
