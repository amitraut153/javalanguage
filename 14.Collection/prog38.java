//Dque(Double Ended Queue)
import java.util.*;
class DqueDemo{

	public static void main(String[]args){
		Deque obj=new ArrayDeque();

		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(50);

		System.out.println(obj);
		
		//offerFirst()
		//offerLast()
		obj.offerFirst(5);
		obj.offerLast(50);
		System.out.println(obj);	//[5,10,40,20,30,50]

		//pollFirst()
		//pollLast()
		System.out.println(obj);	//[10,40,20,30]
		
		//peekFirst()
		//peekLast()
		obj.peekFirst();
		obj.peekLast();

		System.out.println(obj);

		//Iterator
		Iterator itr=obj.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

