//IdentityHashMap
import java.util.*;

class IdentityHashMapDemo{
	public static void main(String[]args){

		//HashMap hm=new IdentityHashMap()
		IdentityHashMap Im=new IdentityHashMap();

		Im.put(new Integer(10),"Kanha");
		Im.put(new Integer(10),"Rahul");
		Im.put(new Integer(10),"Badhe");

		System.out.println(Im);
	}
}

