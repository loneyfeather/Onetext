package com.cn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class eee {

	public eee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date  date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d=sdf.format(date);
		System.out.println(d);

	}

}
