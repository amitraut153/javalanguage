import java.util.*;

class Movies implements Comparable{

	String movieName=null;
	float totColl=0.0f;

	Movies(String movieName, float totColl){

		this.movieName=movieName;
		this.totColl=totColl;
	}

	public int compareTo (Object obj){
		return -(movieName.compareTo(((Movies)obj).movieName));
	}

	public String toString(){
		return movieName+":"+totColl;
	}
}
class TreeSetDemo{

	public static void main(String[]args){
		TreeSet ts=new TreeSet();
		ts.add(new Movies("Gadar2",150.00f));
		ts.add(new Movies("OMG2",100.00f));
		ts.add(new Movies("Jailar",250.00f));
		ts.add(new Movies("OMG2",100.00f));

		System.out.println(ts);
	}
}

