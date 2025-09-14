package threadDemos;

public class MultThreadDemo  extends Thread{

	String task;
	
	public MultThreadDemo(String task) {
		this.task=task;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(task + " : " + i);
			try {
				  Thread.sleep(1000);
			}catch(InterruptedException  e) {
				e.getMessage();
			}
		}
	}
	public static void main(String[] args) {
		
		MultThreadDemo mtd1 = new MultThreadDemo("akil");
		MultThreadDemo mtd2 = new MultThreadDemo("karthick thread");
		
		mtd1.start(); //run in new thread
		mtd1.start();
		
		mtd1.run();//run in the main thread
		

	}

}
