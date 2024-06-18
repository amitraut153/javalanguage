//List
//ArrayList

import java.util.*;
class ArrayListDemo{

	public static void main(String[]args){
		ArrayList al=new ArrayList();
		//add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("Amit");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);		//add(int,Elements)
		al.add(3,"Core2Web");
		System.out.println(al);
	}
}
