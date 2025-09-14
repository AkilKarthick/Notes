package collectionPratice;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(5);
        pq.add(20);

        System.out.println("Priority Queue: " + pq);
        System.out.println("Removed Element: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
	}

}
