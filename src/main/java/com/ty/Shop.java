package com.ty;

import java.util.Map;

public class Shop {
	
	private String name;
	
	private String item;
	
	private Map<String, Double> map;
	
	

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getMap() {
		return map;
	}

	public void setMap(Map<String, Double> map) {
		this.map = map;
	}

	public Shop(String name, Map<String, Double> map) {
		
		this.name = name;
		this.map = map;
	}
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	

}
