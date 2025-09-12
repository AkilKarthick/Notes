package threadDemos;

public class ThreadDemo1 extends Thread {

	public void run() {
		System.out.println("this is thread");
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 td1 = new ThreadDemo1();
		td1.start();

	}

}
