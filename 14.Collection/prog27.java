//weakHashMap
import java.util.*;
class Demo{

	String str;
	Demo(String str){
		this.str=str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){
		System.out.println("Notify");
	}
}

class GCDemo{
	public static void main(String[]args){

		Demo obj1=new Demo("Core@web");
		Demo obj2=new Demo("Biencaps");
		Demo obj3=new Demo("Incubator");

		WeakHashMap hm=new WeakHashMap();

		hm.put(obj1, 2016);
		hm.put(obj2, 2019);
		hm.put(obj3, 2023);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1=null;
		obj2=null;


		System.gc();
		System.out.println(hm);

		System.out.println("In main");
	}
}


