//Map(interface)

import java.util.*;
class HashMapDemo{
	public static void main(String[]args){

		HashSet hs=new HashSet();
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs);

		HashMap hm=new HashMap();

		hm.put("Kanha","Infosys");
		hm.put("Amit","Amazon");
		hm.put("Badhe","Google");
		hm.put("Raut","Apple");
		System.out.println(hs);
	}
}
