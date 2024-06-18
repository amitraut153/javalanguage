//Iterating over Map
import java.util.*;
class IteratorMapDemo{
	public static void main(String[]args){

		SortedMap sm=new TreeMap();

		sm.put("Ind","India");
		sm.put("Bz","Brazil");
		sm.put("Amr","Amerika");
		sm.put("Aus","Australia");
		sm.put("SA","SouthAfrika");

		System.out.println(sm);

		Set<Map.Entry>data=sm.entrySet();
		Iterator<Map.Entry>itr=data.iterator();

		while(itr.hasNext()){
			//System.out.println(itr.next());
			Map.Entry abc=itr.next();
			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}

