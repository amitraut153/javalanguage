abstract class Parent{

	void Tour(){

		System.out.println("Hydarabaad");
	}

	abstract void Place();
}

class Child extends Parent{
	void Place(){

		System.out.println("Ramoji film city");
	}
}

class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.Tour();
		obj.Place();
	}
}

