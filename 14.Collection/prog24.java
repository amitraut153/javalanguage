//LinkedHashMap

import java.util.*;
class LinkedHashMapDemo{

	public static void main(String[]args){

		LinkedHashMap hm=new LinkedHashMap();

		hm.put("Badhe", "Infosys");
		hm.put("Kanha", "Barclays");
		hm.put("Badhe", "CarPro");
		hm.put("Badhe", "BMC");

		System.out.println(hm);

	}
}


