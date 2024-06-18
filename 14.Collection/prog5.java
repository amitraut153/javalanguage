import java.util.*;

class Demo{

	int srNo=0;
	String name=null;

	Demo(int srNo,String name){
		this.srNo=srNo;
		this.name=name;
	}
	public String toString(){
		return srNo+":"+name;
	}
}
class LinkedListDemo{

	public static void main(String[]args){
		LinkedList ll=new LinkedList();
		
		ll.add(new Demo(1,"Amit"));
		ll.add(new Demo(2,"Nilu"));
		ll.add(new Demo(3,"Sumit"));

		System.out.println(ll);
	}
}
