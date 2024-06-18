class Outer{

	class Inner{
		void M1(){
			System.out.println("In M1 Inner");
		}
	}

	void M2(){
		System.out.println("In M2-Inner");
	}
}

class Client{
	public static void main(String args[]){

		Outer obj=new Outer();
		obj.M2();

		Outer.Inner obj1=new Outer().new Inner();
		obj1.M1();
	}
}
