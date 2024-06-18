class Parent{
	static {

		System.out.println("In Parent static block");
	}
}
class Child extends Parent{
	static {

		System.out.println("In child static Constructor");
	}
}

class Client{
	public static void main(String[]args){

		Child obj=new Child();
		System.out.println("In main class");

	}
}
