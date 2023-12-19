package com.ty;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext contex= new ClassPathXmlApplicationContext("conf.xml");
		
		Shop shop=(Shop)contex.getBean("shop");
		
		Map<String, Double> map=shop.getMap();
		
		 System.out.println(map);
		 
		 
	}

}
