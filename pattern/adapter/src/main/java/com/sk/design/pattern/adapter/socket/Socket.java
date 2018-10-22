package com.sk.design.pattern.adapter.socket;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
