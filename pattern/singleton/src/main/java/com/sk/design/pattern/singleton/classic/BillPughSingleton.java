package com.sk.design.pattern.singleton.classic;

public class BillPughSingleton {
	private static BillPughSingleton instance;
	
	private BillPughSingleton() {}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

	private static class SingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
}
