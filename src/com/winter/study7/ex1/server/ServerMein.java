package com.winter.study7.ex1.server;

public class ServerMein {

	public static void main(String[] args) {
		try {
			new ServerController().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
