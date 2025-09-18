package java8;

public class LamdbaThreadEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable task= ()->{
			for(int i=0; i<5; i++) {
				System.out.println("running thread" + i);
			}
		};
		
		Thread t = new Thread(task);
		t.start();
	}

}
