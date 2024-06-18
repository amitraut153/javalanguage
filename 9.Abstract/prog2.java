abstract class Parent{
	void career(){

		System.out.println("Engeering");
	}

	void marry(){

		System.out.println("Shraddha kapoor");
	}
}

class Child extends Parent{

	void marry(){

		System.out.println("Kriti");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj2=new Child();
		obj2.career();
		obj2.marry();
	}
}

