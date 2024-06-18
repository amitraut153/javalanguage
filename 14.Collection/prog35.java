//NavigableSet
import java.util.*;
class NavigableSetDemo{

	public static void main(String[]args){
		NavigableSet ns=new TreeSet();

		ns.add(10);
		ns.add(30);
		ns.add(14);
		ns.add(27);
		ns.add(23);

		System.out.println(ns);

		//lower()
		System.out.println(ns.lower(25));

		//floor()
		System.out.println(ns.floor(23));	//23

		//ceiling()
		System.out.println(ns.ceiling(25));	//27
 
		//higher()
		System.out.println(ns.higher(27));	//30
		
		//pollfirst()
		System.out.println(ns.pollFirst());

		//descendinfSet()
		System.out.println(ns.descendingSet());

		//Iterator
		Iterator itr=ns.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//subSet()
		System.out.println(ns.subSet(10,true,27,false));
	}
}



