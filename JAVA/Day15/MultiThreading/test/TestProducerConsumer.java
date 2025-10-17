package Multithreading.test;

import Multithreading.beans.MyStorage;
import Multithreading.threads.ConsumerThread;
import Multithreading.threads.ProducerThread;

public class TestProducerConsumer {
  public static void main(String[] args) {
	MyStorage s=new MyStorage();
	ProducerThread p1=new ProducerThread(s);
	ConsumerThread c1=new ConsumerThread(s);
	p1.start();
	c1.start();
}
}
