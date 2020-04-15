package com.jcg.java;

public class MySingelton {

	private static MySingelton instance = null;

	private MySingelton() {
		if(instance != null) {
			throw new IllegalArgumentException("error");
		}

	}

	public static MySingelton getInstance() {
		if(instance == null)
		synchronized (MySingelton.class) {
		if(instance == null) {
			instance = new MySingelton();
		}
		}
		return instance;
	}

}
