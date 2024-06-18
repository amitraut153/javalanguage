class C2W{
	int noOfCources=8;
	`String favCource="JavaDSA";

	void disp(){
		System.out.println(noOfCources);
		System.out.println(favCource);
	}
}
class Student{
	public static void main(String[]args){
		C2W obj=new C2W();
		obj.disp();
		System.out.println(obj.noOfCources);
		System.out.println(obj.favCource);
	}
}
