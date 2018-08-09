package com.kuukuu.udp;

import java.net.DatagramSocket;

public class UdpScan {
	public static void main(String[] args) {
		for (int i=1024;i <=65535;i++) {
			try {
				DatagramSocket server=new DatagramSocket(i);
				server.close();
			}catch(Exception e) {
				System.out.println("the port "+i+" is open");
			}
		}
	}
}
