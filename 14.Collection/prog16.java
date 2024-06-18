import java.util.*;

class MyClass implements Comparable{
	
	String str=null;
	MyClass (String str){
		
		this.str=str;
	}
	public int compareTo(Object obj){

		return 1;	//(obj.str).compareTo(this.str)
	}
	public String toString(){
		return str;
	}
}
class TreeSetDemo{

	public static void main(String[]args){
		TreeSet ts=new TreeSet();

		ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Amit"));
		ts.add(new MyClass("Raut"));
		ts.add(new MyClass("Bahadur"));
		
		System.out.println(ts);
	
	}
}
