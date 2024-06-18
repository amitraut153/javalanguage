//Collection class

import java.util.*;
class SortDemo{
	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("Amit");
		al.add("Sumit");
		al.add("Nilesh");
		al.add("Nikhil");
		al.add("Jay");

		System.out.println(al);		//[Amit, Sumit, Nilesh, Nikhil, Jay]

		Collections.sort(al);
		System.out.println(al);	//[Amit, Jay, Nikhil, Nilesh, Sumit]
	}
}
