//PriorityQueue
import java.util.concurrent.*;
import java.util.*;
class Employee{

	String name;
	Employee(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){

		return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
	}
}
class BlockingQueueDemo{
	public static void main(String[]args)throws InterruptedException{
		BlockingQueue bQueue=new PriorityBlockingQueue(3,new SortByName());

		bQueue.put(new Employee("Amit"));
		bQueue.put(new Employee("Kanha"));
		bQueue.put(new Employee("Rahul"));

		System.out.println(bQueue);
		bQueue.offer(new Employee("Badhe"),5,TimeUnit.SECONDS);
		System.out.println(bQueue);
	}
}


