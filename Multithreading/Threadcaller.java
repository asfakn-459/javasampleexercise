package Multithreading;

public class Threadcaller {
public static void main(String [] args) throws InterruptedException{
	ChildThread ct = new ChildThread();
	ct.start();
	ct.join();
	for(int i=1; i<=5; i++)
	{
		System.out.println("Main Thread "+i);
	}
}
}
