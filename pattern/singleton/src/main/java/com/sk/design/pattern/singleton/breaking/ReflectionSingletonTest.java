package com.sk.design.pattern.singleton.breaking;

import java.lang.reflect.Constructor;

import com.sk.design.pattern.singleton.classic.SingletonClassic;
/*
 * This class can destroy all below singleton classes
 *  BillPughSingleton
 *  SingletonClassic
 *  SingletonClassicEagerInstantiation
 *  SingletonClassicSynchronized
 *  SingletonDoubleCheckedLocking
 *  
 */
public class ReflectionSingletonTest {

	public static void main(String [] args) 
	{
		SingletonClassic instance = SingletonClassic.getInstance();
		SingletonClassic instanceTwo = null;
		try {
			Constructor[] constructors = SingletonClassic.class.getDeclaredConstructors();
			for (Constructor con : constructors) {
				//Below code will destroy the singleton pattern
				con.setAccessible(true);
				instanceTwo = (SingletonClassic) con.newInstance();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//Different hash code
		System.out.println(instance.hashCode());
        System.out.println(instanceTwo.hashCode());
	}
	
}
