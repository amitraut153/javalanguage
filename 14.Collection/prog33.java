//HashTableDemo{
import java.util.*;

class HashTableDemo{
	public static void main(String[]args){

		Hashtable ht=new Hashtable();

		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(45,"Rohit");
		ht.put(18,"Virat");
		ht.put(1,"KLRahul");

		System.out.println(ht);

		//Methods of Dictionary
		//keys
		Enumeration itr1=ht.keys();
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}

		//elements
		Enumeration itr2=ht.elements();
		while(itr2.hasMoreElements()){
			System.out.println(itr2.nextElement());
		}
		System.out.println(ht.get(10));
		ht.remove(1);
		System.out.println(ht);
	}
}

