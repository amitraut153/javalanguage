class Outer{

	void M1(){
		System.out.println("In M1-Outer");
		//Method Local Inner class
		
		class Inner{
			void M1(){
				System.out.println("In M1-Inner");
			}
		}

		Inner obj=new Inner();
		obj.M1();
	}

	void M2(){
		System.out.println("In M2- Outer");
	}

	public static void main(String[]args){

		Outer obj=new Outer();
		obj.M1();
		obj.M2();
	}
}

