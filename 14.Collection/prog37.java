//Priority Queue

import java.util.*;
class PQueueDemo{
	public static void main(String[]args){
		PriorityQueue pq=new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq);
		
		PriorityQueue pq1=new PriorityQueue();
 		pq1.offer("Amit");
		pq1.offer("Akshu");
		pq1.offer("Rohit");
		pq1.offer("Virat");
		pq1.offer("Msd");

		System.out.println(pq1);

	}
}
