import java.util.*;

class Cursordemo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("C2w");

		for(var x:al){
			System.out.println(x);
			System.out.println(x.getClass().getName());
		}	
		Iterator Cursor=al.iterator();

		while(Cursor.hasNext()){
			if("Kanha".equals(Cursor.next()))
				Cursor.remove();
		}
		System.out.println(al);

		//ListIterator
		ListIterator litr=al.listIterator();

		while(litr.hasNext()){
			System.out.println(litr.next());
		}

		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}

	/*	//Enumeration
		Enumeration cursor=al.elements();
		System.out.println(cursor.getClass().getName());

		while(cursor.hasMoreElements()){
			System.out.print(cursor.nextElement());
		}*/

	}
}
