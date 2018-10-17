package com.sk.design.pattern.singleton.classic;

public class SingletonClassicEagerInstantiation {

	private static SingletonClassicEagerInstantiation instance = new SingletonClassicEagerInstantiation();
	
	private SingletonClassicEagerInstantiation() {
		
	}

	public static  SingletonClassicEagerInstantiation getInstance() {
		return instance;
	}
}
