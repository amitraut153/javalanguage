class Outer{

	int x=10;
	static int y=20;

	class Inner{

		void fun2(){
			System.out.println("Fun2-Inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}
	}

	void fun1(){
		System.out.println("Fun1-Outer");
	}
}

class Client{
	public static void main(String[]args){

		Outer.Inner obj=new Outer().new Inner();
		obj.fun2();
	}
}

