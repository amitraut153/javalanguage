//methods of HashMap class
import java.util.*;
class HashMapMethods{

	public static void main(String[]args){
		HashMap hm=new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");

		System.out.println(hm);

		//get()
		System.out.println(hm.get("Python"));

		//keySet()
		System.out.println(hm.keySet());

		//Values()
		System.out.println(hm.values());

		//entrySet()
		System.out.println(hm.entrySet());
	}
}//  O/P
//  {Java=.java, Python=.py, Dart=.dart}
//.py
//[Java, Python, Dart]
//[.java, .py, .dart]
//[Java=.java, Python=.py, Dart=.dart]
		
