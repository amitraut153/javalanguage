class Parent{
	Parent(){

		System.out.println("In Parent constructor");
	}

	void parentProperty(){
		System.out.println("Flat, Car, Gold");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In Child contructor");
	}
}

class Client{
	public static void main(String[]args){

		Child obj2=new Child();
		obj2.parentProperty();
	}
}

