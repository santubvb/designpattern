package com.sk.design.pattern.singleton.classic;

//Double Checked Locking based Java implementation of 
//singleton design pattern 
class SingletonDoubleCheckedLockng {
	private volatile static SingletonDoubleCheckedLockng obj;

	private SingletonDoubleCheckedLockng() {
	}

	public static SingletonDoubleCheckedLockng getInstance() {
		if (obj == null) {
			// To make thread safe
			synchronized (SingletonDoubleCheckedLockng.class) {
				// check again as multiple threads
				// can reach above step
				if (obj == null)
					obj = new SingletonDoubleCheckedLockng();
			}
		}
		return obj;
	}
}
