import java.util.*;

class TreeMapDemo{
	public static void main(String[]args){
		
		TreeMap tm=new TreeMap();
		tm.put("Ind", "India");
		tm.put("Pak", "Pakistan");
		tm.put("SL", "Srilanka");
		tm.put("Aus", "Australia");
		tm.put("Ban", "Bagladesh");

		System.out.println(tm);

		//subMap
		System.out.println(tm.subMap("Aus","Pak"));

		//headMap
		System.out.println(tm.headMap("Pak"));

		//tailMap
		System.out.println(tm.tailMap("Pak"));

		//firstKey
		System.out.println(tm.firstKey());

		//lastKey
		System.out.println(tm.lastKey());

		//keySet
		System.out.println(tm.keySet());	//[Aus, Ban, Ind, Pak, SL]

		//values
		System.out.println(tm.values());	//[Australia, Bagladesh, India, Pakistan, Srilanka]	

		//entrySet()
		System.out.println(tm.entrySet());	//[Aus=Australia, Ban=Bagladesh, Ind=India, Pak=Pakistan, SL=Srilanka]

	}
}
