package Multithreading.threads;

import Multithreading.beans.MyStorage;

public class ProducerThread extends Thread{
	private MyStorage s;
	
	
public ProducerThread(MyStorage s) {
		super();
		this.s = s;
	}


public void run() {
	for(int i=1;i<=10;i++) {
		s.put(i+10);
	}
}
}
