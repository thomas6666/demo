package com.example.forygsoft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.data.redis.connection.srp.SrpConnection;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //System.out.println(strToDate("2017-10-11 23:43:33"));
		//System.out.println(dateToStr(new Date()));
		//System.out.println(longDateToStr(System.currentTimeMillis()));
		//testCompareDate();
		testCalendar();
	}

	public static Date strToDate(String strDate){
		Date date=null;
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date=format.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String dateToStr(Date date){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=format.format(date);
		return str;
	}
	
	public static String longDateToStr(long date){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(date);
		String str=format.format(calendar.getTime());
		return str;
	}
	
	public static void testCompareDate(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date bt=format.parse("2016-10-3");
			Date et=format.parse("2017-09-8");
			if(bt.before(et)){
				System.out.println("bt 小于 et");
			}
			else if(bt.equals(et)){
				System.out.println("bt 相等 et");
			}
			else{
				System.out.println("bt 大于 et");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void testCalendar() {
	    // 创建日期
	    Calendar now1 = Calendar.getInstance();
	    // 通过日期和毫秒数设置Calendar
	    now1.setTime(new Date());
	    now1.setTimeInMillis(new Date().getTime());
	    // 日期月份减1个月
	    now1.add(Calendar.MONTH, -1);
	    // 定义日期的中文输出格式,并输出日期
	    SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 E",
	                                                  Locale.CHINA);
	    System.out.println("获取日期中文格式化化输出：" + df.format(now1.getTime()));
	    System.out.println("获取年：" + now1.get(Calendar.YEAR));
	    System.out.println("获取月(月份是从0开始的)：" + now1.get(Calendar.MONTH));
	    System.out.println("获取日：" + now1.get(Calendar.DAY_OF_MONTH));
	    System.out.println("获取时：" + now1.get(Calendar.HOUR));
	    System.out.println("获取分：" + now1.get(Calendar.MINUTE));
	    System.out.println("获取秒：" + now1.get(Calendar.SECOND));
	    System.out.println("获取上午、下午：" + now1.get(Calendar.AM_PM));
	}

	
}
