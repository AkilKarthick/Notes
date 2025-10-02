package threadDemos;



public class Counter {
	private int count =0;
	
//	Without synchronization, both threads (t1 and t2) might access and update the count variable concurrently, causing race conditions
	//The synchronized keyword in your code ensures that only one thread at a time
//	synchronized creates a critical section so that when one thread is executing increment(), all other threads trying to call this method on the same object will wait.
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

class MyThread extends Thread{
	private Counter counter;
	
	public MyThread(Counter counter) {
		this.counter=counter;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			counter.increment();
		}
	}

}

