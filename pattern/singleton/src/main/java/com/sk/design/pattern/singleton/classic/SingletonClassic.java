package com.sk.design.pattern.singleton.classic;

public class SingletonClassic {

	private static SingletonClassic instance;
	
	private SingletonClassic() {
		
	}

	public static SingletonClassic getInstance() {
		if (instance == null) {
			instance = new SingletonClassic();
		}
		return instance;
	}
}
