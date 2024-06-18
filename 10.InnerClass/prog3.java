class Outer{
	class Inner{

		void M1(){
			System.out.println("Inner M1");
		}
	}

	void M2(){
		System.out.println("Outer-M2");
	}
	public static void main(String[]args){

		Inner obj=new Outer().new Inner();
		obj.M1();
	}
}

