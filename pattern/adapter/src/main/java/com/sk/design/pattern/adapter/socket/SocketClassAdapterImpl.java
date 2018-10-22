package com.sk.design.pattern.adapter.socket;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		return convert(getVolt(), 10);
	}

	public Volt get3Volt() {
		return convert(getVolt(), 40);
	}

	private Volt convert(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
