import java.util.*;

class ArrayListDemo extends ArrayList{
	public static void main(String[]args){

		ArrayListDemo al=new ArrayListDemo();

		//add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("Amit");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		//add(int,Elements)
		al.add(3,"Core2Web");
		System.out.println(al);

		//size()
		System.out.println(al.size());

		//contains(Object)
		System.out.println(al.contains("Amit"));//true
		System.out.println(al.contains("Shashi"));//false

		//indexOf(Object)
		System.out.println(al.indexOf(10));
		System.out.println(al.indexOf(20.5));

		//lastIndexOf(Object
		System.out.println(al.lastIndexOf(20.5f));

		//get(int)
		System.out.println(al.get(3));

		//set(index,Incubator)
		System.out.println(al.set(3,"Incubator"));
		System.out.println(al);

		//addAll(collection)
		ArrayList al2=new ArrayList();
		al2.add("Salman");
		al2.add("Shahrukh");
		al2.add("Amir");

		al.addAll(al2);
		System.out.println(al);

		//addAll(index,collection)
		al.addAll(3,al2);
		System.out.println(al);

		//removeRange(3,5)
		al.removeRange(3,5);
		System.out.println(al);
		
		//remove(int)	
		System.out.println(al.remove(3));
		System.out.println(al);

		//toArray()
		Object arr[]=al.toArray();
		System.out.println(arr);

		//Object[]toArray()
		Object arr2[]=al.toArray();
		for(Object data:arr2){
			System.out.println(data+" ");
		}

		System.out.println();

		//clear()
		al.clear();
		System.out.println(al);
	}
}
