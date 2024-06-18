import java.util.*;
class Company implements Comparable{
	
	String empName=null;
	double empSalary=0;
	
	Company(String empName,double empSalary){
		this.empName=empName;
		this.empSalary=empSalary;
	}

	public int compareTo(Object obj){
		return -1;
	}

	public String toString(){
		return "("+empName+":"+empSalary+")";
	}
}

class CompanyInfo{
	public static void main(String[]args){
		
		TreeSet ts=new TreeSet();
		ts.add(new Company("Amit Raut",1000000.00));
		ts.add(new Company("Sumit Raut",900000.00));
		ts.add(new Company("Nilu Raut",800000.00));
		ts.add(new Company("Nikhil Takalkar",9500000.00));
		ts.add(new Company("Jay Takalkar",700000.00));

		System.out.println(ts);
	}
}
