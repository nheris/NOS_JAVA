package com.winter.study7.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		ClientController controller = new ClientController();
		 
		 //start()
		 //참조변수명.멤버
		 try {
			controller.start(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
