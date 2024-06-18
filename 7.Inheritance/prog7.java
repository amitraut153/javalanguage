class Parent{
	int x=19;

	static int y=20;
	static {

		System.out.println("In Parent static block");
	}
	
	Parent(){

		System.out.println("In Parent Constructor");
	}

	void methodOnce(){

		System.out.println(x);
		System.out.println(y);
	}

	static void methodTwo(){

		System.out.println(y);
	}
}
class Child extends Parent{
	static{

		System.out.println("In Child static block");
	}

	Child(){

		System.out.println("In Child constructor");
	}
}
class Client{

	public static void main(String[]args){
		Child obj = new Child();

		obj.methodOnce();
		obj.methodTwo();
	}
}
