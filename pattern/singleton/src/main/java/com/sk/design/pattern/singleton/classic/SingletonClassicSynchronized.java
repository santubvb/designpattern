package com.sk.design.pattern.singleton.classic;

public class SingletonClassicSynchronized {

	private static SingletonClassicSynchronized instance;
	
	private SingletonClassicSynchronized() {
		
	}

	public static synchronized SingletonClassicSynchronized getInstance() {
		if (instance == null) {
			instance = new SingletonClassicSynchronized();
		}
		return instance;
	}
}
