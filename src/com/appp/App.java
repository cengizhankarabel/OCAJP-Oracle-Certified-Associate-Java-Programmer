package com.appp;

class Running implements Runnable {
 	public void run() {
		// code of run method
	}
}

public class App {
	public static void main(String[] args) {
		Running r = new Running ();
		Thread t = new Thread(r);
		t.start();
		System.out.print(t.getState() + " ");
		try{
			t.sleep(100);
			System.out.print(t.getState());
		}
		catch(InterruptedException e) {
		   e.printStackTrace();
        }
	}
}
