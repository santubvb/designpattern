package com.sk.design.pattern.adapter.socket;

public class SocketObjectAdapterImpl implements SocketAdapter {
	private Socket socket = new Socket();

	public Volt get120Volt() {
		return socket.getVolt();
	}

	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
