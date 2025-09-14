package threadDemos;

public class RunnableInterfaceDemo implements Runnable{

	public void run() {
		System.out.println("runnable interface thread");
	}
	
	public static void main(String[] args) {
		
		
		RunnableInterfaceDemo ri = new RunnableInterfaceDemo();
		Thread t1 = new Thread(ri);
		t1.start();

	}

	

}
